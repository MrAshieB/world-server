// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
//  Copyright (C) 2021 Trenton Kress
//  This file is part of project: Darkan
//
package com.rs.game.content.skills.mining;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DepletedOres {

	private static final Map<Integer, Integer> ORE_MAP = new HashMap<>();
	private static final Set<Integer> DEPLETED_ORES = new HashSet<>();

	static {
		ORE_MAP.put(25368, 25371);
		ORE_MAP.put(61181, 61184);
		ORE_MAP.put(2561, 10585);
		ORE_MAP.put(15576, 15582);
		ORE_MAP.put(15579, 15582);
		ORE_MAP.put(31167, 15582);
		ORE_MAP.put(31170, 15582);
		ORE_MAP.put(31173, 15582);
		ORE_MAP.put(2609, 14832);
		ORE_MAP.put(2704, 18961);
		ORE_MAP.put(14850, 14832);
		ORE_MAP.put(14853, 14832);
		ORE_MAP.put(14856, 14832);
		ORE_MAP.put(14859, 14832);
		ORE_MAP.put(14862, 14832);
		ORE_MAP.put(14902, 14892);
		ORE_MAP.put(14904, 14892);
		ORE_MAP.put(14906, 14892);
		ORE_MAP.put(14913, 14892);
		ORE_MAP.put(16998, 14892);
		ORE_MAP.put(17001, 14892);
		ORE_MAP.put(72075, 72078);
		ORE_MAP.put(72081, 72084);
		ORE_MAP.put(72087, 72089);
		ORE_MAP.put(72092, 72095);
		ORE_MAP.put(72098, 72101);
		ORE_MAP.put(9708, 9723);
		ORE_MAP.put(9711, 9723);
		ORE_MAP.put(9714, 9723);
		ORE_MAP.put(9717, 9723);
		ORE_MAP.put(9720, 9723);
		ORE_MAP.put(32449, 32447);
		ORE_MAP.put(32451, 32447);
		ORE_MAP.put(19012, 19009);
		ORE_MAP.put(19018, 19009);
		ORE_MAP.put(19024, 19009);
		ORE_MAP.put(3043, 3431);
		ORE_MAP.put(12564, 3431);
		ORE_MAP.put(32426, 33400);
		ORE_MAP.put(32429, 33400);
		ORE_MAP.put(32432, 33400);
		ORE_MAP.put(32435, 33400);
		ORE_MAP.put(32438, 33400);
		ORE_MAP.put(32441, 33400);
		ORE_MAP.put(32444, 33400);
		ORE_MAP.put(33078, 33400);
		ORE_MAP.put(37637, 37639);
		ORE_MAP.put(37638, 37639);
		ORE_MAP.put(37642, 37639);
		ORE_MAP.put(37645, 37639);
		ORE_MAP.put(10577, 10580);
		ORE_MAP.put(11930, 10580);
		ORE_MAP.put(11933, 10580);
		ORE_MAP.put(11936, 10580);
		ORE_MAP.put(11939, 10580);
		ORE_MAP.put(11942, 10580);
		ORE_MAP.put(37304, 10580);
		ORE_MAP.put(37307, 10580);
		ORE_MAP.put(37310, 10580);
		ORE_MAP.put(37670, 10580);
		ORE_MAP.put(5766, 5763);
		ORE_MAP.put(5768, 5763);
		ORE_MAP.put(5770, 5763);
		ORE_MAP.put(5773, 5763);
		ORE_MAP.put(5776, 5763);
		ORE_MAP.put(5779, 5763);
		ORE_MAP.put(5782, 5763);
		ORE_MAP.put(5784, 5763);
		ORE_MAP.put(11183, 37700);
		ORE_MAP.put(11186, 37700);
		ORE_MAP.put(11189, 37700);
		ORE_MAP.put(37208, 37700);
		ORE_MAP.put(11948, 11555);
		ORE_MAP.put(11951, 11555);
		ORE_MAP.put(11954, 11555);
		ORE_MAP.put(11957, 11555);
		ORE_MAP.put(11960, 11555);
		ORE_MAP.put(11963, 11555);
		ORE_MAP.put(15503, 11555);
		ORE_MAP.put(10948, 10944);
		ORE_MAP.put(10574, 19003);
		ORE_MAP.put(18991, 19003);
		ORE_MAP.put(18994, 19003);
		ORE_MAP.put(18997, 19003);
		ORE_MAP.put(19000, 19003);
		ORE_MAP.put(6669, 6947);
		ORE_MAP.put(6943, 6947);
		ORE_MAP.put(6945, 6947);
		ORE_MAP.put(2090, 450);
		ORE_MAP.put(2092, 450);
		ORE_MAP.put(2094, 450);
		ORE_MAP.put(2096, 450);
		ORE_MAP.put(2098, 450);
		ORE_MAP.put(2100, 450);
		ORE_MAP.put(2102, 450);
		ORE_MAP.put(2104, 450);
		ORE_MAP.put(2108, 450);
		ORE_MAP.put(21275, 450);
		ORE_MAP.put(21278, 450);
		ORE_MAP.put(21281, 450);
		ORE_MAP.put(21284, 450);
		ORE_MAP.put(21287, 450);
		ORE_MAP.put(21293, 450);
		ORE_MAP.put(29215, 17026);
		ORE_MAP.put(29221, 17026);
		ORE_MAP.put(29224, 17026);
		ORE_MAP.put(29227, 17026);
		ORE_MAP.put(29230, 17026);
		ORE_MAP.put(29233, 17026);
		ORE_MAP.put(29236, 17026);
		ORE_MAP.put(45067, 17026);
		ORE_MAP.put(45069, 17026);
		ORE_MAP.put(15246, 15249);
		ORE_MAP.put(3229, 3281);
		ORE_MAP.put(3233, 3281);
		ORE_MAP.put(3245, 3281);
		ORE_MAP.put(3273, 3281);
		ORE_MAP.put(3280, 3281);
		ORE_MAP.put(59427, 3281);
		ORE_MAP.put(25370, 25373);
		ORE_MAP.put(61183, 61186);
		ORE_MAP.put(33221, 33223);
		ORE_MAP.put(15578, 15584);
		ORE_MAP.put(15581, 15584);
		ORE_MAP.put(31169, 15584);
		ORE_MAP.put(2611, 14834);
		ORE_MAP.put(14852, 14834);
		ORE_MAP.put(14855, 14834);
		ORE_MAP.put(14858, 14834);
		ORE_MAP.put(14864, 14834);
		ORE_MAP.put(17000, 17009);
		ORE_MAP.put(17003, 17009);
		ORE_MAP.put(72077, 72080);
		ORE_MAP.put(72083, 72086);
		ORE_MAP.put(72088, 72091);
		ORE_MAP.put(72094, 72097);
		ORE_MAP.put(72100, 72103);
		ORE_MAP.put(9710, 9725);
		ORE_MAP.put(9713, 9725);
		ORE_MAP.put(9716, 9725);
		ORE_MAP.put(9719, 9725);
		ORE_MAP.put(9722, 9725);
		ORE_MAP.put(19014, 19011);
		ORE_MAP.put(19020, 19011);
		ORE_MAP.put(19026, 19011);
		ORE_MAP.put(3042, 33402);
		ORE_MAP.put(12566, 33402);
		ORE_MAP.put(32428, 33402);
		ORE_MAP.put(32431, 33402);
		ORE_MAP.put(32434, 33402);
		ORE_MAP.put(32437, 33402);
		ORE_MAP.put(32440, 33402);
		ORE_MAP.put(32443, 33402);
		ORE_MAP.put(32446, 33402);
		ORE_MAP.put(37644, 31061);
		ORE_MAP.put(37647, 31061);
		ORE_MAP.put(10579, 10582);
		ORE_MAP.put(11932, 10582);
		ORE_MAP.put(11935, 10582);
		ORE_MAP.put(11938, 10582);
		ORE_MAP.put(11941, 10582);
		ORE_MAP.put(11944, 10582);
		ORE_MAP.put(37306, 10582);
		ORE_MAP.put(37309, 10582);
		ORE_MAP.put(37312, 10582);
		ORE_MAP.put(5772, 5765);
		ORE_MAP.put(5775, 5765);
		ORE_MAP.put(5778, 5765);
		ORE_MAP.put(5781, 5765);
		ORE_MAP.put(5783, 5765);
		ORE_MAP.put(5786, 5765);
		ORE_MAP.put(11185, 37702);
		ORE_MAP.put(11188, 37702);
		ORE_MAP.put(11191, 37702);
		ORE_MAP.put(11947, 11557);
		ORE_MAP.put(11950, 11557);
		ORE_MAP.put(11953, 11557);
		ORE_MAP.put(11956, 11557);
		ORE_MAP.put(11959, 11557);
		ORE_MAP.put(11962, 11557);
		ORE_MAP.put(15505, 11557);
		ORE_MAP.put(10576, 19005);
		ORE_MAP.put(18993, 19005);
		ORE_MAP.put(18996, 19005);
		ORE_MAP.put(18999, 19005);
		ORE_MAP.put(19002, 19005);
		ORE_MAP.put(6671, 452);
		ORE_MAP.put(2091, 452);
		ORE_MAP.put(2093, 452);
		ORE_MAP.put(2095, 452);
		ORE_MAP.put(2097, 452);
		ORE_MAP.put(2099, 452);
		ORE_MAP.put(2101, 452);
		ORE_MAP.put(2103, 452);
		ORE_MAP.put(2105, 452);
		ORE_MAP.put(2109, 452);
		ORE_MAP.put(21277, 21298);
		ORE_MAP.put(21280, 21298);
		ORE_MAP.put(21283, 21298);
		ORE_MAP.put(21286, 21298);
		ORE_MAP.put(21289, 21298);
		ORE_MAP.put(21295, 21298);
		ORE_MAP.put(29217, 29220);
		ORE_MAP.put(29223, 29220);
		ORE_MAP.put(29226, 29220);
		ORE_MAP.put(29229, 29220);
		ORE_MAP.put(29235, 29220);
		ORE_MAP.put(15248, 15251);
		ORE_MAP.put(3027, 3227);
		ORE_MAP.put(3032, 3227);
		ORE_MAP.put(3038, 3227);
		ORE_MAP.put(3040, 3227);
		ORE_MAP.put(3041, 3227);
		ORE_MAP.put(59426, 3227);
		ORE_MAP.put(25369, 25372);
		ORE_MAP.put(61182, 61185);
		ORE_MAP.put(25369, 25372);
		ORE_MAP.put(61182, 61185);
		ORE_MAP.put(15577, 15583);
		ORE_MAP.put(15580, 15583);
		ORE_MAP.put(31168, 15583);
		ORE_MAP.put(31174, 15583);
		ORE_MAP.put(2610, 14833);
		ORE_MAP.put(14851, 14833);
		ORE_MAP.put(14854, 14833);
		ORE_MAP.put(14857, 14833);
		ORE_MAP.put(14860, 14833);
		ORE_MAP.put(14863, 14833);
		ORE_MAP.put(14903, 14893);
		ORE_MAP.put(14905, 14893);
		ORE_MAP.put(14907, 14893);
		ORE_MAP.put(16999, 14893);
		ORE_MAP.put(17002, 14893);
		ORE_MAP.put(14914, 14916);
		ORE_MAP.put(72076, 72079);
		ORE_MAP.put(72082, 72085);
		ORE_MAP.put(72093, 72096);
		ORE_MAP.put(72099, 72102);
		ORE_MAP.put(9709, 9724);
		ORE_MAP.put(9718, 9724);
		ORE_MAP.put(32450, 32448);
		ORE_MAP.put(32452, 32448);
		ORE_MAP.put(19013, 19010);
		ORE_MAP.put(19019, 19010);
		ORE_MAP.put(19025, 19010);
		ORE_MAP.put(32427, 33401);
		ORE_MAP.put(32430, 33401);
		ORE_MAP.put(32433, 33401);
		ORE_MAP.put(32436, 33401);
		ORE_MAP.put(32439, 33401);
		ORE_MAP.put(32442, 33401);
		ORE_MAP.put(32445, 33401);
		ORE_MAP.put(33079, 33401);
		ORE_MAP.put(37643, 31060);
		ORE_MAP.put(37646, 31060);
		ORE_MAP.put(10578, 10581);
		ORE_MAP.put(11931, 11553);
		ORE_MAP.put(11934, 11553);
		ORE_MAP.put(11937, 11553);
		ORE_MAP.put(11943, 11553);
		ORE_MAP.put(37305, 11553);
		ORE_MAP.put(37308, 11553);
		ORE_MAP.put(5767, 5764);
		ORE_MAP.put(5769, 5764);
		ORE_MAP.put(5771, 5764);
		ORE_MAP.put(5774, 5764);
		ORE_MAP.put(5777, 5764);
		ORE_MAP.put(5780, 5764);
		ORE_MAP.put(5785, 5764);
		ORE_MAP.put(11184, 37701);
		ORE_MAP.put(11187, 37701);
		ORE_MAP.put(11190, 37701);
		ORE_MAP.put(11946, 11556);
		ORE_MAP.put(11949, 11556);
		ORE_MAP.put(11952, 11556);
		ORE_MAP.put(11955, 11556);
		ORE_MAP.put(11958, 11556);
		ORE_MAP.put(11961, 11556);
		ORE_MAP.put(11964, 11556);
		ORE_MAP.put(15504, 11556);
		ORE_MAP.put(10949, 10945);
		ORE_MAP.put(10575, 19004);
		ORE_MAP.put(18992, 19004);
		ORE_MAP.put(18995, 19004);
		ORE_MAP.put(18998, 19004);
		ORE_MAP.put(19001, 19004);
		ORE_MAP.put(6670, 6948);
		ORE_MAP.put(6944, 6948);
		ORE_MAP.put(6946, 6948);
		ORE_MAP.put(21276, 21297);
		ORE_MAP.put(21279, 21297);
		ORE_MAP.put(21282, 21297);
		ORE_MAP.put(21285, 21297);
		ORE_MAP.put(21288, 21297);
		ORE_MAP.put(21294, 21297);
		ORE_MAP.put(29216, 29219);
		ORE_MAP.put(29222, 29219);
		ORE_MAP.put(29225, 29219);
		ORE_MAP.put(29231, 29219);
		ORE_MAP.put(45068, 29219);
		ORE_MAP.put(45070, 29219);
		ORE_MAP.put(15247, 15250);
		ORE_MAP.put(20420, 20442);
		ORE_MAP.put(70102, 20442);
		ORE_MAP.put(20412, 20442);
		ORE_MAP.put(20445, 20442);
		ORE_MAP.put(20448, 20442);
		ORE_MAP.put(20416, 20442);
		ORE_MAP.put(20418, 20441);
		ORE_MAP.put(20410, 20441);
		ORE_MAP.put(20422, 20441);
		ORE_MAP.put(20443, 20441);
		ORE_MAP.put(20446, 20441);
		ORE_MAP.put(20449, 20441);
		ORE_MAP.put(20414, 20441);
		ORE_MAP.put(20407, 20440);
		ORE_MAP.put(20421, 20440);
		ORE_MAP.put(20413, 20440);
		ORE_MAP.put(20425, 20440);
		ORE_MAP.put(20408, 20440);
		ORE_MAP.put(20417, 20440);
		ORE_MAP.put(20419, 20439);
		ORE_MAP.put(20411, 20439);
		ORE_MAP.put(20423, 20439);
		ORE_MAP.put(20444, 20439);
		ORE_MAP.put(20447, 20439);
		ORE_MAP.put(20450, 20439);
		ORE_MAP.put(20415, 20439);
		ORE_MAP.put(5989, 5992);
		ORE_MAP.put(34976, 5992);
		ORE_MAP.put(34977, 5992);
		ORE_MAP.put(11195, 11366);
		ORE_MAP.put(17005, 11366);
		ORE_MAP.put(11180, 11192);
		ORE_MAP.put(11194, 11365);
		ORE_MAP.put(17004, 11365);
		ORE_MAP.put(11179, 11182);
		ORE_MAP.put(11364, 11367);
		ORE_MAP.put(17006, 11367);
		ORE_MAP.put(11181, 11193);
		ORE_MAP.put(42868, 42869);
		ORE_MAP.put(42865, 42866);
		ORE_MAP.put(42862, 42863);
		ORE_MAP.put(29746, 29747);
		ORE_MAP.put(10946, 2551);
		ORE_MAP.put(10947, 2560);
		ORE_MAP.put(4027, 4029);
		ORE_MAP.put(4028, 4029);
		ORE_MAP.put(17962, 17965);

        DEPLETED_ORES.addAll(ORE_MAP.values());
	}

	public static int get(int id) {
		if (ORE_MAP.get(id) != null)
			return ORE_MAP.get(id);
		return 11555;
	}

	public static boolean isDepleted(int id) {
		return DEPLETED_ORES.contains(id);
	}

}
