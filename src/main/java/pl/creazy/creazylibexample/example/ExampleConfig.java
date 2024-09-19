package pl.creazy.creazylibexample.example;

import pl.creazy.creazylib.data.persistence.config.Config;
import pl.creazy.creazylib.part.constraints.OnEnable;
import pl.creazy.creazylib.part.constraints.Part;
import pl.creazy.creazylibexample.CreazyLibExample;

@Part
class ExampleConfig {
  @OnEnable // This method will run when part gets enabled
  void testConfig(@Part CreazyLibExample plugin) { // can use other parts inside @OnEnable
    var config = Config.getConfig("name", "path", plugin);
    config.set("path", "value");
    config.set("number", 21);
    config.save();
  }
}
