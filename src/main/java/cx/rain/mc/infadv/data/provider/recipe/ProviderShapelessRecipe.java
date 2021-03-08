package cx.rain.mc.infadv.data.provider.recipe;

import cx.rain.mc.infadv.data.provider.base.ProviderRecipeBase;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;

import java.util.function.Consumer;

public class ProviderShapelessRecipe extends ProviderRecipeBase {
    public ProviderShapelessRecipe(DataGenerator gen) {
        super(gen);
    }

    @Override
    protected void registerShapelessRecipes(Consumer<IFinishedRecipe> consumer) {

    }
}
