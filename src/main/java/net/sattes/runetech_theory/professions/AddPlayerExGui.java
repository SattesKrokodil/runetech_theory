package net.sattes.runetech_theory.professions;

import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class AddPlayerExGui {

    public static void registerPage(final Identifier pageId, final Identifier icon, final Text title) {
        com.github.clevernucleus.playerex.client.gui.PageRegistryImpl.addPage(pageId, icon, title);

    }

}
