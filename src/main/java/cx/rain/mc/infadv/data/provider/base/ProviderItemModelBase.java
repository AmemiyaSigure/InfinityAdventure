package cx.rain.mc.infadv.data.provider.base;

import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public abstract class ProviderItemModelBase extends ItemModelProvider {
    public ProviderItemModelBase(DataGenerator generator, String modid, ExistingFileHelper existingHelper) {
        super(generator, modid, existingHelper);
    }

    protected void simpleItem(Item item, ResourceLocation texture) {
        singleTexture(item.getRegistryName().getPath(), mcLoc("generated"), "layer0", texture);
    }

    protected void simpleBlockItem(Item blockItem, ResourceLocation texture) {
        cubeAll(blockItem.getRegistryName().getPath(), texture);
    }

    protected void handheld(Item handheldItem, ResourceLocation texture) {
        singleTexture(handheldItem.getRegistryName().getPath(), mcLoc("handheld"), "layer0", texture);
    }
}
