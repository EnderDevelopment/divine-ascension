package com.enderdevelopment.plugin;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SummonWeaponCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack weapon = new ItemStack(Material.DIAMOND_SWORD);
            ItemMeta meta = weapon.getItemMeta();
            meta.setDisplayName("God Sword");
            weapon.setItemMeta(meta);
            player.getInventory().addItem(weapon);
            player.sendMessage("You have summoned a God Sword!");
            return true;
        } else {
            sender.sendMessage("Only players can use this command.");
            return false;
        }
    }
}