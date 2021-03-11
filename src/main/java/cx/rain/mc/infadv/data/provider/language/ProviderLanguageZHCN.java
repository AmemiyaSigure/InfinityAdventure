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
        addTooltips();
    }

    private void addTooltips() {
        addTooltip(ModItems.SILVER_SWORD, 1, "银质的长剑，很适合用来斩杀亡灵。");
        addTooltip(ModItems.SILVER_AXE, 1, "银质的战斧，很适合用来斩杀亡灵。");

        addTooltip(ModItems.MITHRIL_SWORD, 1, "秘银的长剑，矮人工匠的杰作。");
        addTooltip(ModItems.MITHRIL_AXE, 1, "秘银的战斧，矮人工匠的杰作。");

        addTooltip(ModItems.ADAMANTINE_SWORD, 1, "精金的长剑，过于沉重难以使用。");
        addTooltip(ModItems.ADAMANTINE_PICKAXE, 1, "精金的镐，过于沉重难以使用。");
        addTooltip(ModItems.ADAMANTINE_AXE, 1, "精金的战斧，过于沉重难以使用。");
        addTooltip(ModItems.ADAMANTINE_SHOVEL, 1, "精金的铲子，过于沉重难以使用。");
        addTooltip(ModItems.ADAMANTINE_HOE, 1, "精金的锄头，过于沉重难以使用。");
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
        addItem(ModItems.SILVER_PICKAXE, "银镐");
        addItem(ModItems.SILVER_AXE, "银斧");
        addItem(ModItems.SILVER_SHOVEL, "银铲");
        addItem(ModItems.SILVER_HOE, "银锄");

        addItem(ModItems.MITHRIL_SWORD, "秘银剑");
        addItem(ModItems.MITHRIL_PICKAXE, "秘银镐");
        addItem(ModItems.MITHRIL_AXE, "秘银斧");
        addItem(ModItems.MITHRIL_SHOVEL, "秘银铲");
        addItem(ModItems.MITHRIL_HOE, "秘银锄");

        addItem(ModItems.ADAMANTINE_SWORD, "精金剑");
        addItem(ModItems.ADAMANTINE_PICKAXE, "精金镐");
        addItem(ModItems.ADAMANTINE_AXE, "精金斧");
        addItem(ModItems.ADAMANTINE_SHOVEL, "精金铲");
        addItem(ModItems.ADAMANTINE_HOE, "精金锄");
    }
}
