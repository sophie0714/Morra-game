package nz.ac.auckland.se281;

public class HardLevel implements Level {

  // Strategies for hard level
  @Override
  public Strategy useStrategy(Morra morra) {
    int numOfRound = morra.getNumOfRound();
    // If the number of round is bigger than or equal to 4, use top strategy
    if (numOfRound >= 4) {
      Strategy strategy = new TopStrategy();
      return strategy;
      // Use random strategy upto round 3
    } else {
      Strategy strategy = new RandomStrategy();
      return strategy;
    }
  }
}
