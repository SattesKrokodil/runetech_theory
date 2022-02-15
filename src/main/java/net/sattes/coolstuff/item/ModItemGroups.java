package net.sattes.coolstuff.item;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.sattes.coolstuff.CoolStuff;


public class ModItemGroups {
    public static final ItemGroup COOLSTUFF = FabricItemGroupBuilder.build(new Identifier(CoolStuff.MOD_ID, "coolstuff"),
            () -> new ItemStack(ModItems.RUBY));
}
