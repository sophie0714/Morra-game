package nz.ac.auckland.se281;

import java.util.ArrayList;

public class MasterLevel implements Level {

  private int numOfRound;
  private ArrayList<Integer> history;

  public MasterLevel(int numOfRound, ArrayList<Integer> history){
    this.numOfRound = numOfRound;
    this.history = history;
  }

  // Strategies for master level
  @Override
  public String useStrategy() {
    // If the number of round is bigger than or equal to 4 and even, use average strategy
    if (numOfRound >= 4 && (numOfRound % 2 == 0)) {
      Strategy strategy = new AverageStrategy(history);
      return strategy.getNumbers();
      // If the number of round is bigger than or equal to 4 and odd, use top strategy
    } else if (numOfRound >= 4 && (numOfRound % 2 != 0)) {
      Strategy strategy = new TopStrategy(history);
      return strategy.getNumbers();
      // Use random strategy upto round 3
    } else {
      Strategy strategy = new RandomStrategy();
      return strategy.getNumbers();
    }
  }
}
