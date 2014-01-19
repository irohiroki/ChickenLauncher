package chickenlauncher;

import java.util.logging.Logger;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

public class ChickenLauncher extends JavaPlugin implements Listener {
  public static Logger log = Logger.getLogger("Minecraft");

  public void onEnable() {
    getServer().getPluginManager().registerEvents(this, this);
  }

  @EventHandler
  public void onInteract(PlayerInteractEvent event) {
    if (event.getAction() == Action.LEFT_CLICK_AIR) {
      final Player player = event.getPlayer();
      if (player.getItemInHand().getType() == Material.WOOL) {
        Location loc = player.getLocation();
        Vector vec = loc.getDirection();
        int k = 2;
        vec.setX(vec.getX() * k);
        vec.setY(vec.getY() * k);
        vec.setZ(vec.getZ() * k);

        final Chicken chicken = player.getWorld().spawn(loc, Chicken.class);
        chicken.setVelocity(vec);
      }
    }
  }
}
