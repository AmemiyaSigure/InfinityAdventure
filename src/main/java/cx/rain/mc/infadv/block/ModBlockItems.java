package cx.rain.mc.infadv.block;

import cx.rain.mc.infadv.InfinityAdventure;
import cx.rain.mc.infadv.group.ModGroups;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlockItems {
    public static final DeferredRegister<Item> BLOCK_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, InfinityAdventure.MODID);

    public ModBlockItems(IEventBus bus) {
        BLOCK_ITEMS.register(bus);
    }

    // BlockItems below here.
    public static final RegistryObject<Item> SILVER_ORE = BLOCK_ITEMS.register("silver_ore", () -> new BlockItem(ModBlocks.SILVER_ORE.get(), new Item.Properties().group(ModGroups.ORES).setNoRepair()));
    public static final RegistryObject<Item> RUBY_ORE = BLOCK_ITEMS.register("ruby_ore", () -> new BlockItem(ModBlocks.RUBY_ORE.get(), new Item.Properties().group(ModGroups.ORES).setNoRepair()));
    public static final RegistryObject<Item> MITHRIL_ORE = BLOCK_ITEMS.register("mithril_ore", () -> new BlockItem(ModBlocks.MITHRIL_ORE.get(), new Item.Properties().group(ModGroups.ORES).setNoRepair()));
    public static final RegistryObject<Item> ADAMANTINE_ORE = BLOCK_ITEMS.register("adamantine_ore", () -> new BlockItem(ModBlocks.ADAMANTINE_ORE.get(), new Item.Properties().group(ModGroups.ORES).setNoRepair()));
    public static final RegistryObject<Item> AQUAMARINE_ORE = BLOCK_ITEMS.register("aquamarine_ore", () -> new BlockItem(ModBlocks.AQUAMARINE_ORE.get(), new Item.Properties().group(ModGroups.ORES).setNoRepair()));
}
