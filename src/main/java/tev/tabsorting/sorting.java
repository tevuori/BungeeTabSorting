package tev.tabsorting;

import me.neznamy.tab.api.TabPlayer;
import me.neznamy.tab.shared.TAB;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;

import java.util.*;

public class sorting {
    public static void sorting(){
        HashMap<ProxiedPlayer, Integer> allplayers = new HashMap<>();
        for (ProxiedPlayer p: ProxyServer.getInstance().getPlayers()){
            if(Main.nickedplayers.contains(p.getName())){
                allplayers.put(p, 10);
            }else if(p.hasPermission("weight.100")){
                allplayers.put(p, 100);
            }else if(p.hasPermission("weight.70")){
                allplayers.put(p, 70);
            }else if(p.hasPermission("weight.55")){
                allplayers.put(p, 55);
            }else if(p.hasPermission("weight.52")){
                allplayers.put(p, 52);
            }else if(p.hasPermission("weight.50")){
                allplayers.put(p, 50);
            }else if(p.hasPermission("weight.49")){
                allplayers.put(p, 49);
            }else if(p.hasPermission("weight.14")){
                allplayers.put(p, 14);
            }else if(p.hasPermission("weight.13")){
                allplayers.put(p, 13);
            }else if(p.hasPermission("weight.12")){
                allplayers.put(p, 12);
            }else if(p.hasPermission("weight.11")){
                allplayers.put(p, 11);
            }else if(p.hasPermission("weight.10")){
                allplayers.put(p, 10);
            }
        }
        System.out.println(allplayers);
        System.out.println("-----------------");
        Map<ProxiedPlayer, Integer> sortedplayers = sortByValue(allplayers);
        System.out.println(sortedplayers);
        System.out.println("-----------------");
        List<TabPlayer> sortedplayersinlist = new ArrayList();
        for (ProxiedPlayer po: sortedplayers.keySet()) {
            TabPlayer poo = TAB.getInstance().getPlayer(po.getUniqueId());
            sortedplayersinlist.add(poo);
        }
        System.out.println(sortedplayersinlist);
        System.out.println("-----------------");
        sortedplayersinlist.forEach((pp) -> TAB.getInstance().removePlayer(pp));
        sortedplayersinlist.forEach((pl) -> TAB.getInstance().addPlayer(pl));

    }
    public static HashMap<ProxiedPlayer, Integer> sortByValue(HashMap<ProxiedPlayer, Integer> hm)
    {
        List<Map.Entry<ProxiedPlayer, Integer> > list =
                new LinkedList<Map.Entry<ProxiedPlayer, Integer> >(hm.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<ProxiedPlayer, Integer> >() {
            public int compare(Map.Entry<ProxiedPlayer, Integer> o1,
                               Map.Entry<ProxiedPlayer, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        HashMap<ProxiedPlayer, Integer> temp = new LinkedHashMap<ProxiedPlayer, Integer>();
        for (Map.Entry<ProxiedPlayer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}
