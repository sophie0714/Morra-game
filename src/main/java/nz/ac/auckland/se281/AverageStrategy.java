package nz.ac.auckland.se281;

import java.util.ArrayList;

public class AverageStrategy implements Strategy {

  @Override
  public String getNumbers() {
    // Generate random number for fingers
    int fingers = Utils.getRandomNumber(1, 5);

    // Enable to access non-static reference
    Morra morra_obj = new Morra();
    ArrayList<Integer> history = morra_obj.getHistory();

    // Calculate the average of human's historical fingers numbers
    int sumOfHistory = 0;
    for (int i = 0; i < history.size() - 1; i++) {
      sumOfHistory += history.get(i);
    }
    int avg = Math.round(sumOfHistory / (history.size() - 1));

    // Calculate sum based on the average and ai's fingers
    int sum = fingers + avg;

    // Return two numbers in String type
    return Integer.toString(fingers) + " " + Integer.toString(sum);
  }
}
