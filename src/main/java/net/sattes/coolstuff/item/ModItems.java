package net.sattes.coolstuff.item;
import com.jamieswhiteshirt.reachentityattributes.ReachEntityAttributes;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.sattes.coolstuff.CoolStuff;
import net.sattes.coolstuff.item.custom.*;
import net.sattes.coolstuff.item.custom.gear.trinkets.*;
import net.sattes.coolstuff.item.custom.runewords.RunewordFoxItem;
import net.sattes.coolstuff.item.custom.weapons.*;

public class ModItems {

    //MISC


    public static final Item POCKET_GEODE = registerItem("pocket_geode",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.UNCOMMON)) );

    public static final Item TONGS = registerItem("tongs",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxDamage(300)));

    public static final Item RAW_RESIN = registerItem("raw_resin",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item RESIN_FLASK = registerItem("resin_flask",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item SANDPAPER = registerItem("sandpaper",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    //RUNEWORDS

    public static final Item RUNEWORD = registerItem("runeword",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item RW_UPGRADE = registerItem("rw_upgrade",
            new RunewordItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.UNCOMMON)) );

    public static final Item RUNEWORD_FOX = registerItem("runeword_fox",
            new RunewordFoxItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.RARE)) );


    //RUNES

    public static final Item RUNE_A = registerItem("rune_a",
            new RuneItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.UNCOMMON)) );
    public static final Item RUNE_B = registerItem("rune_b",
            new RuneItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.UNCOMMON)) );
    public static final Item RUNE_C = registerItem("rune_c",
            new RuneItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.UNCOMMON)) );
    public static final Item RUNE_D = registerItem("rune_d",
            new RuneItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.UNCOMMON)) );
    public static final Item RUNE_E = registerItem("rune_e",
            new RuneItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.UNCOMMON)) );
    public static final Item RUNE_F = registerItem("rune_f",
            new RuneItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.UNCOMMON)) );
    public static final Item RUNE_G = registerItem("rune_g",
            new RuneItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.UNCOMMON)) );
    public static final Item RUNE_H = registerItem("rune_h",
            new RuneItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.UNCOMMON)) );
    public static final Item RUNE_I = registerItem("rune_i",
            new RuneItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.UNCOMMON)) );
    public static final Item RUNE_J = registerItem("rune_j",
            new RuneItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.UNCOMMON)) );

    public static final Item RUNE_K = registerItem("rune_k",
            new RuneItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.RARE)) );
    public static final Item RUNE_L = registerItem("rune_l",
            new RuneItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.RARE)) );
    public static final Item RUNE_M = registerItem("rune_m",
            new RuneItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.RARE)) );
    public static final Item RUNE_N = registerItem("rune_n",
            new RuneItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.RARE)) );
    public static final Item RUNE_O = registerItem("rune_o",
            new RuneItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.RARE)) );
    public static final Item RUNE_P = registerItem("rune_p",
            new RuneItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.RARE)) );
    public static final Item RUNE_Q = registerItem("rune_q",
            new RuneItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.RARE)) );
    public static final Item RUNE_R = registerItem("rune_r",
            new RuneItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.RARE)) );
    public static final Item RUNE_S = registerItem("rune_s",
            new RuneItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.RARE)) );
    public static final Item RUNE_T = registerItem("rune_t",
            new RuneItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.RARE)) );
    public static final Item RUNE_U = registerItem("rune_u",

            new RuneItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.EPIC)) );
    public static final Item RUNE_V = registerItem("rune_v",
            new RuneItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.EPIC)) );
    public static final Item RUNE_W = registerItem("rune_w",
            new RuneItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.EPIC)) );
    public static final Item RUNE_X = registerItem("rune_x",
            new RuneItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.EPIC)) );
    public static final Item RUNE_Y = registerItem("rune_y",
            new RuneItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.EPIC)) );
    public static final Item RUNE_Z = registerItem("rune_z",
            new RuneItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.EPIC)) );

    //PROFESSION MATERIALS
    public static final Item PLANT_FIBER = registerItem("plant_fiber",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );
    public static final Item ROPE = registerItem("rope",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item PLATE_LEATHER = registerItem("plate_leather",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );
    public static final Item PLATE_COPPER = registerItem("plate_copper",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );
    public static final Item PLATE_IRON = registerItem("plate_iron",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );
    public static final Item PLATE_GOLD = registerItem("plate_gold",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );
    public static final Item PLATE_DIAMOND = registerItem("plate_diamond",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );
    public static final Item PLATE_NETHERITE = registerItem("plate_netherite",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item BLUEPRINT_RING = registerItem("blueprint_ring",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item RING_COPPER_SETTING = registerItem("ring_copper_setting",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );
    public static final Item RING_IRON_SETTING = registerItem("ring_iron_setting",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );
    public static final Item RING_GOLD_SETTING= registerItem("ring_gold_setting",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );
    public static final Item RING_DIAMOND_SETTING = registerItem("ring_diamond_setting",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );
    public static final Item RING_NETHERITE_SETTING = registerItem("ring_netherite_setting",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item NECKLACE_CHAIN_COPPER = registerItem("necklace_chain_copper",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item POLISHED_COPPER_RING = registerItem("polished_copper_ring",
            new ModRingItem_i(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );
    public static final Item POLISHED_IRON_RING = registerItem("polished_iron_ring",
            new ModRingItem_ii(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );
    public static final Item POLISHED_GOLD_RING = registerItem("polished_gold_ring",
            new ModRingItem_iii(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );
    public static final Item POLISHED_DIAMOND_RING = registerItem("polished_diamond_ring",
            new ModRingItem_iiii(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );
    public static final Item POLISHED_NETHERITE_RING = registerItem("polished_netherite_ring",
            new ModRingItem_iiiii(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );

    public static final Item BASE_COPPER_RING = registerItem("base_copper_ring",
            new ModBaseRingItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );
    public static final Item BASE_GOLD_RING = registerItem("base_gold_ring",
            new ModBaseRingItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );
    public static final Item BASE_IRON_RING = registerItem("base_iron_ring",
            new ModBaseRingItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );
    public static final Item BASE_DIAMOND_RING = registerItem("base_diamond_ring",
            new ModBaseRingItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );
    public static final Item BASE_NETHERITE_RING = registerItem("base_netherite_ring",
            new ModBaseRingItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );

    //GEAR
    //TRINKETS
    public static final Item RUBY_COPPER_RING = registerItem("ruby_copper_ring",
            new ModRingItem_i(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );
    public static final Item SAPPHIRE_COPPER_RING = registerItem("sapphire_copper_ring",
            new ModRingItem_i(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );
    public static final Item JADE_COPPER_RING = registerItem("jade_copper_ring",
            new ModRingItem_i(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );
    public static final Item TOPAZ_COPPER_RING = registerItem("topaz_copper_ring",
            new ModRingItem_i(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );

    public static final Item RUBY_IRON_RING = registerItem("ruby_iron_ring",
            new ModRingItem_i(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );
    public static final Item SAPPHIRE_IRON_RING = registerItem("sapphire_iron_ring",
            new ModRingItem_i(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );
    public static final Item JADE_IRON_RING = registerItem("jade_iron_ring",
            new ModRingItem_i(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );
    public static final Item TOPAZ_IRON_RING = registerItem("topaz_iron_ring",
            new ModRingItem_i(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );

    public static final Item RUBY_GOLD_RING = registerItem("ruby_gold_ring",
            new ModRingItem_i(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );
    public static final Item SAPPHIRE_GOLD_RING = registerItem("sapphire_gold_ring",
            new ModRingItem_i(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );
    public static final Item JADE_GOLD_RING = registerItem("jade_gold_ring",
            new ModRingItem_i(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );
    public static final Item TOPAZ_GOLD_RING = registerItem("topaz_gold_ring",
            new ModRingItem_i(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );

    public static final Item RUBY_DIAMOND_RING = registerItem("ruby_diamond_ring",
            new ModRingItem_i(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );
    public static final Item SAPPHIRE_DIAMOND_RING = registerItem("sapphire_diamond_ring",
            new ModRingItem_i(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );
    public static final Item JADE_DIAMOND_RING = registerItem("jade_diamond_ring",
            new ModRingItem_i(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );
    public static final Item TOPAZ_DIAMOND_RING = registerItem("topaz_diamond_ring",
            new ModRingItem_i(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );

    public static final Item RUBY_NETHERITE_RING = registerItem("ruby_netherite_ring",
            new ModRingItem_i(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );
    public static final Item SAPPHIRE_NETHERITE_RING = registerItem("sapphire_netherite_ring",
            new ModRingItem_i(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );
    public static final Item JADE_NETHERITE_RING = registerItem("jade_netherite_ring",
            new ModRingItem_i(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );
    public static final Item TOPAZ_NETHERITE_RING = registerItem("topaz_netherite_ring",
            new ModRingItem_i(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );


    // WEAPONS
    //SWORDS
    public static final Item BASE_SWORD_I = registerItem("sword_i",
            new ModSwordItem(ToolMaterials.IRON, 4, -2.4F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));

    public static final Item BASE_SWORD_II = registerItem("sword_ii",
            new ModSwordItem(ToolMaterials.DIAMOND, 4, -2.4F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));

    public static final Item BASE_SWORD_III = registerItem("sword_iii",
            new ModSwordItem(ToolMaterials.NETHERITE, 4, -2.4F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));

    public static final Item UNIQUE_SWORD_VOID_GRASP = registerItem("sword_unique_void_grasp",
            new ModSwordItem(ToolMaterials.NETHERITE, 4, -2.4F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF))
    );

    //AXES
    public static final Item BASE_AXE_I = registerItem("axe_i",
            new ModAxeItem(ToolMaterials.IRON, 6, -3F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));

    public static final Item BASE_AXE_II = registerItem("axe_ii",
            new ModAxeItem(ToolMaterials.DIAMOND, 6, -3F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));

    public static final Item BASE_AXE_III = registerItem("axe_iii",
            new ModAxeItem(ToolMaterials.NETHERITE, 6, -3F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));


    //DAGGERS
    public static final Item BASE_DAGGER_I = registerItem("dagger_i",
            new ModDaggerItem(ToolMaterials.IRON, 1, -1F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));

    public static final Item BASE_DAGGER_II = registerItem("dagger_ii",
            new ModDaggerItem(ToolMaterials.DIAMOND, 1, -1F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));

    public static final Item BASE_DAGGER_III = registerItem("dagger_iii",
            new ModDaggerItem(ToolMaterials.NETHERITE, 1, -1F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));

    //Gauntlets
    public static final Item BASE_GAUNTLET_I = registerItem("gauntlet_i",
            new ModGauntletItem(ToolMaterials.IRON, 2, -1.5F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));

    public static final Item BASE_GAUNTLET_II = registerItem("gauntlet_ii",
            new ModGauntletItem(ToolMaterials.DIAMOND, 2, -1.5F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));

    public static final Item BASE_GAUNTLET_III = registerItem("gauntlet_iii",
            new ModGauntletItem(ToolMaterials.NETHERITE, 2, -1.5F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));


    //HAMMERS
    public static final Item BASE_HAMMER_I = registerItem("hammer_i",
            new ModHammerItem(ToolMaterials.IRON, 8, -3.5F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));

    public static final Item BASE_HAMMER_II = registerItem("hammer_ii",
            new ModHammerItem(ToolMaterials.DIAMOND, 8, -3.5F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));

    public static final Item BASE_HAMMER_III = registerItem("hammer_iii",
            new ModHammerItem(ToolMaterials.NETHERITE, 8, -3.5F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));

    //MACES
    public static final Item BASE_MACE_I = registerItem("mace_i",
            new ModMaceItem(ToolMaterials.IRON, 7, -3.4F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));

    public static final Item BASE_MACE_II = registerItem("mace_ii",
            new ModMaceItem(ToolMaterials.DIAMOND, 7, -3.4F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));

    public static final Item BASE_MACE_III = registerItem("mace_iii",
            new ModMaceItem(ToolMaterials.NETHERITE, 7, -3.4F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));

    //SCEPTERS
    public static final Item BASE_SCEPTER_I = registerItem("scepter_i",
            new ModScepterItem(ToolMaterials.IRON, 5, -3F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));

    public static final Item BASE_SCEPTER_II = registerItem("scepter_ii",
            new ModScepterItem(ToolMaterials.DIAMOND, 5, -3F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));

    public static final Item BASE_SCEPTER_III = registerItem("scepter_iii",
            new ModScepterItem(ToolMaterials.NETHERITE, 5, -3F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));

    //SCYTHES
    public static final Item BASE_SCYTHE_I = registerItem("scythe_i",
            new ModScytheItem(ToolMaterials.IRON, 6, -3.2F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));

    public static final Item BASE_SCYTHE_II = registerItem("scythe_ii",
            new ModScytheItem(ToolMaterials.DIAMOND, 6, -3.2F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));

    public static final Item BASE_SCYTHE_III = registerItem("scythe_iii",
            new ModScytheItem(ToolMaterials.NETHERITE, 6, -3.2F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));

    //SPEARS
    public static final Item BASE_SPEAR_I = registerItem("spear_i",
            new ModSpearItem(ToolMaterials.IRON, 4, -2.5F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));

    public static final Item BASE_SPEAR_II = registerItem("spear_ii",
            new ModSpearItem(ToolMaterials.DIAMOND, 4, -2.5F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));

    public static final Item BASE_SPEAR_III = registerItem("spear_iii",
            new ModSpearItem(ToolMaterials.NETHERITE, 4, -2.5F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));

    //STAFFS
    public static final Item BASE_STAFF_I = registerItem("staff_i",
            new ModStaffItem(ToolMaterials.IRON, 1, -3.0F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));

    public static final Item BASE_STAFF_II = registerItem("staff_ii",
            new ModStaffItem(ToolMaterials.DIAMOND, 1, -3.0F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));

    public static final Item BASE_STAFF_III = registerItem("staff_iii",
            new ModStaffItem(ToolMaterials.NETHERITE, 1, -3.0F,
                    new FabricItemSettings().group(ModItemGroups.COOLSTUFF)));




    //JUNDLES

    public static final Item BASE_JUNDLE = registerItem("base_jundle",
            new JundleItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );

    public static final Item JUNDLE_ONE = registerItem("jundle_one",
            new JundleItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );

    public static final Item JUNDLE_TWO = registerItem("jundle_two",
            new JundleItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );

    public static final Item JUNDLE_THREE = registerItem("jundle_three",
            new JundleItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );

    public static final Item JUNDLE_FOUR = registerItem("jundle_four",
            new JundleItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );

    public static final Item JUNDLE_FIVE = registerItem("jundle_five",
            new JundleItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );

    public static final Item PINK_JUNDLE = registerItem("pink_jundle",
            new JundleItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );

    public static final Item MAGENTA_JUNDLE = registerItem("magenta_jundle",
            new JundleItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );

    public static final Item PURPLE_JUNDLE = registerItem("purple_jundle",
            new JundleItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );

    public static final Item BLUE_JUNDLE = registerItem("blue_jundle",
            new JundleItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );

    public static final Item LIGHT_BLUE_JUNDLE = registerItem("light_blue_jundle",
            new JundleItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );

    public static final Item CYAN_JUNDLE = registerItem("cyan_jundle",
            new JundleItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );

    public static final Item GREEN_JUNDLE = registerItem("green_jundle",
            new JundleItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );

    public static final Item LIME_JUNDLE = registerItem("lime_jundle",
            new JundleItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );

    public static final Item YELLOW_JUNDLE = registerItem("yellow_jundle",
            new JundleItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );

    public static final Item ORANGE_JUNDLE = registerItem("orange_jundle",
            new JundleItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );

    public static final Item RED_JUNDLE = registerItem("red_jundle",
            new JundleItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );

    public static final Item BROWN_JUNDLE = registerItem("brown_jundle",
            new JundleItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );

    public static final Item BLACK_JUNDLE = registerItem("black_jundle",
            new JundleItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );

    public static final Item GRAY_JUNDLE = registerItem("gray_jundle",
            new JundleItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );

    public static final Item LIGHT_GRAY_JUNDLE = registerItem("light_gray_jundle",
            new JundleItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );

    public static final Item WHITE_JUNDLE = registerItem("white_jundle",
            new JundleItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).maxCount(1)) );



    // RAW GEMS
    public static final Item TINY_RAW_RUBY = registerItem("tiny_raw_ruby",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item TINY_RAW_SAPPHIRE = registerItem("tiny_raw_sapphire",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item TINY_RAW_JADE = registerItem("tiny_raw_jade",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item TINY_RAW_TOPAZ = registerItem("tiny_raw_topaz",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item SMALL_RAW_RUBY = registerItem("small_raw_ruby",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item SMALL_RAW_SAPPHIRE = registerItem("small_raw_sapphire",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item SMALL_RAW_JADE = registerItem("small_raw_jade",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item SMALL_RAW_TOPAZ = registerItem("small_raw_topaz",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item RAW_RUBY = registerItem("raw_ruby",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.UNCOMMON)) );

    public static final Item RAW_SAPPHIRE = registerItem("raw_sapphire",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.UNCOMMON)) );

    public static final Item RAW_JADE = registerItem("raw_jade",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.UNCOMMON)) );

    public static final Item RAW_TOPAZ = registerItem("raw_topaz",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.UNCOMMON)) );

    public static final Item BIG_RAW_RUBY = registerItem("big_raw_ruby",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.RARE)) );

    public static final Item BIG_RAW_SAPPHIRE = registerItem("big_raw_sapphire",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.RARE)) );

    public static final Item BIG_RAW_JADE = registerItem("big_raw_jade",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.RARE)) );

    public static final Item BIG_RAW_TOPAZ = registerItem("big_raw_topaz",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.RARE)) );

    public static final Item HUGE_RAW_RUBY = registerItem("huge_raw_ruby",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.EPIC)) );

    public static final Item HUGE_RAW_SAPPHIRE = registerItem("huge_raw_sapphire",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.EPIC)) );

    public static final Item HUGE_RAW_JADE = registerItem("huge_raw_jade",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.EPIC)) );

    public static final Item HUGE_RAW_TOPAZ = registerItem("huge_raw_topaz",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.EPIC)) );

    //CUT GEMS
    public static final Item CHIPPED_RUBY = registerItem("chipped_ruby",
            new RubyGemItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item CHIPPED_SAPPHIRE = registerItem("chipped_sapphire",
            new SapphireGemItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item CHIPPED_JADE = registerItem("chipped_jade",
            new JadeGemItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item CHIPPED_TOPAZ = registerItem("chipped_topaz",
            new TopazGemItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item FLAWED_RUBY = registerItem("flawed_ruby",
            new RubyGemItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item FLAWED_SAPPHIRE = registerItem("flawed_sapphire",
            new SapphireGemItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item FLAWED_JADE = registerItem("flawed_jade",
            new JadeGemItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item FLAWED_TOPAZ = registerItem("flawed_topaz",
            new TopazGemItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item RUBY = registerItem("ruby",
            new RubyGemItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.UNCOMMON)) );

    public static final Item SAPPHIRE = registerItem("sapphire",
            new SapphireGemItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.UNCOMMON)) );

    public static final Item JADE = registerItem("jade",
            new JadeGemItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.UNCOMMON)) );

    public static final Item topaz = registerItem("topaz",
            new TopazGemItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.UNCOMMON)) );

    public static final Item BRILLIANT_RUBY = registerItem("brilliant_ruby",
            new RubyGemItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.RARE)) );

    public static final Item BRILLIANT_SAPPHIRE = registerItem("brilliant_sapphire",
            new SapphireGemItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.RARE)) );

    public static final Item BRILLIANT_JADE = registerItem("brilliant_jade",
            new JadeGemItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.RARE)) );

    public static final Item BRILLIANT_TOPAZ = registerItem("brilliant_topaz",
            new TopazGemItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.RARE)) );

    public static final Item PRISTINE_RUBY = registerItem("pristine_ruby",
            new RubyGemItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.EPIC)) );

    public static final Item PRISTINE_SAPPHIRE = registerItem("pristine_sapphire",
            new SapphireGemItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.EPIC)) );

    public static final Item PRISTINE_JADE = registerItem("pristine_jade",
            new JadeGemItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.EPIC)) );

    public static final Item PRISTINE_TOPAZ = registerItem("pristine_topaz",
            new TopazGemItem(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.EPIC)) );


    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CoolStuff.MOD_ID, name), item);
    }

    public static void registerModItem() {
        System.out.println("Registering Mod Items for " + CoolStuff.MOD_ID);
    }
}
