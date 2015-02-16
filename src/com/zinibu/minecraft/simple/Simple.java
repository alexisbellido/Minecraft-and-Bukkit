package com.zinibu.minecraft.simple;

import java.util.logging.Logger;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Simple extends JavaPlugin {
    public static Logger log = Logger.getLogger("Minecraft");

    public void onLoad() {
        log.info("[Simple] Loaded.");
    }

    public void onEnable() {
        log.info("[Simple] Starting up.");
    }

    public void onDisable() {
        log.info("[Simple] Stopping.");
    }

    public boolean onCommand(CommandSender sender, Command command,
                             String commandLabel, String[] args) {
        if (commandLabel.equalsIgnoreCase("simple")) {
            if (sender instanceof Player) {
                Player me = (Player)sender;
                // Put your code after this line:
                String myName = "Alexis";
                me.sendMessage("Hola " + myName);
                log.info("say name " + myName);
                float volume = 0.1f;
                float pitch = 1.0f;
                me.playSound(me.getLocation(), Sound.GHAST_SCREAM, volume, pitch);
                // ...and finish your code before this line.
                return true;
            }
        }
        return false;
    }
}
