package tech.itexpress.gamemode;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Gamemode extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("GMControl wurde aktiviert.");
    }

    @Override
    public void onDisable() {
        getLogger().info("GMControl wurde deaktiviert... Bis bald.");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (label.equalsIgnoreCase("gm") && args.length == 1) {
                switch (args[0]) {
                    case "1":
                        player.setGameMode(org.bukkit.GameMode.SURVIVAL);
                        player.sendMessage("Dein Spielmodus wurde auf Überleben geändert.");
                        break;
                    case "2":
                        player.setGameMode(org.bukkit.GameMode.CREATIVE);
                        player.sendMessage("Du bist nun im Kreativmodus.");
                        break;
                    case "3":
                        player.setGameMode(org.bukkit.GameMode.ADVENTURE);
                        player.sendMessage("Dein Spielmodus wurde auf Abenteuer geändert.");
                        break;
                    case "4":
                        player.setGameMode(org.bukkit.GameMode.SPECTATOR);
                        player.sendMessage("Du bist jetzt Zuschauer.");
                        break;
                    default:
                        player.sendMessage("Ungültiger Argument. Verwende /gm 1, /gm 2, /gm 3 oder /gm 4.");
                        break;
                }
                return true;
            }

        }
        return false;
    }
}
