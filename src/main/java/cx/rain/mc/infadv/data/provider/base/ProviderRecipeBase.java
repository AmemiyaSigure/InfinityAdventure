package cx.rain.mc.infadv.data.provider.base;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public abstract class ProviderRecipeBase extends RecipeProvider implements IConditionBuilder {
    public ProviderRecipeBase(DataGenerator gen) {
        super(gen);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        registerShapedRecipes(consumer);
        registerShapelessRecipes(consumer);
        registerCookingRecipes(consumer);
    }

    protected void registerShapedRecipes(Consumer<IFinishedRecipe> consumer) {
    }

    protected void registerShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
    }

    protected void registerCookingRecipes(Consumer<IFinishedRecipe> consumer) {
    }
}
