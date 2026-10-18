package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
    private final GodPowers godPowers = new GodPowers();
    private final GodWeapons godWeapons = new GodWeapons();
    @Override
    public void onEnable() {
    getServer().getPluginManager().registerEvents(this, this);
        this.getCommand("godmode").setExecutor(new GodModeCommand(godPowers));
        this.getCommand("godweapon").setExecutor(new GodWeaponCommand(godWeapons));
        getLogger().info("GodPlugin has been enabled!");
        getServer().getPluginManager().registerEvents(new GodGUIListener(), this);
        this.getCommand("godmode").setExecutor(new GodModeCommand());
        this.getCommand("summonweapon").setExecutor(new SummonWeaponCommand());
        this.getCommand("godgui").setExecutor(new GodGUICommand());
    }

    @Override
    public void onDisable() {
    // Plugin shutdown logic
        getLogger().info("GodPlugin has been disabled!");
    }
}