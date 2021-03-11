package cx.rain.mc.infadv.item.base;

import cx.rain.mc.infadv.InfinityAdventure;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ItemHasTooltipBase extends Item {
    private int tooltipLines;

    public ItemHasTooltipBase(Properties properties, int tooltipLinesIn) {
        super(properties);

        tooltipLines = tooltipLinesIn;
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
