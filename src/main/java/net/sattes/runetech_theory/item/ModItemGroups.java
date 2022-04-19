package net.sattes.runetech_theory.item;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.sattes.runetech_theory.RunetechTheory;


public class ModItemGroups {
    public static final ItemGroup COOLSTUFF = FabricItemGroupBuilder.build(new Identifier(RunetechTheory.MOD_ID, "runetech_theory"),
            () -> new ItemStack(ModItems.RUBY));
}
