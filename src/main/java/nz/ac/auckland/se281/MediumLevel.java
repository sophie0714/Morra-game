package nz.ac.auckland.se281;

import java.util.ArrayList;

public class MediumLevel extends Level {

  private int numOfRound;
  private ArrayList<Integer> history;

  public MediumLevel(Strategy strategy, int numOfRound, ArrayList<Integer> history) {
    super(strategy);
    this.numOfRound = numOfRound;
    this.history = history;
  }

  // Strategies for medium level
  @Override
  public void useStrategy() {
    // If the round is bigger than or equal to 4, use average strategy
    if (numOfRound >= 4) {
      setStrategy(new AverageStrategy(history));
      // Use random strategy for upto round 3
    } else {
      setStrategy(new RandomStrategy());
    }
  }
}
