package wards;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Name;
import net.minecraftforge.common.config.Config.Type;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = Wards.MODID, name = Wards.NAME, type = Type.INSTANCE)
public class WardsConfig
{
	@Name("Ward Damage Multiplier")
	@Comment({
		"All damage by a ward is multiplied by this value",
		"e.g. a multiplier of 1.5 is 150% damage",
		"Note: this value can be changed at any time, even while playing"
	})
    public static float damageMultiplier = 1.0F;
    
    @Name("Accepted Items")
    @Comment({
        "The items from which enchantments can be pulled off of",
        "e.g. 'minecraft:stick', 'minecraft:wool:11', or 'minecraft:stone:*'",
        "Note: this value can be changed at any time, even while playing"
    })
    public static String[] acceptedItems = {"minecraft:book", "minecraft:enchanted_book", "quark:ancient_tome"};

    @Name("Power Sources")
    @Comment({
        "Power sources for wards, with configurable power",
        "e.g. 'minecraft:dye:3;10000', 'minecraft:cobblestone:*;5000', or 'minecraft:coal;15000'",
        "Note: this value can be changed at any time, even while playing"
    })
    public static String[] powerSources = {"minecraft:dye:11;10000", "wards:enchanted_paper;15000"};
	
	@Mod.EventBusSubscriber
	public static class ConfigEventHandler
	{
		@SubscribeEvent
		public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event)
		{
			if(event.getModID().equals(Wards.MODID))
			{
				ConfigManager.sync(Wards.MODID, Type.INSTANCE);
			}
		}
	}
}
