package kol19pl.powitanieserwerowe;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.defaults.HelpCommand;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class PowitanieSerwerowe extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        this.getServer().getPluginManager().registerEvents(this,this);
        getLogger().info("Powitanie załadowane");



    }


    @Override
    public void onDisable() {

        getLogger().info("Powitanie poszło spać");
        // shutdown
        // reloads
        // p reload
    }

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event){
        //  event.setJoinMessage("Witaj");
        Player player = event.getPlayer();
        player.sendTitle("Witaj "+ player.getDisplayName() ," Miłej zabawy!",60,60,60);

        World world= player.getWorld();
        Location loc = player.getLocation();
        Location spawn = world.getSpawnLocation();


        world.strikeLightningEffect(loc);
        world.strikeLightningEffect(spawn);

        //player.sendRawMessage("Test");

    }


}
