package com.zinibu.minecraft.byepeople;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class ByePeople extends JavaPlugin {
    public static Logger log = Logger.getLogger("Minecraft");

    public void onLoad() {
        log.info("[ByePeople] Loaded.");
    }

    public void onEnable() {
        log.info("[ByePeople] Starting up.");
    }

    public void onDisable() {
        log.info("[ByePeople] Stopping.");
    }

    public boolean onCommand(CommandSender sender, Command command,
                             String commandLabel, String[] args) {
        if (commandLabel.equalsIgnoreCase("byepeople")) {
            String msg = "[Server] Goodbye people...";
            getServer().broadcastMessage(msg);
            return true;
        }
        return false;
    }
}