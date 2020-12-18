package cx.rain.mc.infadv.data.provider;

import cx.rain.mc.infadv.InfinityAdventure;
import cx.rain.mc.infadv.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ProviderBlockState extends BlockStateProvider {
    public ProviderBlockState(DataGenerator generator, ExistingFileHelper existingHelper) {
        super(generator, InfinityAdventure.MODID, existingHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(Blocks.SILVER_ORE.get());
        simpleBlock(Blocks.MITHRIL_ORE.get());
        simpleBlock(Blocks.ADAMANTINE_ORE.get());
        simpleBlock(Blocks.AQUAMARINE_ORE.get());
    }
}
