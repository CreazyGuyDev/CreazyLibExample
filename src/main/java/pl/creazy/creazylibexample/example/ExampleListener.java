package pl.creazy.creazylibexample.example;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import pl.creazy.creazylib.part.constraints.Part;
import pl.creazy.creazylib.util.message.Message;

@Part // listeners from part will be auto registered
class ExampleListener implements Listener {
  @Part // Can inject other parts to fields inside current part
  private ExampleManager exampleManager;

  @EventHandler
  void onEvent(PlayerJoinEvent event) {
    Message.sendChat(event.getPlayer(), "&aSiema"); // This will format and send the message to the player
  }
}
