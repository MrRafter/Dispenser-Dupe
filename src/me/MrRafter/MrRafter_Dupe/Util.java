package me.MrRafter.MrRafter_Dupe;

import java.util.Random;
import org.bukkit.plugin.Plugin;
import org.bukkit.event.Listener;
import org.bukkit.Bukkit;

public class Util
{
    private static Integer chance;
    
    protected static void load() {
        Main.getPlugin().saveDefaultConfig();
        if (Main.getPlugin().getConfig().getBoolean("enable.dispenser")) {
            Bukkit.getServer().getPluginManager().registerEvents((Listener)new Dispenser(), (Plugin)Main.getPlugin());
        }
        if (Main.getPlugin().getConfig().getBoolean("enable.dropper")) {
            Bukkit.getServer().getPluginManager().registerEvents((Listener)new Dropper(), (Plugin)Main.getPlugin());
        }
        Util.chance = Main.getPlugin().getConfig().getInt("settings.probability");
    }
    
    public static Boolean chanceOf() {
        final Random r = new Random();
        final int g = r.nextInt(100);
        if (g <= Util.chance) {
            return true;
        }
        return false;
    }
}
