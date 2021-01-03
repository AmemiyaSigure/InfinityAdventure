package cx.rain.mc.infadv.data.provider;

import cx.rain.mc.infadv.InfinityAdventure;
import cx.rain.mc.infadv.block.BlockItems;
import cx.rain.mc.infadv.item.Items;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ProviderItemModel extends ItemModelProvider {
    public ProviderItemModel(DataGenerator generator, ExistingFileHelper existingHelper) {
        super(generator, InfinityAdventure.MODID, existingHelper);
    }

    protected void simpleItem(Item item, ResourceLocation texture) {
        singleTexture(item.getRegistryName().getPath(), mcLoc("generated"), "layer0", texture);
    }

    protected void simpleBlockItem(Item blockItem, ResourceLocation texture) {
        cubeAll(blockItem.getRegistryName().getPath(), texture);
    }

    @Override
    protected void registerModels() {
        simpleBlockItem(BlockItems.SILVER_ORE.get(), modLoc("block/silver_ore"));
        simpleBlockItem(BlockItems.RUBY_ORE.get(), modLoc("block/ruby_ore"));
        simpleBlockItem(BlockItems.MITHRIL_ORE.get(), modLoc("block/mithril_ore"));
        simpleBlockItem(BlockItems.ADAMANTINE_ORE.get(), modLoc("block/adamantine_ore"));
        simpleBlockItem(BlockItems.AQUAMARINE_ORE.get(), modLoc("block/aquamarine_ore"));

        simpleItem(Items.SILVER_INGOT.get(), modLoc("item/silver_ingot"));
        simpleItem(Items.RUBY.get(), modLoc("item/ruby"));
        simpleItem(Items.MITHRIL_INGOT.get(), modLoc("item/mithril_ingot"));
        simpleItem(Items.ADAMANTINE_INGOT.get(), modLoc("item/adamantine_ingot"));
        simpleItem(Items.AQUAMARINE.get(), modLoc("item/aquamarine"));
    }
}
