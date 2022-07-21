package me.MrRafter.MrRafter_Dupe;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    private static Main plugin;
    
    public void onEnable() {
        Main.plugin = this;
        me.MrRafter.MrRafter_Dupe.Util.load();
    }
    
    public static Main getPlugin() {
        return Main.plugin;
    }
}
