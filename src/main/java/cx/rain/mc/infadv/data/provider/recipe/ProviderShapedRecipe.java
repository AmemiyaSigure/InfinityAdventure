package cx.rain.mc.infadv.data.provider.recipe;

import cx.rain.mc.infadv.data.provider.base.ProviderRecipeBase;
import cx.rain.mc.infadv.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Items;

import java.util.function.Consumer;

public class ProviderShapedRecipe extends ProviderRecipeBase {
    public ProviderShapedRecipe(DataGenerator gen) {
        super(gen);
    }

    @Override
    protected void registerShapedRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shapedRecipe(ModItems.SILVER_SWORD.get()).key('S', ModItems.SILVER_INGOT.get()).key('/', Items.STICK).patternLine("S").patternLine("S").patternLine("/").addCriterion("get_silver_ingot", hasItem(ModItems.SILVER_INGOT.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ModItems.MITHRIL_SWORD.get()).key('M', ModItems.MITHRIL_SWORD.get()).key('/', Items.STICK).patternLine("M").patternLine("M").patternLine("/").addCriterion("get_mithril_ingot", hasItem(ModItems.MITHRIL_INGOT.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ModItems.ADAMANTINE_SWORD.get()).key('A', ModItems.ADAMANTINE_INGOT.get()).key('/', Items.STICK).patternLine("A").patternLine("A").patternLine("/").addCriterion("get_adamantine_ingot", hasItem(ModItems.ADAMANTINE_INGOT.get())).build(consumer);
    }
}
