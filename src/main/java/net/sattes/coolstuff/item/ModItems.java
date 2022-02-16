package net.sattes.coolstuff.item;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.sattes.coolstuff.CoolStuff;
import net.sattes.coolstuff.item.custom.JundleItem;

public class ModItems {

    //MISC

    public static final Item RAW_RESIN = registerItem("raw_resin",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item RESIN_FLASK = registerItem("resin_flask",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item SANDPAPER = registerItem("sandpaper",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );


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
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item CHIPPED_SAPPHIRE = registerItem("chipped_sapphire",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item CHIPPED_JADE = registerItem("chipped_jade",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item CHIPPED_TOPAZ = registerItem("chipped_topaz",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item FLAWED_RUBY = registerItem("flawed_ruby",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item FLAWED_SAPPHIRE = registerItem("flawed_sapphire",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item FLAWED_JADE = registerItem("flawed_jade",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item FLAWED_TOPAZ = registerItem("flawed_topaz",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.COMMON)) );

    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.UNCOMMON)) );

    public static final Item SAPPHIRE = registerItem("sapphire",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.UNCOMMON)) );

    public static final Item JADE = registerItem("jade",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.UNCOMMON)) );

    public static final Item topaz = registerItem("topaz",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.UNCOMMON)) );

    public static final Item BRILLIANT_RUBY = registerItem("brilliant_ruby",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.RARE)) );

    public static final Item BRILLIANT_SAPPHIRE = registerItem("brilliant_sapphire",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.RARE)) );

    public static final Item BRILLIANT_JADE = registerItem("brilliant_jade",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.RARE)) );

    public static final Item BRILLIANT_TOPAZ = registerItem("brilliant_topaz",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.RARE)) );

    public static final Item PRISTINE_RUBY = registerItem("pristine_ruby",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.EPIC)) );

    public static final Item PRISTINE_SAPPHIRE = registerItem("pristine_sapphire",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.EPIC)) );

    public static final Item PRISTINE_JADE = registerItem("pristine_jade",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.EPIC)) );

    public static final Item PRISTINE_TOPAZ = registerItem("pristine_topaz",
            new Item(new FabricItemSettings().group(ModItemGroups.COOLSTUFF).rarity(Rarity.EPIC)) );


    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CoolStuff.MOD_ID, name), item);
    }

    public static void registerModItem() {
        System.out.println("Registering Mod Items for " + CoolStuff.MOD_ID);
    }
}
