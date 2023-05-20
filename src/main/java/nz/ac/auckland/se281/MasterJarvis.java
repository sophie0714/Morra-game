package nz.ac.auckland.se281;

import java.util.ArrayList;

public class MasterJarvis extends Jarvis {

  private int numOfRound;
  private ArrayList<Integer> history;

  public MasterJarvis(Strategy strategy, int numOfRound, ArrayList<Integer> history) {
    super(strategy);
    this.numOfRound = numOfRound;
    this.history = history;
  }

  // Strategies for master level
  @Override
  public void useStrategy() {
    // If the number of round is bigger than or equal to 4 and even, use average strategy
    if (numOfRound >= 4 && (numOfRound % 2 == 0)) {
      setStrategy(new AverageStrategy(history));
      // If the number of round is bigger than or equal to 4 and odd, use top strategy
    } else if (numOfRound >= 4 && (numOfRound % 2 != 0)) {
      setStrategy(new TopStrategy(history));
      // Use random strategy upto round 3
    } else {
      setStrategy(new RandomStrategy());
    }
  }
}
