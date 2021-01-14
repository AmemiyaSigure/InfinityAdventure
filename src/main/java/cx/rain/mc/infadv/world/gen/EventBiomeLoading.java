package cx.rain.mc.infadv.world.gen;

import cx.rain.mc.infadv.InfinityAdventure;
import cx.rain.mc.infadv.world.ModFeatures;
import net.minecraft.util.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

@Mod.EventBusSubscriber(modid = InfinityAdventure.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EventBiomeLoading {
    @SubscribeEvent
    public static void onBiomeLoading(BiomeLoadingEvent event) {
        BiomeGenerationSettingsBuilder gen = event.getGeneration();
        RegistryKey<Biome> biome = RegistryKey.getOrCreateKey(ForgeRegistries.Keys.BIOMES,
                Objects.requireNonNull(event.getName(),
                        "Who registered null name biome, naming criticism!"));

        if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.OVERWORLD)) {
            if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MOUNTAIN)) {
                gen.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ModFeatures.ORE_AQUAMARINE);
            }
        }
    }
}
