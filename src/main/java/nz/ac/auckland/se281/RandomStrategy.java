package nz.ac.auckland.se281;

public class RandomStrategy implements Strategy {

  @Override
  public String getNumbers() {
    // Randomly generate fingers and sum within the range
    int fingers = Utils.getRandomNumber(1, 5);
    int sum = Utils.getRandomNumber(fingers + 1, fingers + 5);
    return Integer.toString(fingers) + " " + Integer.toString(sum);
  }
}
