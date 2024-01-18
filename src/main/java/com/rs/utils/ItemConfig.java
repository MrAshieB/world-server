package com.rs.utils;

import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;
import com.rs.lib.file.JsonFileManager;
import com.rs.lib.game.Item;
import com.rs.lib.util.Logger;
import com.rs.lib.util.Utils;
import com.rs.plugin.annotations.PluginEventHandler;
import com.rs.plugin.annotations.ServerStartupEvent;
import com.rs.plugin.annotations.ServerStartupEvent.Priority;
import it.unimi.dsi.fastutil.ints.Int2IntMap;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@PluginEventHandler
public class ItemConfig {
	private static Map<Integer, ItemConfig> CONFIG_CACHE = new HashMap<>();
	private static final Map<String, Integer> UID_TO_ID = new HashMap<>();
	private final static String PATH = "./data/items/config.json";
	
	private String uidName;
	private int dropSound;
	private int equipSound;
	private Int2IntMap attackAnims;
	private Int2IntMap attackSounds;
	private int defendAnim;
	private int defendSound;
	private double weight;
	private String examine;
	
	@ServerStartupEvent(Priority.FILE_IO)
	public static void init() throws JsonIOException, IOException {
		if (new File(PATH).exists())
			CONFIG_CACHE = JsonFileManager.loadJsonFile(new File(PATH), new TypeToken<Map<Integer, ItemConfig>>(){}.getType());
		else
			Logger.error(ItemConfig.class, "init", "No item config file found at " + PATH + "!");
		for (int key : CONFIG_CACHE.keySet()) {
			if (UID_TO_ID.get(CONFIG_CACHE.get(key).uidName) != null)
				Logger.error(ItemConfig.class, "init", "Duplicate item uid names " + CONFIG_CACHE.get(key).uidName + " - " + key);
			UID_TO_ID.put(CONFIG_CACHE.get(key).uidName, key);
		}
	}

	public ItemConfig() {
		
	}
	
	public int getDropSound() {
		return dropSound <= 0 ? 2739 : dropSound;
	}

	public int getEquipSound() {
		return equipSound <= 0 ? 2240 : equipSound;
	}

	/**
	 * TODO
	 * Dump all sounds into the config
	 * Dump all existing anims into the config
	 * Automatically dump any equippable item that is wieldable but does not have an animation
	 */

	public int getAttackSound(int attackStyleIndex) {
		return attackSounds == null ? -1 : attackSounds.getOrDefault(attackStyleIndex, attackSounds.get(0));
	}

	public int getDefendSound() {
		return defendSound <= 0 ? 2240 : defendSound;
	}

	public int getAttackAnim(int attackStyleIndex) {
		return attackAnims == null ? 422 : attackAnims.getOrDefault(attackStyleIndex, attackAnims.get(0));
	}

	public int getDefendAnim() {
		return defendAnim;
	}

	public double getWeight(boolean equipped) {
		if (weight < 0.0) {
			if (equipped)
				return weight;
			return 0;
		}
		return weight;
	}
	
	public String getUidName() {
		return uidName;
	}

	public String getExamine(Item item) {
		if (item.getAmount() >= 100000)
			return Utils.formatNumber(item.getAmount()) + " x " + item.getDefinitions().getName() + ".";
		if (item.getDefinitions().isNoted())
			return "Swap this note at any bank for the equivalent item.";
		return examine;
	}
	
	public static ItemConfig get(int itemId) {
		return CONFIG_CACHE.get(itemId);
	}
	
	public static ItemConfig get(Item item) {
		return CONFIG_CACHE.get(item.getId());
	}
	
	public static int forUid(String uid) {
		if (UID_TO_ID.get(uid) == null)
			throw new IllegalArgumentException("No item with UID " + uid + " found in item configuration.");
		return UID_TO_ID.get(uid);
	}
}
