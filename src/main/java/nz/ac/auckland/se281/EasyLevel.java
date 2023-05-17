package nz.ac.auckland.se281;

public class EasyLevel implements Level {
  @Override
  public String useStrategy(int numOfRound) {
    Strategy strategy = new RandomStrategy();
    return strategy.getNumbers();
  }
}
