package cx.rain.mc.infadv.item.tier;

import cx.rain.mc.infadv.item.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public class TierSilver implements IItemTier {
    @Override
    public int getMaxUses() {
        return 520;
    }

    @Override
    public float getEfficiency() {
        return 4.0f;
    }

    @Override
    public float getAttackDamage() {
        return 2.5f;
    }

    @Override
    public int getHarvestLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 12;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(ModItems.SILVER_INGOT.get());
    }
}
