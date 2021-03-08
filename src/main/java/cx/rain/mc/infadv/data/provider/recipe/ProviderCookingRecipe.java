package cx.rain.mc.infadv.data.provider.recipe;

import cx.rain.mc.infadv.block.ModBlocks;
import cx.rain.mc.infadv.data.provider.base.ProviderRecipeBase;
import cx.rain.mc.infadv.item.ModItems;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Consumer;

public class ProviderCookingRecipe extends ProviderRecipeBase {
    public ProviderCookingRecipe(DataGenerator gen) {
        super(gen);
    }

    @Override
    protected void registerCookingRecipes(Consumer<IFinishedRecipe> consumer) {
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ModBlocks.RUBY_ORE.get().asItem()), ModItems.RUBY.get(), 1.0f, 200).addCriterion("get_ruby_ore", hasItem(ModBlocks.RUBY_ORE.get())).build(consumer, "ruby_from_smelting");
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ModBlocks.SILVER_ORE.get().asItem()), ModItems.SILVER_INGOT.get(), 1.0f, 200).addCriterion("get_silver_ore", hasItem(ModBlocks.SILVER_ORE.get())).build(consumer, "silver_from_smelting");
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ModBlocks.MITHRIL_ORE.get().asItem()), ModItems.MITHRIL_INGOT.get(), 1.0f, 200).addCriterion("get_mithril_ore", hasItem(ModBlocks.MITHRIL_ORE.get())).build(consumer, "mithril_from_smelting");
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ModBlocks.ADAMANTINE_ORE.get().asItem()), ModItems.ADAMANTINE_INGOT.get(), 2.0f, 200).addCriterion("get_adamantine_ore", hasItem(ModBlocks.ADAMANTINE_ORE.get())).build(consumer, "adamantine_from_smelting");
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ModBlocks.AQUAMARINE_ORE.get().asItem()), ModItems.AQUAMARINE.get(), 0.5f, 200).addCriterion("get_aquamarine_ore", hasItem(ModBlocks.AQUAMARINE_ORE.get())).build(consumer, "aquamarine_from_smelting");
    }
}
