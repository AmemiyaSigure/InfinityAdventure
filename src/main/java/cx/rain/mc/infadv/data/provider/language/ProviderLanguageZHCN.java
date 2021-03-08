package cx.rain.mc.infadv.data.provider.language;

import cx.rain.mc.infadv.InfinityAdventure;
import cx.rain.mc.infadv.block.ModBlocks;
import cx.rain.mc.infadv.data.provider.base.ProviderLanguageBase;
import cx.rain.mc.infadv.group.ModGroups;
import cx.rain.mc.infadv.item.ModItems;
import net.minecraft.data.DataGenerator;

public class ProviderLanguageZHCN extends ProviderLanguageBase {
    public ProviderLanguageZHCN(DataGenerator gen) {
        super(gen, InfinityAdventure.MODID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        addItemGroups();
        addBlocks();
        addItems();
    }

    private void addItemGroups() {
        addItemGroup(ModGroups.ORES, "无尽冒险 | 矿石");
        addItemGroup(ModGroups.COMBAT_AND_TOOLS, "无尽冒险 | 武器装备和工具");
    }

    private void addBlocks() {
        addBlock(ModBlocks.SILVER_ORE, "银矿石");
        addBlock(ModBlocks.RUBY_ORE, "红宝石矿石");
        addBlock(ModBlocks.MITHRIL_ORE, "秘银矿石");
        addBlock(ModBlocks.ADAMANTINE_ORE, "精金矿石");
        addBlock(ModBlocks.AQUAMARINE_ORE, "海蓝宝石矿石");
    }

    private void addItems() {
        addItem(ModItems.SILVER_INGOT, "银锭");
        addItem(ModItems.RUBY, "红宝石");
        addItem(ModItems.MITHRIL_INGOT, "秘银锭");
        addItem(ModItems.ADAMANTINE_INGOT, "精金锭");
        addItem(ModItems.AQUAMARINE, "海蓝宝石");

        addItem(ModItems.SILVER_SWORD, "银剑");
        addItem(ModItems.MITHRIL_SWORD, "秘银剑");
        addItem(ModItems.ADAMANTINE_SWORD, "精金剑");
    }
}
