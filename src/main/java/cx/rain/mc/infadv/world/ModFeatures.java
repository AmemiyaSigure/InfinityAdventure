package cx.rain.mc.infadv.world;

import cx.rain.mc.infadv.world.config.FeatureConfigs;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.OreFeature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;

public class ModFeatures {
    public static final ConfiguredFeature<?, ?> ORE_AQUAMARINE_MOUNTAIN = new ConfiguredFeature<>(new OreFeature(OreFeatureConfig.CODEC), FeatureConfigs.ORE_AQUAMARINE).withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(60, 0, 144))).square().func_242731_b(10);
    public static final ConfiguredFeature<?, ?> ORE_AQUAMARINE_OCEAN = new ConfiguredFeature<>(new OreFeature(OreFeatureConfig.CODEC), FeatureConfigs.ORE_AQUAMARINE).withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(30, 0, 64))).square().func_242731_b(12);
}
