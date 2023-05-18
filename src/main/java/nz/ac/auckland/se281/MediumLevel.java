package nz.ac.auckland.se281;

public class MediumLevel implements Level {

  // Strategies for medium level
  @Override
  public Strategy useStrategy(int numOfRound) {
    // If the round is bigger than or equal to 4, use average strategy
    if (numOfRound >= 4) {
      Strategy strategy = new AverageStrategy();
      return strategy;
      // Use random strategy for upto round 3
    } else {
      Strategy strategy = new RandomStrategy();
      return strategy;
    }
  }
}
