package cx.rain.mc.infadv.item.base;

import cx.rain.mc.infadv.InfinityAdventure;
import cx.rain.mc.infadv.group.ModGroups;
import cx.rain.mc.infadv.utility.IFeatured;
import cx.rain.mc.infadv.utility.enums.ItemFeature;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.EnumSet;
import java.util.List;

public class ItemHoeBase extends HoeItem implements IFeatured {
    private EnumSet<ItemFeature> features;
    private int tooltipLines;

    public ItemHoeBase(IItemTier tier, int attackDamageIn, float attackSpeedIn,
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
    public void addInformation(ItemStack stack, @Nullable World worldIn,
                               List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        for (int i = 1; i <= tooltipLines; i++) {
            tooltip.add(new TranslationTextComponent(
                    "tooltip." + InfinityAdventure.MODID + "." + getRegistryName().getPath() + "." + i)
                    .mergeStyle(TextFormatting.GRAY));
        }
    }
}
