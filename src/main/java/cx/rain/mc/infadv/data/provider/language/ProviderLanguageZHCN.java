package cx.rain.mc.infadv.data.provider.language;

import cx.rain.mc.infadv.InfinityAdventure;
import cx.rain.mc.infadv.block.Blocks;
import cx.rain.mc.infadv.group.Groups;
import cx.rain.mc.infadv.item.Items;
import net.minecraft.data.DataGenerator;

public class ProviderLanguageZHCN extends ProviderLanguages {
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
        addItemGroup(Groups.ORES, "无尽冒险 | 矿石");
    }

    private void addBlocks() {
        addBlock(Blocks.SILVER_ORE, "银矿石");
        addBlock(Blocks.RUBY_ORE, "红宝石矿石");
        addBlock(Blocks.MITHRIL_ORE, "秘银矿石");
        addBlock(Blocks.ADAMANTINE_ORE, "精金矿石");
        addBlock(Blocks.AQUAMARINE_ORE, "海蓝宝石矿石");
    }

    private void addItems() {
        addItem(Items.SILVER_INGOT, "银锭");
        addItem(Items.RUBY, "红宝石");
        addItem(Items.MITHRIL_INGOT, "秘银锭");
        addItem(Items.ADAMANTINE_INGOT, "精金锭");
        addItem(Items.AQUAMARINE, "海蓝宝石");
    }
}
