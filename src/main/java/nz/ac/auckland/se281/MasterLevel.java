package nz.ac.auckland.se281;

public class MasterLevel implements Level {

  // Strategies for master level
  @Override
  public Strategy useStrategy(int numOfRound) {
    // If the number of round is bigger than or equal to 4 and even, use average strategy
    if (numOfRound >= 4 && (numOfRound % 2 == 0)) {
      Strategy strategy = new AverageStrategy();
      return strategy;
      // If the number of round is bigger than or equal to 4 and odd, use top strategy
    } else if (numOfRound >= 4 && (numOfRound % 2 != 0)) {
      Strategy strategy = new TopStrategy();
      return strategy;
      // Use random strategy upto round 3
    } else {
      Strategy strategy = new RandomStrategy();
      return strategy;
    }
  }
}
