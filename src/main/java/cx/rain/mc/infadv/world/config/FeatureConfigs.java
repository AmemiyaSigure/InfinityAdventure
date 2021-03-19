package cx.rain.mc.infadv.world.config;

import cx.rain.mc.infadv.block.ModBlocks;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class FeatureConfigs {
    public static final OreFeatureConfig ORE_RUBY = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.RUBY_ORE.get().getDefaultState(), 5);
    public static final OreFeatureConfig ORE_SILVER = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.SILVER_ORE.get().getDefaultState(), 8);
    public static final OreFeatureConfig ORE_MITHRIL = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.MITHRIL_ORE.get().getDefaultState(), 3);
    public static final OreFeatureConfig ORE_ADAMANTINE = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.ADAMANTINE_ORE.get().getDefaultState(), 2);
    public static final OreFeatureConfig ORE_AQUAMARINE = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.AQUAMARINE_ORE.get().getDefaultState(), 6);
}
