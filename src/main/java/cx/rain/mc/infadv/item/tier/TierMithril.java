package cx.rain.mc.infadv.item.tier;

import cx.rain.mc.infadv.item.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public class TierMithril implements IItemTier {
    @Override
    public int getMaxUses() {
        return 1024;
    }

    @Override
    public float getEfficiency() {
        return 5.0f;
    }

    @Override
    public float getAttackDamage() {
        return 3.0f;
    }

    @Override
    public int getHarvestLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 30;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(ModItems.MITHRIL_INGOT.get());
    }
}
