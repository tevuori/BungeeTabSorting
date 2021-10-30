package tev.tabsorting;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class hidetabplayer extends Command {
    public hidetabplayer(Main name) {
        super("htpos");
    }

    public hidetabplayer(String name, String permission, String... aliases) {
        super("htpos","*", aliases);
    }

    @Override
    public void execute(CommandSender sender, String[] args) {

        Main.nickedplayers.add(args[0]);
    }
}
