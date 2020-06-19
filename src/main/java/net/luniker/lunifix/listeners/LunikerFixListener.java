package net.luniker.lunifix.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;
import org.bukkit.event.player.PlayerItemDamageEvent;

public class LunikerFixListener implements Listener {

    @EventHandler
    public void onPlayerItemDamageEvent(PlayerItemDamageEvent event) {
        event.setCancelled(true);
    }

    @EventHandler
    public void onEntityDamageEvent(EntityDamageEvent event) {
        if (event.getEntity() instanceof Player) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onEntityTargetLivingEntityEvent(EntityTargetLivingEntityEvent event) {
        if (!(event.getTarget() instanceof Player)) {
            return;
        }
        if (event.getReason() == EntityTargetEvent.TargetReason.TARGET_ATTACKED_ENTITY) {
            return;
        }

        event.setCancelled(true);
    }

}
