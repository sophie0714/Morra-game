package nz.ac.auckland.se281;

import java.util.ArrayList;
import java.util.Collections;

public class TopStrategy implements Strategy {

  @Override
  public String getNumbers(Morra morra) {
    // Generate random number for fingers
    int fingers = Utils.getRandomNumber(1, 5);

    // Get history of human fingers
    ArrayList<Integer> history = morra.getHistory();

    // Find the highest frequency number(s) in human's history
    int maxFrequency = 0;
    int maxFrequencyNumber = 0;
    for (int number : history) {
      int frequency = Collections.frequency(history, number);
      if (frequency > maxFrequency) {
        maxFrequencyNumber = number;
        maxFrequency = frequency;
      }
    }

    // Caculate the sum based on the randomly generated fingers and most frequently appeared fingers
    // given by human player
    int sum = fingers + maxFrequencyNumber;

    // Return fingers and sum in string type
    return Integer.toString(fingers) + " " + Integer.toString(sum);
  }
}
