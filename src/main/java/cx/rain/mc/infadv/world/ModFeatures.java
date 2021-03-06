package cx.rain.mc.infadv.world;

import cx.rain.mc.infadv.world.config.FeatureConfigs;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;

public class ModFeatures {
    public static final ConfiguredFeature<?, ?> ORE_RUBY = new ConfiguredFeature<>(new OreFeature(OreFeatureConfig.CODEC), FeatureConfigs.ORE_RUBY).withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(10, 0, 40))).square().count(4);
    public static final ConfiguredFeature<?, ?> ORE_SILVER = new ConfiguredFeature<>(new OreFeature(OreFeatureConfig.CODEC), FeatureConfigs.ORE_SILVER).range(32).square().count(2);
    public static final ConfiguredFeature<?, ?> ORE_SILVER_EXTRA = new ConfiguredFeature<>(new OreFeature(OreFeatureConfig.CODEC), FeatureConfigs.ORE_SILVER).withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(32, 32, 80))).square().count(20);
    public static final ConfiguredFeature<?, ?> ORE_MITHRIL = new ConfiguredFeature<>(new OreFeature(OreFeatureConfig.CODEC), FeatureConfigs.ORE_MITHRIL).withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(5, 0, 40))).square().count(4);
    public static final ConfiguredFeature<?, ?> ORE_ADAMANTINE = new ConfiguredFeature<>(new OreFeature(OreFeatureConfig.CODEC), FeatureConfigs.ORE_ADAMANTINE).withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(5, 0, 15))).square().count(2);
    public static final ConfiguredFeature<?, ?> ORE_AQUAMARINE_MOUNTAIN = new ConfiguredFeature<>(new OreFeature(OreFeatureConfig.CODEC), FeatureConfigs.ORE_AQUAMARINE).withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(60, 0, 144))).square().count(10);
    public static final ConfiguredFeature<?, ?> ORE_AQUAMARINE_OCEAN = new ConfiguredFeature<>(new OreFeature(OreFeatureConfig.CODEC), FeatureConfigs.ORE_AQUAMARINE).withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(30, 0, 64))).square().count(12);
}
