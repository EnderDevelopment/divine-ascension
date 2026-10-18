package com.enderdevelopment.plugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class GodGUI {
    public static void openGodGUI(Player player) {
        Inventory gui = Bukkit.createInventory(null, 27, "God Powers and Weapons");

        // God Powers
        ItemStack lightningPower = createGuiItem(Material.BLAZE_ROD, "Lightning Power", "Strike lightning at your target");
        ItemStack healPower = createGuiItem(Material.GOLDEN_APPLE, "Heal Power", "Heal yourself or others");
        ItemStack flightPower = createGuiItem(Material.FEATHER, "Flight Power", "Toggle flight mode");

        // God Weapons
        ItemStack swordOfGods = createGuiItem(Material.DIAMOND_SWORD, "Sword of Gods", "A powerful weapon of the gods");
        ItemStack staffOfGods = createGuiItem(Material.STICK, "Staff of Gods", "A magical staff of the gods");

        gui.setItem(10, lightningPower);
        gui.setItem(12, healPower);
        gui.setItem(14, flightPower);
        gui.setItem(16, swordOfGods);
        gui.setItem(22, staffOfGods);

        player.openInventory(gui);
    }

    private static ItemStack createGuiItem(Material material, String name, String... lore) {
        ItemStack item = new ItemStack(material, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(Arrays.asList(lore));
        item.setItemMeta(meta);
        return item;
    }
}