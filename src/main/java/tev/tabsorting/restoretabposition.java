package tev.tabsorting;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class restoretabposition extends Command {
    public restoretabposition(Main name) {
        super("rtpos");
    }

    public restoretabposition(String name, String permission, String... aliases) {
        super("rtpos", "*", aliases);
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        Main.nickedplayers.remove(args[0]);
    }
}
