package net.sattes.runetech_theory.professions;

import com.github.clevernucleus.dataattributes.api.DataAttributesAPI;
import com.github.clevernucleus.playerex.api.IConfig;
import com.github.clevernucleus.playerex.config.ConfigImpl;
import me.shedaniel.autoconfig.AutoConfig;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.util.Identifier;
import java.util.function.Supplier;

public class StatsHelper {
    public static final Supplier<EntityAttribute> PROFESSION_HARVESTING = DataAttributesAPI.getAttribute(new Identifier("runetech_theory:profession_harvesting"));
    public static final Supplier<EntityAttribute> PROFESSION_MINING = DataAttributesAPI.getAttribute(new Identifier("runetech_theory:profession_mining"));
    public static final Supplier<EntityAttribute> PROFESSION_WOODWORKING = DataAttributesAPI.getAttribute(new Identifier("runetech_theory:profession_woodworking"));
    public static final Supplier<EntityAttribute> PROFESSION_HUNTING = DataAttributesAPI.getAttribute(new Identifier("runetech_theory:profession_hunting"));
    public static final Supplier<EntityAttribute> PROFESSION_FISHING = DataAttributesAPI.getAttribute(new Identifier("runetech_theory:profession_fishing"));
    public static final Supplier<EntityAttribute> PROFESSION_COOKING = DataAttributesAPI.getAttribute(new Identifier("runetech_theory:profession_cooking"));
    public static final Supplier<EntityAttribute> PROFESSION_ENGINEERING = DataAttributesAPI.getAttribute(new Identifier("runetech_theory:profession_engineering"));
    public static final Supplier<EntityAttribute> PROFESSION_RUNETHEORY = DataAttributesAPI.getAttribute(new Identifier("runetech_theory:profession_rune_theory"));
    public static final Supplier<EntityAttribute> PROFESSION_SMITHING = DataAttributesAPI.getAttribute(new Identifier("runetech_theory:profession_smithing"));

    public StatsHelper(){}

    public static IConfig getConfig() {
        return (IConfig) AutoConfig.getConfigHolder(ConfigImpl.class).get();
    }

    private static Supplier<EntityAttribute> define(String path) {
        return DataAttributesAPI.getAttribute(new Identifier("runetech_theory", path));
    }



}
