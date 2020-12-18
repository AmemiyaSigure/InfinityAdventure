package cx.rain.mc.infadv.data;

import cx.rain.mc.infadv.InfinityAdventure;
import cx.rain.mc.infadv.data.provider.ProviderBlockState;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = InfinityAdventure.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Data {
    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingHelper = event.getExistingFileHelper();

        if (event.includeClient()) {
            generator.addProvider(new ProviderBlockState(generator, existingHelper));
        }

        if (event.includeServer()) {

        }
    }
}
