package cx.rain.mc.infadv.item.base;

import cx.rain.mc.infadv.InfinityAdventure;
import cx.rain.mc.infadv.group.ModGroups;
import cx.rain.mc.infadv.utility.IFeatured;
import cx.rain.mc.infadv.utility.IHasTooltip;
import cx.rain.mc.infadv.utility.enums.ItemFeature;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.text.*;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.EnumSet;
import java.util.List;

public class ItemSwordBase extends SwordItem implements IFeatured, IHasTooltip {
    private EnumSet<ItemFeature> features;
    private int tooltipLines;

    public ItemSwordBase(IItemTier tier, int attackDamageIn, float attackSpeedIn,
                         EnumSet<ItemFeature> featuresIn, int tooltipLinesIn) {
        super(tier, attackDamageIn, attackSpeedIn,
                new Properties().group(ModGroups.COMBAT_AND_TOOLS));
        features = featuresIn;
        tooltipLines = tooltipLinesIn;
    }

    @Override
    public EnumSet<ItemFeature> getFeature() {
        return features;
    }

    @Override
    public List<ITextComponent> addTooltip(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        for (int i = 0; i < tooltipLines; i++) {
            tooltip.add(new TranslationTextComponent(
                    "tooltip." + InfinityAdventure.MODID + "." + getRegistryName().getPath() + "." + i)
                    .mergeStyle(TextFormatting.GRAY));
        }
        return tooltip;
    }
}
