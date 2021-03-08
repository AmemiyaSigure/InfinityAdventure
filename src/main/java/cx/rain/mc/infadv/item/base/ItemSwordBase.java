package cx.rain.mc.infadv.item.base;

import cx.rain.mc.infadv.group.ModGroups;
import cx.rain.mc.infadv.utility.enums.ItemFeature;
import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;

import java.util.EnumSet;

public class ItemSwordBase extends SwordItem implements IFeatured {
    private EnumSet<ItemFeature> features;

    public ItemSwordBase(IItemTier tier, int attackDamageIn, float attackSpeedIn, EnumSet<ItemFeature> featuresIn) {
        super(tier, attackDamageIn, attackSpeedIn,
                new Properties().group(ModGroups.COMBAT_AND_TOOLS));
        features = featuresIn;
    }

    @Override
    public EnumSet<ItemFeature> getFeature() {
        return features;
    }
}
