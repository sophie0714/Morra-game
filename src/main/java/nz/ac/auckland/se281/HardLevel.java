package nz.ac.auckland.se281;

import java.util.ArrayList;

public class HardLevel implements Level {

  private int numOfRound;
  private ArrayList<Integer> history;

  public HardLevel(int numOfRound, ArrayList<Integer> history) {
    this.numOfRound = numOfRound;
    this.history = history;
  }

  // Strategies for hard level
  @Override
  public String useStrategy() {
    // If the number of round is bigger than or equal to 4, use top strategy
    if (numOfRound >= 4) {
      Strategy strategy = new TopStrategy(history);
      return strategy.getNumbers();
      // Use random strategy upto round 3
    } else {
      Strategy strategy = new RandomStrategy();
      return strategy.getNumbers();
    }
  }
}
