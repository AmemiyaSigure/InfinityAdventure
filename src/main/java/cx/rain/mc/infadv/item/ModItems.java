package cx.rain.mc.infadv.item;

import cx.rain.mc.infadv.InfinityAdventure;
import cx.rain.mc.infadv.group.ModGroups;
import cx.rain.mc.infadv.item.base.ItemSwordBase;
import cx.rain.mc.infadv.item.tier.ModTiers;
import cx.rain.mc.infadv.utility.enums.ItemFeature;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.EnumSet;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, InfinityAdventure.MODID);

    public ModItems(IEventBus bus) {
        ITEMS.register(bus);
    }

    // Items below here.
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties().group(ModGroups.ORES).setNoRepair()));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties().group(ModGroups.ORES).setNoRepair()));
    public static final RegistryObject<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot", () -> new Item(new Item.Properties().group(ModGroups.ORES).setNoRepair()));
    public static final RegistryObject<Item> ADAMANTINE_INGOT = ITEMS.register("adamantine_ingot", () -> new Item(new Item.Properties().group(ModGroups.ORES).setNoRepair()));
    public static final RegistryObject<Item> AQUAMARINE = ITEMS.register("aquamarine", () -> new Item(new Item.Properties().group(ModGroups.ORES).setNoRepair()));

    public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword", () -> new ItemSwordBase(ModTiers.SILVER, 3, -2.4f, EnumSet.of(ItemFeature.IS_SACRED)));

    public static final RegistryObject<Item> MITHRIL_SWORD = ITEMS.register("mithril_sword", () -> new ItemSwordBase(ModTiers.MITHRIL, 3, -1.4f, EnumSet.of(ItemFeature.IS_SACRED)));

    public static final RegistryObject<Item> ADAMANTINE_SWORD = ITEMS.register("adamantine_sword", () -> new ItemSwordBase(ModTiers.ADAMANTINE, 4, -3.9f, EnumSet.of(ItemFeature.ANTI_CORRUPTION)));
}
