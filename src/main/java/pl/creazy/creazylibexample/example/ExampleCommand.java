package pl.creazy.creazylibexample.example;

import org.bukkit.entity.Player;
import pl.creazy.creazylib.command.constraints.Args;
import pl.creazy.creazylib.command.constraints.Command;
import pl.creazy.creazylib.command.constraints.HasPermissions;
import pl.creazy.creazylib.part.constraints.Part;
import pl.creazy.creazylib.util.message.Message;

@Part
@Command("example") // this will register command. Remember to put command inside plugin.yml file
class ExampleCommand {
  @Args("hello ?s") // ?s for any string, ?i for any int, ?d for any double, ?e for any enum
  @HasPermissions("example.hello")
  void hello(Player player, String message) { // message == ?s
    Message.sendActionBar(player, message);
  }
}
