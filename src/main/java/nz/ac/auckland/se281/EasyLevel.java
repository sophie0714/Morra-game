package nz.ac.auckland.se281;

public class EasyLevel implements Level {
  @Override
  public Strategy useStrategy(Morra morra) {
    // Always use random strategy
    Strategy strategy = new RandomStrategy();
    return  strategy;
  }
}
