package wards;

import java.util.ArrayList;
import java.util.List;

public class WardsConfigDefaults {
	public static final List<String> ACCEPTED_ITEMS = new ArrayList<String>();
	public static final List<String> POWER_SOURCES = new ArrayList<String>();
	public static final List<String> COMBAT_ENCHANTMENTS = new ArrayList<String>();
	public static final List<String> FORTITUDE_ENCHANTMENTS = new ArrayList<String>();
	public static final List<String> FIRE_ENCHANTMENTS = new ArrayList<String>();
	public static final List<String> WATER_ENCHANTMENTS = new ArrayList<String>();
	public static final List<String> LUCK_ENCHANTMENTS = new ArrayList<String>();
	public static final List<String> DESTRUCTION_ENCHANTMENTS = new ArrayList<String>();
	public static final List<String> SLAYER_ENCHANTMENTS = new ArrayList<String>();
	public static final List<String> HASTE_ENCHANTMENTS = new ArrayList<String>();
	public static final List<String> KNOWLEDGE_ENCHANTMENTS = new ArrayList<String>();
	public static final List<String> CURSE_ENCHANTMENTS = new ArrayList<String>();
	
	static {
		ACCEPTED_ITEMS.add("minecraft:enchanted_book");
		POWER_SOURCES.add("minecraft:lapis_lazuli-12000");
		POWER_SOURCES.add("minecraft:enchanted_paper-18000");
		addTo(COMBAT_ENCHANTMENTS, "minecraft:sharpness", "minecraft:knockback", "minecraft:power", "minecraft:punch", "minecraft:riptide");
		addTo(FORTITUDE_ENCHANTMENTS, "minecraft:protection", "minecraft:projectile_protection", "minecraft:thorns", "minecraft:unbreaking", "minecraft:feather_falling");
		addTo(FIRE_ENCHANTMENTS, "minecraft:fire_protection", "minecraft:fire_aspect", "minecraft:flame");
		addTo(WATER_ENCHANTMENTS, "minecraft:respiration", "minecraft:aqua_affinity", "minecraft:depth_strider", "minecraft:frost_walker");
		addTo(LUCK_ENCHANTMENTS, "minecraft:looting", "minecraft:silk_touch", "minecraft:fortune", "minecraft:luck_of_the_sea", "minecraft:lure");
		addTo(DESTRUCTION_ENCHANTMENTS, "minecraft:blast_protection", "minecraft:multishot", "minecraft:sweeping", "minecraft:channeling");
		addTo(SLAYER_ENCHANTMENTS, "minecraft:smite", "minecraft:bane_of_arthropods", "minecraft:impaling", "minecraft:piercing");
		addTo(HASTE_ENCHANTMENTS, "minecraft:efficiency", "minecraft:quick_charge");
		addTo(KNOWLEDGE_ENCHANTMENTS, "minecraft:infinity", "minecraft:mending", "minecraft:loyalty");
		addTo(CURSE_ENCHANTMENTS, "minecraft:binding_curse", "minecraft:vanishing_curse");
	}
	
	@SafeVarargs
	public static <T> void addTo(List<T> list, T... objects) {
		for(T obj : objects) {
			list.add(obj);
		}
	}
}