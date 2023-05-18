package nz.ac.auckland.se281;

public class EasyLevel implements Level {
  @Override
  public String useStrategy() {
    // Always use random strategy
    Strategy strategy = new RandomStrategy();
    return strategy.getNumbers();
  }
}
