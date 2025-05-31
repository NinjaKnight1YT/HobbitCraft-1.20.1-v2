package com.kyle.hobbitcraft.datagen;

import com.kyle.hobbitcraft.HobbitCraft;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {

    private final String locale;

    public ModLanguageProvider(PackOutput output, String locale) {
        super(output, HobbitCraft.MOD_ID, locale);
        this.locale = locale;
    }

    @Override
    protected void addTranslations() {
        if ("en_us".equals(locale)) {

            // TEMP

            this.add("creativetab.dreaded", "Dreaded (Temp)");
            this.add("creativetab.hobbitcraftium", "HobbitCraftium (Temp)");
            this.add("creativetab.kyle", "Kyle (Temp)");
            this.add("creativetab.vino", "Vino (Temp)");
            this.add("creativetab.wibkitium", "Wibkitium (Temp)");
            this.add("creativetab.miscellaneous", "Miscellaneous (Temp)");

            // PLUSHIES

            this.add("block.hobbitcraft.swell_plushie", "Swell");
            this.add("block.hobbitcraft.kyle_plushie", "Kyle");
            this.add("block.hobbitcraft.yuki_plushie", "Yuki");
            this.add("block.hobbitcraft.wibkit_plushie", "Wibkit");

            // COLLECTORS

            this.add("block.hobbitcraft.dreaded_collector", "Dreaded Collector");
            this.add("block.hobbitcraft.hobbitcraftium_collector", "HobbitCraftium Collector");
            this.add("block.hobbitcraft.kyle_collector", "Kyle Collector");
            this.add("block.hobbitcraft.vino_collector", "Vino Collector");
            this.add("block.hobbitcraft.wibkitium_collector", "Wibkitium Collector");

            // DREADED ITEMS

            // VANILLA

            this.add("item.hobbitcraft.dreaded_disc", "Music Disc - Dreaded");
            this.add("item.hobbitcraft.dreaded_disc.desc", "Linkin Park - Burn It Down");
            this.add("item.hobbitcraft.dreaded_helmet", "Dreaded Helmet");
            this.add("item.hobbitcraft.dreaded_chestplate", "Dreaded Chestplate");
            this.add("item.hobbitcraft.dreaded_trousers", "Dreaded Trousers");
            this.add("item.hobbitcraft.dreaded_boots", "Dreaded Boots");
            this.add("item.hobbitcraft.dreaded_sword", "Dreaded Sword");
            this.add("item.hobbitcraft.dreaded axe", "Dreaded Axe");
            this.add("item.hobbitcraft.dreaded_pickaxe", "Dreaded Pickaxe");
            this.add("item.hobbitcraft.dreaded_shovel", "Dreaded Shovel");
            this.add("item.hobbitcraft.dreaded_hoe", "Dreaded Hoe");
            this.add("item.hobbitcraft.dreaded_ingot", "Dreaded Ingot");
            this.add("item.hobbitcraft.dreaded_nugget", "Dreaded Nugget");
            this.add("item.hobbitcraft.raw_dread", "Raw Dread");
            this.add("item.hobbitcraft.crushed_raw_dread", "Crushed Raw Dread");
            this.add("item.hobbitcraft.dreaded_dust", "Dreaded Dust");
            this.add("item.hobbitcraft.tiny_dreaded_dust", "Tiny Dreaded Dust");

            // PROJECTE

            this.add("item.hobbitcraft.inert_dreaded_tome", "Inert Dreaded Tome");
            this.add("item.hobbitcraft.inert_dreaded_philosophers_stone", "Inert Dreaded Philosopher's Stone");
            this.add("item.hobbitcraft.inert_dreaded_transmutation_table", "Inert Dreaded Transmutation Table");
            this.add("item.hobbitcraft.inert_dreaded_transmutation_tablet", "Inert Dreaded Transmutation Tablet");
            this.add("item.hobbitcraft.dreaded_star_ein", "Dreaded Star Ein");
            this.add("item.hobbitcraft.dreaded_star_zwei", "Dreaded Star Zwei");
            this.add("item.hobbitcraft.dreaded_star_drei", "Dreaded Star Drei");
            this.add("item.hobbitcraft.dreaded_star_vier", "Dreaded Star Vier");
            this.add("item.hobbitcraft.dreaded_star_sphere", "Dreaded Star Sphere");
            this.add("item.hobbitcraft.dreaded_star_omega", "Dreaded Star Omega");

            // MEKANISM

            this.add("item.hobbitcraft.dreaded_alloy", "Dreaded Alloy");
            this.add("item.hobbitcraft.dreaded_control_circuit", "Dreaded Control Circuit");
            this.add("item.hobbitcraft.enriched_dread", "Enriched Dread");
            this.add("infuse_type.hobbitcraft.dread", "Dread");
            this.add("gas.hobbitcraft.dread", "Dread");

            // AE2

            this.add("item.hobbitcraft.dreaded_circuit", "Dreaded Circuit");
            this.add("item.hobbitcraft.dreaded_press", "Dreaded Press");
            this.add("item.hobbitcraft.printed_dread", "Printed Dread");

            // DREADED BLOCKS

            this.add("block.hobbitcraft.block_of_raw_dread", "Block of Raw Dread");
            this.add("block.hobbitcraft.dreaded_block", "Dreaded Block");
            this.add("dreaded_ore", "Dreaded Ore");
            this.add("dreaded_deepslate_ore", "Deepslate Dreaded Ore");
            this.add("dreaded_nether_ore", "Nether Dreaded Ore");
            this.add("dreaded_end_ore", "End Dreaded Ore");

            // HOBBITCRAFTIUM ITEMS

            // VANILLA

            this.add("item.hobbitcraft.hobbitcraftium_helmet", "HobbitCraftium Helmet");
            this.add("item.hobbitcraft.hobbitcraftium_chestplate", "HobbitCraftium Chestplate");
            this.add("item.hobbitcraft.hobbitcraftium_trousers", "HobbitCraftium Trousers");
            this.add("item.hobbitcraft.hobbitcraftium_boots", "HobbitCraftium Boots");
            this.add("item.hobbitcraft.hobbitcraftium_sword", "HobbitCraftium Sword");
            this.add("item.hobbitcraft.hobbitcraftium_axe", "HobbitCraftium Axe");
            this.add("item.hobbitcraft.hobbitcraftium_pickaxe", "HobbitCraftium Pickaxe");
            this.add("item.hobbitcraft.hobbitcraftium_shovel", "HobbitCraftium Shovel");
            this.add("item.hobbitcraft.hobbitcraftium_hoe", "HobbitCraftium Hoe");
            this.add("item.hobbitcraft.hobbitcraftium_ingot", "HobbitCraftium Ingot");
            this.add("item.hobbitcraft.hobbitcraftium_nugget", "HobbitCraftium Nugget");
            this.add("item.hobbitcraft.hobbitcraftium_dust", "HobbitCraftium Dust");
            this.add("item.hobbitcraft.tiny_hobbitcraftium_dust", "Tiny HobbitCraftium Dust");

            // PROJECTE

            this.add("item.hobbitcraft.inert_hobbitcraftium_tome", "Inert HobbitCraftium Tome");
            this.add("item.hobbitcraft.inert_hobbitcraftium_philosophers_stone", "Inert HobbitCraftium Philosopher's Stone");
            this.add("item.hobbitcraft.inert_hobbitcraftium_transmutation_table", "Inert HobbitCraftium Transmutation Table");
            this.add("item.hobbitcraft.inert_hobbitcraftium_transmutation_tablet", "Inert HobbitCraftium Transmutation Tablet");
            this.add("item.hobbitcraft.hobbitcraftium_star_ein", "HobbitCraftium Star Ein");
            this.add("item.hobbitcraft.hobbitcraftium_star_zwei", "HobbitCraftium Star Zwei");
            this.add("item.hobbitcraft.hobbitcraftium_star_drei", "HobbitCraftium Star Drei");
            this.add("item.hobbitcraft.hobbitcraftium_star_vier", "HobbitCraftium Star Vier");
            this.add("item.hobbitcraft.hobbitcraftium_star_sphere", "HobbitCraftium Star Sphere");
            this.add("item.hobbitcraft.hobbitcraftium_star_omega", "HobbitCraftium Star Omega");

            // MEKANISM

            this.add("item.hobbitcraft.hobbitcraftium_alloy", "HobbitCraftium Alloy");
            this.add("item.hobbitcraft.hobbitcraftium_control_circuit", "HobbitCraftium Control Circuit");
            this.add("item.hobbitcraft.enriched_hobbitcraftium", "Enriched HobbitCraft");
            this.add("infuse_type.hobbitcraft.hobbitcraftium", "HobbitCraftium");
            this.add("gas.hobbitcraft.hobbitcraftium", "HobbitCraftium");

            // AE2

            this.add("item.hobbitcraft.hobbitcraftium_circuit", "HobbitCraftium Circuit");
            this.add("item.hobbitcraft.hobbitcraftium_press", "HobbitCraftium Press");
            this.add("item.hobbitcraft.printed_hobbitcraftium", "Printed HobbitCraftium");

            // HOBBITCRAFTIUM BLOCK

            this.add("block.hobbitcraft.hobbitcraftium_block", "HobbitCraftium Block");

            // KYLE ITEMS

            // VANILLA

            this.add("item.hobbitcraft.kyle_disc", "Music Disc - Kyle");
            this.add("item.hobbitcraft.kyle_disc.desc", "STARSET - Frequency");
            this.add("item.hobbitcraft.kyle_helmet", "Kyle Helmet");
            this.add("item.hobbitcraft.kyle_chestplate", "Kyle Chestplate");
            this.add("item.hobbitcraft.kyle_trousers", "Kyle Trousers");
            this.add("item.hobbitcraft.kyle_boots", "Kyle Boots");
            this.add("item.hobbitcraft.kyle_sword", "Kyle Sword");
            this.add("item.hobbitcraft.kyle_axe", "Kyle Axe");
            this.add("item.hobbitcraft.kyle_pickaxe", "Kyle Pickaxe");
            this.add("item.hobbitcraft.kyle_shovel", "Kyle Shovel");
            this.add("item.hobbitcraft.kyle_hoe", "Kyle Hoe");
            this.add("item.hobbitcraft.kyle_ingot", "Kyle Ingot");
            this.add("item.hobbitcraft.kyle_nugget", "Kyle Nugget");
            this.add("item.hobbitcraft.raw_kyle", "Raw Kyle");
            this.add("item.hobbitcraft.crushed_raw_kyle", "Crushed Raw Kyle");
            this.add("item.hobbitcraft.kyle_dust", "Kyle Dust");
            this.add("item.hobbitcraft.tiny_kyle_dust", "Tiny Kyle Dust");

            // PROJECTE

            this.add("item.hobbitcraft.inert_kyle_tome", "Inert Kyle Tome");
            this.add("item.hobbitcraft.inert_kyle_philosophers_stone", "Inert Kyle Philosopher's Stone");
            this.add("item.hobbitcraft.inert_kyle_transmutation_table", "Inert Kyle Transmutation Table");
            this.add("item.hobbitcraft.inert_kyle_transmutation_tablet", "Inert Kyle Transmutation Tablet");
            this.add("item.hobbitcraft.kyle_star_ein", "Kyle Star Ein");
            this.add("item.hobbitcraft.kyle_star_zwei", "Kyle Star Zwei");
            this.add("item.hobbitcraft.kyle_star_drei", "Kyle Star Drei");
            this.add("item.hobbitcraft.kyle_star_vier", "Kyle Star Vier");
            this.add("item.hobbitcraft.kyle_star_sphere", "Kyle Star Sphere");
            this.add("item.hobbitcraft.kyle_star_omega", "Kyle Star Omega");

            // MEKANISM

            this.add("item.hobbitcraft.kyle_alloy", "Kyle Alloy");
            this.add("item.hobbitcraft.kyle_control_circuit", "Kyle Control Circuit");
            this.add("item.hobbitcraft.enriched_kyle", "Enriched Kyle");
            this.add("infuse_type.hobbitcraft.kyle", "Kyle");
            this.add("gas.hobbitcraft.kyle", "Kyle");

            // AE2

            this.add("item.hobbitcraft.kyle_circuit", "Kyle Circuit");
            this.add("item.hobbitcraft.kyle_press", "Kyle Press");
            this.add("item.hobbitcraft.printed_kyle", "Printed Kyle");

            // KYLE BLOCKS

            this.add("block.hobbitcraft.block_of_raw_kyle", "Block of Raw Kyle");
            this.add("block.hobbitcraft.kyle_block", "Kyle Block");
            this.add("block.hobbitcraft.kyle_ore", "Kyle Ore");
            this.add("block.hobbitcraft.kyle_deepslate_ore", "Kyle Deepslate Ore");
            this.add("block.hobbitcraft.kyle_nether_ore", "Kyle Nether Ore");
            this.add("block.hobbitcraft.kyle_end_ore", "Kyle End Ore");

            // VINO ITEMS

            // VANILLA

            this.add("item.hobbitcraft.vino_disc", "Music Disc - Vino");
            this.add("item.hobbitcraft.vino_disc.desc", "Hitotsu Toya");
            this.add("item.hobbitcraft.vino_helmet", "Vino Helmet");
            this.add("item.hobbitcraft.vino_chestplate", "Vino Chestplate");
            this.add("item.hobbitcraft.vino_trousers", "Vino Trousers");
            this.add("item.hobbitcraft.vino_boots", "Vino Boots");
            this.add("item.hobbitcraft.vino_sword", "Vino Sword");
            this.add("item.hobbitcraft.vino_axe", "Vino Axe");
            this.add("item.hobbitcraft.vino_pickaxe", "Vino Pickaxe");
            this.add("item.hobbitcraft.vino_shovel", "Vino Shovel");
            this.add("item.hobbitcraft.vino_hoe", "Vino Hoe");
            this.add("item.hobbitcraft.vino_ingot", "Vino Ingot");
            this.add("item.hobbitcraft.vino_nugget", "Vino Nugget");
            this.add("item.hobbitcraft.raw_vino", "Raw Vino");
            this.add("item.hobbitcraft.crushed_raw_vino", "Crushed Raw Vino");
            this.add("item.hobbitcraft.vino_dust", "Vino Dust");
            this.add("item.hobbitcraft.tiny_vino_dust", "Tiny Vino Dust");

            // PROJECTE

            this.add("item.hobbitcraft.inert_vino_tome", "Inert Vino Tome");
            this.add("item.hobbitcraft.inert_vino_philosophers_stone", "Inert Vino Philosopher's Stone");
            this.add("item.hobbitcraft.inert_vino_transmutation_table", "Inert Vino Transmutation Table");
            this.add("item.hobbitcraft.inert_vino_transmutation_tablet", "Inert Vino Transmutation Tablet");
            this.add("item.hobbitcraft.vino_star_ein", "Vino Star Ein");
            this.add("item.hobbitcraft.vino_star_zwei", "Vino Star Zwei");
            this.add("item.hobbitcraft.vino_star_drei", "Vino Star Drei");
            this.add("item.hobbitcraft.vino_star_vier", "Vino Star Vier");
            this.add("item.hobbitcraft.vino_star_sphere", "Vino Star Sphere");
            this.add("item.hobbitcraft.vino_star_omega", "Vino Star Omega");

            // MEKANISM

            this.add("item.hobbitcraft.vino_alloy", "Vino Alloy");
            this.add("item.hobbitcraft.vino_control_circuit", "Vino Control Circuit");
            this.add("item.hobbitcraft.enriched_vino", "Enriched Vino");
            this.add("infuse_type.hobbitcraft.vino", "Vino");
            this.add("gas.hobbitcraft.vino", "Vino");

            // AE2

            this.add("item.hobbitcraft.vino_circuit", "Vino Circuit");
            this.add("item.hobbitcraft.vino_press", "Vino Press");
            this.add("item.hobbitcraft.printed_vino", "Printed Vino");

            // VINO BLOCKS

            this.add("block.hobbitcraft.block_of_raw_vino", "Block of Raw Vino");
            this.add("block.hobbitcraft.vino_block", "Vino Block");
            this.add("block.hobbitcraft.vino_ore", "Vino Ore");
            this.add("block.hobbitcraft.vino_deepslate_ore", "Deepslate Vino Ore");
            this.add("block.hobbitcraft.vino_nether_ore", "Nether Vino Ore");
            this.add("block.hobbitcraft.vino_end_ore", "End Vino Ore");

            // WIBKITIUM ITEMS

            // VANILLA

            this.add("item.hobbitcraft.wibkitium_disc", "Music Disc - Wibkitium");
            this.add("item.hobbitcraft.wibkitium_disc.desc", "Terraria - Overworld Day");
            this.add("item.hobbitcraft.wibkitium_helmet", "Wibkitium Helmet");
            this.add("item.hobbitcraft.wibkitium_chestplate", "Wibkitium Chestplate");
            this.add("item.hobbitcraft.wibkitium_trousers", "Wibkitium Trousers");
            this.add("item.hobbitcraft.wibkitium_boots", "Wibkitium Boots");
            this.add("item.hobbitcraft.wibkitium_sword", "Wibkitium Sword");
            this.add("item.hobbitcraft.wibkitium_axe", "Wibkitium Axe");
            this.add("item.hobbitcraft.wibkitium_pickaxe", "Wibkitium Pickaxe");
            this.add("item.hobbitcraft.wibkitium_shovel", "Wibkitium Shovel");
            this.add("item.hobbitcraft.wibkitium_hoe", "Wibkitium Hoe");
            this.add("item.hobbitcraft.wibkitium_ingot", "Wibkitium Ingot");
            this.add("item.hobbitcraft.wibkitium_nugget", "Wibkitium Nugget");
            this.add("item.hobbitcraft.raw_wibkitium", "Raw Wibkitium");
            this.add("item.hobbitcraft.crushed_raw_wibkitium", "Crushed Raw Wibkitium");
            this.add("item.hobbitcraft.wibkitium_dust", "Wibkitium Dust");
            this.add("item.hobbitcraft.tiny_wibkitium_dust", "Tiny Wibkitium Dust");

            // PROJECTE

            this.add("item.hobbitcraft.inert_wibkitium_tome", "Inert Wibkitium Tome");
            this.add("item.hobbitcraft.inert_wibkitium_philosophers_stone", "Inert Wibkitium Philosopher's Stone");
            this.add("item.hobbitcraft.inert_wibkitium_transmutation_table", "Inert Wibkitium Transmutation Table");
            this.add("item.hobbitcraft.inert_wibkitium_transmutation_tablet", "Inert Wibkitium Transmutation Tablet");
            this.add("item.hobbitcraft.wibkitium_star_ein", "Wibkitium Star Ein");
            this.add("item.hobbitcraft.wibkitium_star_zwei", "Wibkitium Star Zwei");
            this.add("item.hobbitcraft.wibkitium_star_drei", "Wibkitium Star Drei");
            this.add("item.hobbitcraft.wibkitium_star_vier", "Wibkitium Star Vier");
            this.add("item.hobbitcraft.wibkitium_star_sphere", "Wibkitium Star Sphere");
            this.add("item.hobbitcraft.wibkitium_star_omega", "Wibkitium Star Omega");

            // MEKANISM

            this.add("item.hobbitcraft.wibkitium_alloy", "Wibkitium Alloy");
            this.add("item.hobbitcraft.wibkitium_control_circuit", "Wibkitium Control Circuit");
            this.add("item.hobbitcraft.enriched_wibkitium", "Enriched Wibkitium");
            this.add("infuse_type.hobbitcraft.wibkitium", "Wibkitium");
            this.add("gas.hobbitcraft.wibkitium", "Wibkitium");

            // AE2

            this.add("item.hobbitcraft.wibkitium_circuit", "Wibkitium Circuit");
            this.add("item.hobbitcraft.wibkitium_press", "Wibkitium Press");
            this.add("item.hobbitcraft.printed_wibkitium", "Printed Wibkitium");

            // BLOCKS

            this.add("block.hobbitcraft.block_of_raw_wibkitium", "Block of Raw Wibkitium");
            this.add("block.hobbitcraft.wibkitium_block", "Wibkitium Block");
            this.add("block.hobbitcraft.wibkitium_ore", "Wibkitium Ore");
            this.add("block.hobbitcraft.wibkitium_deepslate_ore", "Deepslate Wibkitium Ore");
            this.add("block.hobbitcraft.wibkitium_nether_ore", "Nether Wibkitium Ore");
            this.add("block.hobbitcraft.wibkitium_end_ore", "End Wibkitium Ore");

            // MISCELLANEOUS

            this.add("block.hobbitcraft.metro_block", "Metro Sign");
            this.add("creativetab.hobbitcraft", "HobbitCraft");

        } else if ("ja_jp".equals(locale)) {

            // DREADED ITEMS

            // VANILLA

            this.add("item.hobbitcraft.dreaded_disc", "音楽ディスク ー 恐ろしい");
            this.add("item.hobbitcraft.dreaded_disc.desc", "リンキンパーク ー 「燃やしてしまえ」");
            this.add("item.hobbitcraft.dreaded_helmet", "恐ろしいのヘルメット");
            this.add("item.hobbitcraft.dreaded_chestplate", "恐ろしいの胸当て");
            this.add("item.hobbitcraft.dreaded_trousers", "恐ろしいのズボン");
            this.add("item.hobbitcraft.dreaded_boots", "恐ろしいのブーツ");
            this.add("item.hobbitcraft.dreaded_sword", "恐ろしいの剣");
            this.add("item.hobbitcraft.dreaded_axe", "恐ろしいの斧");
            this.add("item.hobbitcraft.dreaded_pickaxe", "恐ろしいのつるはし");
            this.add("item.hobbitcraft.dreaded_shovel", "恐ろしいのシャベル");
            this.add("item.hobbitcraft.dreaded_hoe", "恐ろしいの鍬");
            this.add("item.hobbitcraft.dreaded_ingot", "恐ろしいのインゴット");
            this.add("item.hobbitcraft.dreaded_nugget", "恐ろしいのナゲット");
            this.add("item.hobbitcraft.raw_dread", "生の恐怖");
            this.add("item.hobbitcraft.crushed_raw_dread", "砕いた生の恐怖");
            this.add("item.hobbitcraft.dreaded_dust", "恐ろしいほこり");
            this.add("item.hobbitcraft.tiny_dreaded_dust", "小さな恐ろしいほこり");

            // PROJECTE

            this.add("item.hobbitcraft.inert_dreaded_tome", "不活性な恐ろしいの書物");
            this.add("item.hobbitcraft.inert_dreaded_philosophers_stone", "不活性な恐ろしいの賢者の石");
            this.add("item.hobbitcraft.inert_dreaded_transmutation_table", "不活性な恐ろしいの変換テーブル");
            this.add("item.hobbitcraft.inert_dreaded_transmutation_tablet", "不活性な恐ろしいの変換タブレット");
            this.add("item.hobbitcraft.dreaded_star_ein", "恐ろしいの星 Ein");
            this.add("item.hobbitcraft.dreaded_star_zwei", "恐ろしいの星 Zwei");
            this.add("item.hobbitcraft.dreaded_star_drei", "恐ろしいの星 Drei");
            this.add("item.hobbitcraft.dreaded_star_vier", "恐ろしいの星 Vier");
            this.add("item.hobbitcraft.dreaded_star_sphere", "恐ろしいの星 Sphere");
            this.add("item.hobbitcraft.dreaded_star_omega", "恐ろしいの星 Omega");

            // MEKANISM

            this.add("item.hobbitcraft.dreaded_alloy", "恐ろしい合金");
            this.add("item.hobbitcraft.dreadead_control_circuit", "恐ろしい制御回路");

            // AE2

            this.add("item.hobbitcraft.dreaded_circuit", "恐ろしい回路");
            this.add("item.hobbitcraft.dreaded_press", "恐ろしいプレス");
            this.add("item.hobbitcraft.printed_dread", "プリントされた恐怖");

            // DREADED BLOCKS

            this.add("block.hobbitcraft.block_of_raw_dread", "生の恐怖のブロック");
            this.add("block.hobbitcraft.dreaded_block", "恐ろしいのブロック");
            this.add("block.hobbitcraft.dreaded_ore", "恐ろしいの鉱石");
            this.add("block.hobbitcraft.dreaded_deepslate_ore", "ディープスレート恐ろしいの鉱石");
            this.add("block.hobbitcraft.dreaded_nether_ore", "ネザー恐ろしいの鉱石");
            this.add("block.hobbitcraft.dreaded_end_ore", "エンド恐ろしいの鉱石");

            // HOBBITCRAFTIUM ITEMS

            // VANILLA

            this.add("item.hobbitcraft.hobbitcraftium_helmet", "ホビットクラフティアム・ヘルメット");
            this.add("item.hobbitcraft.hobbitcraftium_chestplate", "ホビットクラフティアムのチェストプレート");
            this.add("item.hobbitcraft.hobbitcraftium_trousers", "ホビットクラフティアム・トラウザーズ");
            this.add("item.hobbitcraft.hobbitcraftium_boots", "ホビットクラフティアム・ブーツ");
            this.add("item.hobbitcraft.hobbitcraftium_sword", "ホビットクラフティアム剣");
            this.add("item.hobbitcraft.hobbitcraftium_axe", "ホビットクラフティアム斧");
            this.add("item.hobbitcraft.hobbitcraftium_pickaxe", "ホビットクラフティアムのつるはし");
            this.add("item.hobbitcraft.hobbitcraftium_shovel", "ホビットクラフティアム・シャベル");
            this.add("item.hobbitcraft.hobbitcraftium_hoe", "ホビットクラフティアム鍬");
            this.add("item.hobbitcraft.hobbitcraftium_ingot", "ホビットクラフティアム・インゴット");
            this.add("item.hobbitcraft.hobbitcraftium_nugget", "ホビットクラフティアム・ナゲット");
            this.add("item.hobbitcraft.hobbitcraftium_dust", "ホビットクラフティアムほこり");
            this.add("item.hobbitcraft.tiny_hobbitcraftium_dust", "ちいさなホビットクラフティアムほこり");

            // PROJECTE

            this.add("item.hobbitcraft.inert_hobbitcraftium_tome", "不活性なホビットクラフティアム書");
            this.add("item.hobbitcraft.inert_hobbitcraftium_philosophers_stone", "不活性なホビットクラフティアム賢者の石");
            this.add("item.hobbitcraft.inert_hobbitcraftium_transmutation_table", "不活性なホビットクラフティアム変換テーブル");
            this.add("item.hobbitcraft.inert_hobbitcraftium_transmutation_tablet", "不活性なホビットクラフティアム変換タブレット");
            this.add("item.hobbitcraft.hobbitcraftium_star_ein", "ホビットクラフティアムの星 Ein");
            this.add("item.hobbitcraft.hobbitcraftium_star_zwei", "ホビットクラフティアムの星 Zwei");
            this.add("item.hobbitcraft.hobbitcraftium_star_drei", "ホビットクラフティアムの星 Drei");
            this.add("item.hobbitcraft.hobbitcraftium_star_vier", "ホビットクラフティアムの星 Vier");
            this.add("item.hobbitcraft.hobbitcraftium_star_sphere", "ホビットクラフティアムの星 Sphere");
            this.add("item.hobbitcraft.hobbitcraftium_star_omega", "ホビットクラフティアムの星 Omega");

            // MEKANISM

            this.add("item.hobbitcraft.hobbitcraftium_alloy", "ホビットクラフティアム合金");
            this.add("item.hobbitcraft.hobbitcraftium_control_circuit", "ホビットクラフティアム制御回路");

            // AE2

            this.add("item.hobbitcraft.hobbitcraftium_circuit", "ホビットクラフティアム回路");
            this.add("item.hobbitcraft.hobbitcraftium_press", "ホビットクラフティアム・プレス");
            this.add("item.hobbitcraft.printed_hobbitcraftium", "プリントされたホビットクラフティアム");

            // BLOCK

            this.add("block.hobbitcraft.hobbitcraftium_block", "ホビットクラフティアム・ブロック");

            // KYLE ITEMS

            // VANILLA

            this.add("item.hobbitcraft.kyle_disc", "音楽ディスク ー カイル");
            this.add("item.hobbitcraft.kyle_disc.desc", "スターセット ー 「頻度」");
            this.add("item.hobbitcraft.kyle_helmet", "カイルのヘルメット");
            this.add("item.hobbitcraft.kyle_chestplate", "カイルの胸当て");
            this.add("item.hobbitcraft.kyle_trousers", "カイルのズボン");
            this.add("item.hobbitcraft.kyle_boots", "カイルのブーツ");
            this.add("item.hobbitcraft.kyle_sword", "カイルの剣");
            this.add("item.hobbitcraft.kyle_axe", "カイルの斧");
            this.add("item.hobbitcraft.kyle_pickaxe", "カイルのつるはし");
            this.add("item.hobbitcraft.kyle_shovel", "カイルのシャベル");
            this.add("item.hobbitcraft.kyle_hoe", "カイルの鍬");
            this.add("item.hobbitcraft.kyle_ingot", "カイルのインゴット");
            this.add("item.hobbitcraft.kyle_nugget", "カイルのナゲット");
            this.add("item.hobbitcraft.raw_kyle", "生のカイル");
            this.add("item.hobbitcraft.crushed_raw_kyle", "砕いた生のカイル");
            this.add("item.hobbitcraft.kyle_dust", "カイルほこり");
            this.add("item.hobbitcraft.tiny_kyle_dust", "小さなカイルほこり");

            // PROJECTE

            this.add("item.hobbitcraft.inert_kyle_tome", "不活性なカイル書");
            this.add("item.hobbitcraft.inert_kyle_philosophers_stone", "不活性なカイル賢者の石");
            this.add("item.hobbitcraft.inert_kyle_transmutation_table", "不活性なカイル変換テーブル");
            this.add("item.hobbitcraft.inert_kyle_transmutation_tablet", "不活性なカイル変換タブレット");
            this.add("item.hobbitcraft.kyle_star_ein", "カイルの星 Ein");
            this.add("item.hobbitcraft.kyle_star_zwei", "カイルの星 Zwei");
            this.add("item.hobbitcraft.kyle_star_drei", "カイルの星 Drei");
            this.add("item.hobbitcraft.kyle_star_vier", "カイルの星 Vier");
            this.add("item.hobbitcraft.kyle_star_sphere", "カイルの星 Sphere");
            this.add("item.hobbitcraft.kyle_star_omega", "カイルの星 Omega");

            // MEKANISM

            this.add("item.hobbitcraft.kyle_alloy", "カイル合金");
            this.add("item.hobbitcraft.kyle_control_circuit", "カイル制御回路");

            // AE2

            this.add("item.hobbitcraft.kyle_circuit", "カイル回路");
            this.add("item.hobbitcraft.kyle_press", "カイル・プレス");
            this.add("item.hobbitcraft.printed_kyle", "プリントされたカイル");

            // KYLE BLOCKS

            this.add("block.hobbitcraft.block_of_raw_kyle", "生のカイルのブロック");
            this.add("block.hobbitcraft.kyle_block", "カイルのブロック");
            this.add("block.hobbitcraft.kyle_ore", "カイル鉱石");
            this.add("block.hobbitcraft.kyle_deepslate_ore", "ディープスレートカイル鉱石");
            this.add("block.hobbitcraft.kyle_nether_ore", "ネザーカイル鉱石");
            this.add("block.hobbitcraft.kyle_end_ore", "エンドのカイル鉱石");

            // VINO ITEMS

            // VANILLA

            this.add("item.hobbitcraft.vino_disc", "音楽ディスク ー ワイン");
            this.add("item.hobbitcraft.vino_disc.desc", "「ひとつとや」");
            this.add("item.hobbitcraft.vino_helmet", "ワインのヘルメット");
            this.add("item.hobbitcraft.vino_chestplate", "ワインの胸当て");
            this.add("item.hobbitcraft.vino_trousers", "ワインのズボン");
            this.add("item.hobbitcraft.vino_boots", "ワインのブーツ");
            this.add("item.hobbitcraft.vino_sword", "ワインの剣");
            this.add("item.hobbitcraft.vino_axe", "ワインの斧");
            this.add("item.hobbitcraft.vino_pickaxe", "ワインのつるはし");
            this.add("item.hobbitcraft.vino_shovel", "ワインのシャベル");
            this.add("item.hobbitcraft.vino_hoe", "ワインの鍬");
            this.add("item.hobbitcraft.vino_ingot", "ワインのインゴット");
            this.add("item.hobbitcraft.vino_nugget", "ワインのナゲット");
            this.add("item.hobbitcraft.raw_vino", "生のワイン");
            this.add("item.hobbitcraft.crushed_raw_vino", "砕いた生のワイン");
            this.add("item.hobbitcraft.vino_dust", "ワインほこり");
            this.add("item.hobbitcraft.tiny_vino_dust", "小さなワインほこり");

            // PROJECTE

            this.add("item.hobbitcraft.inert_vino_tome", "不活性なワイン書");
            this.add("item.hobbitcraft.inert_vino_philosophers_stone", "不活性なワイン賢者の石");
            this.add("item.hobbitcraft.inert_vino_transmutation_table", "不活性なワイン変換テーブル");
            this.add("item.hobbitcraft.inert_vino_transmutation_tablet", "不活性なワイン変換タブレット");
            this.add("item.hobbitcraft.vino_star_ein", "ワインの星 Ein");
            this.add("item.hobbitcraft.vino_star_zwei", "ワインの星 Zwei");
            this.add("item.hobbitcraft.vino_star_drei", "ワインの星 Drei");
            this.add("item.hobbitcraft.vino_star_vier", "ワインの星 Vier");
            this.add("item.hobbitcraft.vino_star_sphere", "ワインの星 Sphere");
            this.add("item.hobbitcraft.vino_star_omega", "ワインの星 Omega");

            // MEKANISM

            this.add("item.hobbitcraft.vino_alloy", "ワイン合金");
            this.add("item.hobbitcraft.vino_control_circuit", "ワイン制御回路");

            // AE2

            this.add("item.hobbitcraft.vino_circuit", "ワイン回路");
            this.add("item.hobbitcraft.vino_press", "ワイン・プレス");
            this.add("item.hobbitcraft.printed_vino", "プリントされたワイン");

            // VINO BLOCKS

            this.add("block.hobbitcraft.block_of_raw_vino", "生のワインのブロック");
            this.add("block.hobbitcraft.vino_block", "ワインのブロック");
            this.add("block.hobbitcraft.vino_ore", "ワイン鉱石");
            this.add("block.hobbitcraft.vino_deepslate_ore", "ディープスレートワイン鉱石");
            this.add("block.hobbitcraft.vino_nether_ore", "ネザーワイン鉱石");
            this.add("block.hobbitcraft.vino_end_ore", "エンドのワイン鉱石");

            // WIBKITIUM ITEMS

            // VANILLA

            this.add("item.hobbitcraft.wibkitium_disc", "音楽ディスク ー ウィブキティウム");
            this.add("item.hobbitcraft.wibkitium_disc.desc", "テラリア ー 「オーバーワールドデー」");
            this.add("item.hobbitcraft.wibkitium_helmet", "ウィブキティウムのヘルメット");
            this.add("item.hobbitcraft.wibkitium_chestplate", "ウィブキティウムの胸当て");
            this.add("item.hobbitcraft.wibkitium_trousers", "ウィブキティウムのズボン");
            this.add("item.hobbitcraft.wibkitium_boots", "ウィブキティウムのブーツ");
            this.add("item.hobbitcraft.wibkitium_sword", "ウィブキティウムの剣");
            this.add("item.hobbitcraft.wibkitium_axe", "ウィブキティウムの斧");
            this.add("item.hobbitcraft.wibkitium_pickaxe", "ウィブキティウムのつるはし");
            this.add("item.hobbitcraft.wibkitium_shovel", "ウィブキティウムのシャベル");
            this.add("item.hobbitcraft.wibkitium_hoe", "ウィブキティウムの鍬");
            this.add("item.hobbitcraft.wibkitium_ingot", "ウィブキティウムのインゴット");
            this.add("item.hobbitcraft.wibkitium_nugget", "ウィブキティウムのナゲット");
            this.add("item.hobbitcraft.raw_wibkitium", "生のウィブキティウム");
            this.add("item.hobbitcraft.crushed_raw_wibkitium", "砕いた生のウィブキティウム");
            this.add("item.hobbitcraft.wibkitium_dust", "ウィブキティウムほこり");
            this.add("item.hobbitcraft.tiny_wibkitium_dust", "小さなウィブキティウムほこり");

            // PROJECTE

            this.add("item.hobbitcraft.inert_wibkitium_tome", "不活性なウィブキティウム書");
            this.add("item.hobbitcraft.inert_wibkitium_philosophers_stone", "不活性なウィブキティウム賢者の石");
            this.add("item.hobbitcraft.inert_wibkitium_transmutation_table", "不活性なウィブキティウム変換テーブル");
            this.add("item.hobbitcraft.inert_wibkitium_transmutation_tablet", "不活性なウィブキティウム変換タブレット");
            this.add("item.hobbitcraft.wibkitium_star_ein", "ウィブキティウムの星 Ein");
            this.add("item.hobbitcraft.wibkitium_star_zwei", "ウィブキティウムの星 Zwei");
            this.add("item.hobbitcraft.wibkitium_star_drei", "ウィブキティウムの星 Drei");
            this.add("item.hobbitcraft.wibkitium_star_vier", "ウィブキティウムの星 Vier");
            this.add("item.hobbitcraft.wibkitium_star_sphere", "ウィブキティウムの星 Sphere");
            this.add("item.hobbitcraft.wibkitium_star_omega", "ウィブキティウムの星 Omega");

            // MEKANISM

            this.add("item.hobbitcraft.wibkitium_alloy", "ウィブキティウム合金");
            this.add("item.hobbitcraft.wibkitium_control_circuit", "ウィブキティウム制御回路");

            // AE2

            this.add("item.hobbitcraft.wibkitium_circuit", "ウィブキティウム回路");
            this.add("item.hobbitcraft.wibkitium_press", "ウィブキティウム・プレス");
            this.add("item.hobbitcraft.printed_wibkitium", "プリントされたウィブキティウム");

            // WIBKITIUM BLOCKS

            this.add("block.hobbitcraft.block_of_raw_wibkitium", "生のウィブキティウムのブロック");
            this.add("block.hobbitcraft.wibkitium_block", "ウィブキティウムのブロック");
            this.add("block.hobbitcraft.wibkitium_ore", "ウィブキティウム鉱石");
            this.add("block.hobbitcraft.wibkitium_deepslate_ore", "ティープスレートウィブキティウム鉱石");
            this.add("block.hobbitcraft.wibkitium_nether_ore", "ネザーウィブキティウム鉱石");
            this.add("block.hobbitcraft.wibkitium_end_ore", "エンドのウィブキティウム鉱石");

            // MISCELLANEOUS

            this.add("block.hobbitcraft.metro", "地下鉄サイン");
            this.add("creativetab.hobbitcraft", "ホビットクラフト");

        }
    }
}
