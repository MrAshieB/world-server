package com.rs.game.content.world

import com.rs.game.World
import com.rs.game.model.entity.player.Player
import com.rs.game.model.`object`.GameObject
import com.rs.lib.util.Utils
import com.rs.plugin.annotations.ServerStartupEvent
import com.rs.plugin.kts.onObjectClick
import com.rs.utils.Ticks

enum class RegrowablePickables(val itemId: Int, val animId: Int, val respawnTime: Int, val playerLockTime: Int, val objectIds: IntArray) {
    CADAVA_BUSH(753, 2280, 60, 1, intArrayOf(23625, 23626, 23627)),
    REDBERRY_BUSH(1951, 2280, 60, 1, intArrayOf(23628, 23629, 23630)),
    BANANA_TREE(1963, 827, 30, 1, intArrayOf(2073, 2074, 2075, 2076, 2077, 2078));
}

@ServerStartupEvent
fun mapPickables() {
    onObjectClick("Flax", "Cabbage", "Potato", "Wheat", "Onion", "Pineapple Plant") { (player, obj, option) ->
        if (option == "Pick") {
            when (obj.getDefinitions(player).name) {
                "Flax" -> pick(player, obj, 1779)
                "Cabbage" -> pick(player, obj, 1965)
                "Potato" -> pick(player, obj, 1942)
                "Wheat" -> pick(player, obj, 1947)
                "Onion" -> pick(player, obj, 1957)
                "Pineapple Plant" -> pick(player, obj, 2114)
            }
        }
    }

    for (pickable in RegrowablePickables.values()) {
        for (objectId in pickable.objectIds) {
            onObjectClick(objectId) { (player, obj) ->
                val itemName = when {
                    pickable.name.endsWith("TREE") -> "bananas"
                    pickable.name.endsWith("BUSH") -> "berries"
                    else -> "items"
                }
                if (obj.id == pickable.objectIds.last()) {
                    player.sendMessage("There are no $itemName left on this ${if (pickable.name.endsWith("TREE")) "tree" else "bush"}.")
                    player.sendMessage("More will grow soon.")
                    return@onObjectClick
                }
                if (player.inventory.hasFreeSlots()) {
                    player.lock(pickable.playerLockTime)
                    player.anim(pickable.animId)
                    player.inventory.addItem(pickable.itemId, 1)
                    obj.setId(obj.id + 1)
                    obj.tasks.scheduleTimer(
                        "regrow",
                        Ticks.fromSeconds(pickable.respawnTime),
                        Ticks.fromSeconds(pickable.respawnTime)
                    ) regrowTimer@{
                        if (obj.id > obj.originalId)
                            obj.setId(obj.id - 1)
                        else
                            return@regrowTimer false
                        return@regrowTimer true
                    }
                } else {
                    player.sendMessage("Your inventory is too full to pick the $itemName from this ${if (pickable.name.endsWith("TREE")) "tree" else "bush"}.")
                    return@onObjectClick
                }
            }
        }
    }
}

private fun pick(player: Player, obj: GameObject, itemId: Int) {
    if (obj.id == 1413) {
        player.sendMessage("There aren't any pineapples left to pick.")
        return
    }
    if (player.inventory.addItem(itemId, 1)) {
        player.anim(827)
        player.lock(2)
        when (itemId) {
            1799 -> if (Utils.random(5) == 0) World.removeObjectTemporary(obj, Ticks.fromMinutes(1))
            2114 -> if (Utils.random(5) == 0) obj.setIdTemporary(1413, Ticks.fromMinutes(1))
            else -> World.removeObjectTemporary(obj, Ticks.fromMinutes(1))
        }
    }
}