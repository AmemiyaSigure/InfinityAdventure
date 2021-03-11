package cx.rain.mc.infadv.item;

import cx.rain.mc.infadv.InfinityAdventure;
import cx.rain.mc.infadv.group.ModGroups;
import cx.rain.mc.infadv.item.base.*;
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

    public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword", () -> new ItemSwordBase(ModTiers.SILVER, 3, -2.4f, EnumSet.of(ItemFeature.IS_SACRED), 1));
    public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe", () -> new ItemPickaxeBase(ModTiers.SILVER, 1, -2.8f, EnumSet.of(ItemFeature.IS_SACRED), 0));
    public static final RegistryObject<Item> SILVER_AXE = ITEMS.register("silver_axe", () -> new ItemAxeBase(ModTiers.SILVER, 4, -3.1f, EnumSet.of(ItemFeature.IS_SACRED), 1));
    public static final RegistryObject<Item> SILVER_SHOVEL = ITEMS.register("silver_shovel", () -> new ItemShovelBase(ModTiers.SILVER, 1.5f, -3.0f, EnumSet.of(ItemFeature.IS_SACRED), 0));
    public static final RegistryObject<Item> SILVER_HOE = ITEMS.register("silver_hoe", () -> new ItemHoeBase(ModTiers.SILVER, -1, -3.0f, EnumSet.of(ItemFeature.IS_SACRED), 0));

    public static final RegistryObject<Item> MITHRIL_SWORD = ITEMS.register("mithril_sword", () -> new ItemSwordBase(ModTiers.MITHRIL, 3, -1.4f, EnumSet.of(ItemFeature.IS_SACRED), 1));
    public static final RegistryObject<Item> MITHRIL_PICKAXE = ITEMS.register("mithril_pickaxe", () -> new ItemPickaxeBase(ModTiers.MITHRIL, 1, -2.6f, EnumSet.of(ItemFeature.IS_SACRED), 0));
    public static final RegistryObject<Item> MITHRIL_AXE = ITEMS.register("mithril_axe", () -> new ItemAxeBase(ModTiers.MITHRIL, 4, -3.0f, EnumSet.of(ItemFeature.IS_SACRED), 1));
    public static final RegistryObject<Item> MITHRIL_SHOVEL = ITEMS.register("mithril_shovel", () -> new ItemShovelBase(ModTiers.MITHRIL, 1.5f, -2.8f, EnumSet.of(ItemFeature.IS_SACRED), 0));
    public static final RegistryObject<Item> MITHRIL_HOE = ITEMS.register("mithril_hoe", () -> new ItemHoeBase(ModTiers.MITHRIL, -1, -2.8f, EnumSet.of(ItemFeature.IS_SACRED), 0));

    public static final RegistryObject<Item> ADAMANTINE_SWORD = ITEMS.register("adamantine_sword", () -> new ItemSwordBase(ModTiers.ADAMANTINE, 3, -3.9f, EnumSet.of(ItemFeature.ANTI_CORRUPTION), 1));
    public static final RegistryObject<Item> ADAMANTINE_PICKAXE = ITEMS.register("adamantine_pickaxe", () -> new ItemPickaxeBase(ModTiers.ADAMANTINE, 1, -3.9f, EnumSet.of(ItemFeature.ANTI_CORRUPTION), 1));
    public static final RegistryObject<Item> ADAMANTINE_AXE = ITEMS.register("adamantine_axe", () -> new ItemAxeBase(ModTiers.ADAMANTINE, 5, -3.9f, EnumSet.of(ItemFeature.ANTI_CORRUPTION), 1));
    public static final RegistryObject<Item> ADAMANTINE_SHOVEL = ITEMS.register("adamantine_shovel", () -> new ItemShovelBase(ModTiers.ADAMANTINE, 1.5f, -3.9f, EnumSet.of(ItemFeature.ANTI_CORRUPTION), 1));
    public static final RegistryObject<Item> ADAMANTINE_HOE = ITEMS.register("adamantine_hoe", () -> new ItemHoeBase(ModTiers.ADAMANTINE, -2, -3.9f, EnumSet.of(ItemFeature.ANTI_CORRUPTION), 1));
}
