package cx.rain.mc.infadv.data.provider;

import cx.rain.mc.infadv.InfinityAdventure;
import cx.rain.mc.infadv.block.BlockItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ProviderItemModel extends ItemModelProvider {
    public ProviderItemModel(DataGenerator generator, ExistingFileHelper existingHelper) {
        super(generator, InfinityAdventure.MODID, existingHelper);
    }

    @Override
    protected void registerModels() {
        cubeAll("silver_ore", new ResourceLocation(InfinityAdventure.MODID, "block/silver_ore"));
        cubeAll("mithril_ore", new ResourceLocation(InfinityAdventure.MODID, "block/mithril_ore"));
        cubeAll("adamantine_ore", new ResourceLocation(InfinityAdventure.MODID, "block/adamantine_ore"));
        cubeAll("aquamarine_ore", new ResourceLocation(InfinityAdventure.MODID, "block/aquamarine_ore"));
    }
}
