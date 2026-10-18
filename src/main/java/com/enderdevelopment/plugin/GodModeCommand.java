package com.enderdevelopment.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GodModeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.setInvulnerable(!player.isInvulnerable());
            player.sendMessage("God mode " + (player.isInvulnerable() ? "enabled" : "disabled") + "!");
            return true;
        } else {
            sender.sendMessage("Only players can use this command.");
            return false;
        }
    }
}