package pl.creazy.creazylibexample.example;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import pl.creazy.creazylib.part.constraints.Part;
import pl.creazy.creazylib.util.message.Message;

@Part
class ExampleListener implements Listener {
  @Part
  private ExampleManager exampleManager;

  @EventHandler
  void onEvent(PlayerJoinEvent event) {
    Message.sendChat(event.getPlayer(), "&aSiema");
  }
}
