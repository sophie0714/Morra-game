package nz.ac.auckland.se281;

public class EasyLevel implements Level {
  @Override
  public Strategy useStrategy(int numOfRound) {
    // Always use random strategy
    Strategy strategy = new RandomStrategy();
    return strategy;
  }
}
