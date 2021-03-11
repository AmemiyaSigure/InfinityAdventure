package cx.rain.mc.infadv.data.provider;

import cx.rain.mc.infadv.InfinityAdventure;
import cx.rain.mc.infadv.block.ModBlockItems;
import cx.rain.mc.infadv.data.provider.base.ProviderItemModelBase;
import cx.rain.mc.infadv.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ProviderItemModel extends ProviderItemModelBase {
    public ProviderItemModel(DataGenerator generator, ExistingFileHelper existingHelper) {
        super(generator, InfinityAdventure.MODID, existingHelper);
    }

    @Override
    protected void registerModels() {
        simpleBlockItem(ModBlockItems.SILVER_ORE.get(), modLoc("block/silver_ore"));
        simpleBlockItem(ModBlockItems.RUBY_ORE.get(), modLoc("block/ruby_ore"));
        simpleBlockItem(ModBlockItems.MITHRIL_ORE.get(), modLoc("block/mithril_ore"));
        simpleBlockItem(ModBlockItems.ADAMANTINE_ORE.get(), modLoc("block/adamantine_ore"));
        simpleBlockItem(ModBlockItems.AQUAMARINE_ORE.get(), modLoc("block/aquamarine_ore"));

        simpleItem(ModItems.SILVER_INGOT.get(), modLoc("item/silver_ingot"));
        simpleItem(ModItems.RUBY.get(), modLoc("item/ruby"));
        simpleItem(ModItems.MITHRIL_INGOT.get(), modLoc("item/mithril_ingot"));
        simpleItem(ModItems.ADAMANTINE_INGOT.get(), modLoc("item/adamantine_ingot"));
        simpleItem(ModItems.AQUAMARINE.get(), modLoc("item/aquamarine"));

        handheld(ModItems.SILVER_SWORD.get(), modLoc("item/silver_sword"));
        handheld(ModItems.SILVER_PICKAXE.get(), modLoc("item/silver_pickaxe"));
        handheld(ModItems.SILVER_AXE.get(), modLoc("item/silver_axe"));
        handheld(ModItems.SILVER_SHOVEL.get(), modLoc("item/silver_shovel"));
        handheld(ModItems.SILVER_HOE.get(), modLoc("item/silver_hoe"));

        handheld(ModItems.MITHRIL_SWORD.get(), modLoc("item/mithril_sword"));
        handheld(ModItems.MITHRIL_PICKAXE.get(), modLoc("item/mithril_pickaxe"));
        handheld(ModItems.MITHRIL_AXE.get(), modLoc("item/mithril_axe"));
        handheld(ModItems.MITHRIL_SHOVEL.get(), modLoc("item/mithril_shovel"));
        handheld(ModItems.MITHRIL_HOE.get(), modLoc("item/mithril_hoe"));

        handheld(ModItems.ADAMANTINE_SWORD.get(), modLoc("item/adamantine_sword"));
        handheld(ModItems.ADAMANTINE_PICKAXE.get(), modLoc("item/adamantine_pickaxe"));
        handheld(ModItems.ADAMANTINE_AXE.get(), modLoc("item/adamantine_axe"));
        handheld(ModItems.ADAMANTINE_SHOVEL.get(), modLoc("item/adamantine_shovel"));
        handheld(ModItems.ADAMANTINE_HOE.get(), modLoc("item/adamantine_hoe"));
    }
}
