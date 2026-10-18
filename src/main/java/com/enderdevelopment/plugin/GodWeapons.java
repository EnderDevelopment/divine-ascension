package com.enderdevelopment.plugin;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GodWeapons {
    public static void giveGodWeapon(Player player) {
        // Create a god weapon
        ItemStack godWeapon = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta meta = godWeapon.getItemMeta();
        meta.setDisplayName("God Sword");
        godWeapon.setItemMeta(meta);

        // Give the god weapon to the player
        player.getInventory().addItem(godWeapon);
    }
}