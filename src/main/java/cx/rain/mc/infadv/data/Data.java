package cx.rain.mc.infadv.data;

import cx.rain.mc.infadv.InfinityAdventure;
import cx.rain.mc.infadv.data.provider.ProviderBlockState;
import cx.rain.mc.infadv.data.provider.ProviderItemModel;
import cx.rain.mc.infadv.data.provider.language.ProviderLanguageZHCN;
import cx.rain.mc.infadv.data.provider.recipe.ProviderCookingRecipe;
import cx.rain.mc.infadv.data.provider.recipe.ProviderShapedRecipe;
import cx.rain.mc.infadv.data.provider.recipe.ProviderShapelessRecipe;
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
            generator.addProvider(new ProviderItemModel(generator, existingHelper));
        }

        if (event.includeServer()) {
            generator.addProvider(new ProviderShapedRecipe(generator));
            generator.addProvider(new ProviderShapelessRecipe(generator));
            generator.addProvider(new ProviderCookingRecipe(generator));
        }

        generator.addProvider(new ProviderLanguageZHCN(generator));
    }
}
