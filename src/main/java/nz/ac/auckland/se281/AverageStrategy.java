package nz.ac.auckland.se281;

import java.util.ArrayList;

public class AverageStrategy implements Strategy {

  @Override
  public String getNumbers(Morra morra) {
    // Generate random number for fingers
    int fingers = Utils.getRandomNumber(1, 5);

    // Call history of human's fingers
    ArrayList<Integer> history = morra.getHistory();

    // Calculate the average of human's historical fingers numbers
    int sumOfHistory = 0;
    for (int i = 0; i < history.size(); i++) {
      sumOfHistory += history.get(i);
    }
    Double avg = (double) sumOfHistory / (double) history.size();
    int roundAverage = (int) Math.round(avg);

    // Calculate sum based on the average and ai's fingers
    int sum = fingers + roundAverage;

    // Return two numbers in String type
    return Integer.toString(fingers) + " " + Integer.toString(sum);
  }
}
