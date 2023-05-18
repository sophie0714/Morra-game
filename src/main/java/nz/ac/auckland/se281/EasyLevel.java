package nz.ac.auckland.se281;

import java.util.ArrayList;

public class EasyLevel implements Level {
  @Override
  public String useStrategy(int numOfRound,ArrayList<Integer> history) {
    // Always use random strategy
    Strategy strategy = new RandomStrategy();
    return strategy.getNumbers();
  }
}
