package com.enderdevelopment.plugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class GodGUIListener implements Listener {
    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (!event.getView().getTitle().equals("God Powers and Weapons")) {
            return;
        }

        event.setCancelled(true);
        Player player = (Player) event.getWhoClicked();
        ItemStack clickedItem = event.getCurrentItem();

        if (clickedItem == null || !clickedItem.hasItemMeta()) {
            return;
        }

        String itemName = clickedItem.getItemMeta().getDisplayName();

        switch (itemName) {
            case "Lightning Power":
                player.sendMessage("You have selected Lightning Power!");
                // Add lightning power logic here
                break;
            case "Heal Power":
                player.sendMessage("You have selected Heal Power!");
                // Add heal power logic here
                break;
            case "Flight Power":
                player.sendMessage("You have selected Flight Power!");
                // Add flight power logic here
                break;
            case "Sword of Gods":
                player.sendMessage("You have selected Sword of Gods!");
                // Add sword of gods logic here
                break;
            case "Staff of Gods":
                player.sendMessage("You have selected Staff of Gods!");
                // Add staff of gods logic here
                break;
            default:
                break;
        }
    }
}