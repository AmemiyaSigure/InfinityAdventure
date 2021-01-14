package cx.rain.mc.infadv.world;

import cx.rain.mc.infadv.world.config.FeatureConfigs;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.OreFeature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class ModFeatures {
    public static final ConfiguredFeature<?, ?> ORE_AQUAMARINE = new ConfiguredFeature<>(new OreFeature(OreFeatureConfig.CODEC), FeatureConfigs.ORE_AQUAMARINE).range(128).square().func_242731_b(10);
}
