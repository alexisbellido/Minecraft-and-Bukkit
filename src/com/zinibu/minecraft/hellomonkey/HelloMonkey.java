package com.zinibu.minecraft.hellomonkey;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class HelloMonkey extends JavaPlugin {
    public static Logger log = Logger.getLogger("Minecraft");

    public void onLoad() {
        log.info("[HelloMonkey] Loaded.");
    }

    public void onEnable() {
        log.info("[HelloMonkey] Starting up.");
    }

    public void onDisable() {
        log.info("[HelloMonkey] Stopping.");
    }

    public boolean onCommand(CommandSender sender, Command command,
                             String commandLabel, String[] args) {
        if (commandLabel.equalsIgnoreCase("hellomonkey")) {
            String msg = "[Server] Hey Monkey...";
            getServer().broadcastMessage(msg);
            return true;
        }
        return false;
    }
}
