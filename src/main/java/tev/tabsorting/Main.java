package tev.tabsorting;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Plugin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class Main extends Plugin {
    public static List<String> nickedplayers = new ArrayList<>();
    @Override
    public void onEnable() {
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new hidetabplayer(this));
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new restoretabposition(this));

        ProxyServer.getInstance().getScheduler().schedule(this, new Runnable() {
            public void run() { sorting.sorting(); }
        }, 3, 1, TimeUnit.SECONDS);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
