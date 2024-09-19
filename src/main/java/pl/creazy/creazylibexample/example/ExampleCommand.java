package pl.creazy.creazylibexample.example;

import org.bukkit.entity.Player;
import pl.creazy.creazylib.command.constraints.Args;
import pl.creazy.creazylib.command.constraints.Command;
import pl.creazy.creazylib.command.constraints.HasPermissions;
import pl.creazy.creazylib.part.constraints.Part;
import pl.creazy.creazylib.util.message.Message;

@Part
@Command("example")
class ExampleCommand {
  @Args("hello ?s")
  @HasPermissions("example.hello")
  void hello(Player player, String message) {
    Message.sendActionBar(player, message);
  }
}
