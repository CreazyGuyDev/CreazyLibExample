package pl.creazy.creazylibexample.example;

import pl.creazy.creazylib.log.Logger;
import pl.creazy.creazylib.part.constraints.OnDisable;
import pl.creazy.creazylib.part.constraints.OnEnable;
import pl.creazy.creazylib.part.constraints.Part;
import pl.creazy.creazylibexample.CreazyLibExample;

@Part
class ExampleManager {
  @Part
  private CreazyLibExample example;

  @OnEnable
  void onEnable(@Part Logger logger) {
    logger.info("enabled");
  }

  @OnDisable
  void onDisable(@Part Logger logger) {
    logger.info("disabled");
  }
}
