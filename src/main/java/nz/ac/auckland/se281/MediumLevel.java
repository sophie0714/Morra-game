package nz.ac.auckland.se281;

import java.util.ArrayList;

public class MediumLevel implements Level {

  private int numOfRound;
  private ArrayList<Integer> history;

  public MediumLevel(int numOfRound, ArrayList<Integer> history) {
    this.numOfRound = numOfRound;
    this.history = history;
  }

  // Strategies for medium level
  @Override
  public String useStrategy() {
    // If the round is bigger than or equal to 4, use average strategy
    if (numOfRound >= 4) {
      Strategy strategy = new AverageStrategy(history);
      return strategy.getNumbers();
      // Use random strategy for upto round 3
    } else {
      Strategy strategy = new RandomStrategy();
      return strategy.getNumbers();
    }
  }
}
