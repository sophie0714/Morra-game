package nz.ac.auckland.se281;

import java.util.ArrayList;
import nz.ac.auckland.se281.Main.Difficulty;

public class JarvisFactory {
  public static Jarvis createLevel(
      Difficulty difficulty, int numOfRound, ArrayList<Integer> history, Strategy strategy) {

    // Use appropriate strategy for game level
    switch (difficulty) {
      case EASY:
        return new EasyJarvis(strategy);

      case MEDIUM:
        return new MediumJarvis(strategy, numOfRound, history);

      case HARD:
        return new HardJarvis(strategy, numOfRound, history);

      case MASTER:
        return new MasterJarvis(strategy, numOfRound, history);

      default:
        return null;
    }
  }
}
