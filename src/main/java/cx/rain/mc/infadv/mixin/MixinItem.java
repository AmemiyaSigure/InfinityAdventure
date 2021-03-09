package cx.rain.mc.infadv.mixin;

import cx.rain.mc.infadv.utility.IHasTooltip;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import javax.annotation.Nullable;
import java.util.List;

@Mixin(Item.class)
public abstract class MixinItem {
    @Inject(method = "addInformation", at = @At("HEAD"))
    public void beforeAddInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip,
                                     ITooltipFlag flagIn, CallbackInfo ci) {
        System.out.println("1");

        if (this instanceof IHasTooltip) {
            System.out.println("2");

            IHasTooltip item = (IHasTooltip) this;

            tooltip.addAll(item.addTooltip(stack, worldIn, tooltip, flagIn));
        }
    }
}
