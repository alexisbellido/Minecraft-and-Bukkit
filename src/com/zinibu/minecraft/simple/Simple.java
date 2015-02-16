package com.zinibu.minecraft.simple;

import java.util.logging.Logger;

import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Pig;
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

//    public static int howlong(int years) {
    public int howlong(int years) {
        return years * 365 * 24 * 60 * 60;
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
                Location loc = me.getLocation();
                World world = loc.getWorld();

                me.playSound(loc, Sound.GHAST_SCREAM, volume, pitch);
                long secondsOld = howlong(10);
                me.sendMessage("My real age in seconds " + secondsOld);
                for (int i = 0; i < 10; i++) {
                    world.spawn(loc, Pig.class);
                }
                // ...and finish your code before this line.
                return true;
            }
        }
        return false;
    }
}
