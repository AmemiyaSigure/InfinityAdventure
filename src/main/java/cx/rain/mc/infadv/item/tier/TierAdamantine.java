package cx.rain.mc.infadv.item.tier;

import cx.rain.mc.infadv.item.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public class TierAdamantine implements IItemTier {
    @Override
    public int getMaxUses() {
        return 2048;
    }

    @Override
    public float getEfficiency() {
        return 0.1f;
    }

    @Override
    public float getAttackDamage() {
        return 3.5f;
    }

    @Override
    public int getHarvestLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 25;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(ModItems.ADAMANTINE_INGOT.get());
    }
}
