package nz.ac.auckland.se281;

import java.util.ArrayList;

public class HardLevel extends Level {

  private int numOfRound;
  private ArrayList<Integer> history;

  public HardLevel(Strategy strategy, int numOfRound, ArrayList<Integer> history) {
    super(strategy);
    this.numOfRound = numOfRound;
    this.history = history;
  }

  // Strategies for hard level
  @Override
  public void useStrategy() {
    // If the number of round is bigger than or equal to 4, use top strategy
    if (numOfRound >= 4) {
      setStrategy(new TopStrategy(history));
      // Use random strategy upto round 3
    } else {
      setStrategy(new RandomStrategy());
    }
  }
}
