package cx.rain.mc.infadv.data.provider;

import cx.rain.mc.infadv.InfinityAdventure;
import cx.rain.mc.infadv.block.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ProviderBlockState extends BlockStateProvider {
    public ProviderBlockState(DataGenerator generator, ExistingFileHelper existingHelper) {
        super(generator, InfinityAdventure.MODID, existingHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.SILVER_ORE.get());
        simpleBlock(ModBlocks.RUBY_ORE.get());
        simpleBlock(ModBlocks.MITHRIL_ORE.get());
        simpleBlock(ModBlocks.ADAMANTINE_ORE.get());
        simpleBlock(ModBlocks.AQUAMARINE_ORE.get());
    }
}
