package cx.rain.mc.infadv.event;

import cx.rain.mc.infadv.InfinityAdventure;
import cx.rain.mc.infadv.utility.IFeatured;
import cx.rain.mc.infadv.utility.enums.ItemFeature;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = InfinityAdventure.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EventAttackUndead {
    @SubscribeEvent
    public void onLivingDamage(LivingDamageEvent event) {
        if (event.getSource().getTrueSource() instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) event.getSource().getTrueSource();
            if (player.getHeldItemMainhand().getItem() instanceof IFeatured) {
                IFeatured item = (IFeatured) player.getHeldItemMainhand().getItem();
                if (item.getFeature().contains(ItemFeature.IS_SACRED)) {
                    if (event.getEntityLiving().isEntityUndead()) {
                        event.setAmount(event.getAmount() * 1.25f);
                    }
                }
            }
        }
    }
}
