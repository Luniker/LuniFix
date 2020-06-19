package net.luniker.lunifix;

import net.luniker.lunifix.listeners.LunikerFixListener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class LuniFix extends JavaPlugin {
    @Override
    public void onEnable() {
        PluginManager pluginManager = getServer().getPluginManager();
        pluginManager.registerEvents(new LunikerFixListener(), this);
    }
}
