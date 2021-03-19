package cx.rain.mc.infadv.world.dimension;

import cx.rain.mc.infadv.InfinityAdventure;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.Dimension;
import net.minecraft.world.DimensionType;
import net.minecraft.world.gen.DimensionSettings;
import net.minecraft.world.gen.settings.DimensionStructuresSettings;

public class ModDimensions {
    public static final ResourceLocation SKY_LAND_ID = new ResourceLocation(InfinityAdventure.MODID, "sky_land");
    public static final RegistryKey<Dimension> SKY_LAND_DIMENSION = RegistryKey.getOrCreateKey(Registry.DIMENSION_KEY, SKY_LAND_ID);
    public static final RegistryKey<DimensionType> SKY_LAND_TYPE = RegistryKey.getOrCreateKey(Registry.DIMENSION_TYPE_KEY, SKY_LAND_ID);
    public static final RegistryKey<DimensionSettings> SKY_LAND_SETTINGS = RegistryKey.getOrCreateKey(Registry.NOISE_SETTINGS_KEY, SKY_LAND_ID);

    //private static final DimensionStructuresSettings SKY_LAND_STRUCTURE_SETTINGS = new DimensionStructuresSettings();
}
