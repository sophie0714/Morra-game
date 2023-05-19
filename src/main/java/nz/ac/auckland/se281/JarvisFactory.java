package nz.ac.auckland.se281;

import java.util.ArrayList;
import nz.ac.auckland.se281.Main.Difficulty;

public class JarvisFactory {
  public static Level createLevel(
      Difficulty difficulty, int numOfRound, ArrayList<Integer> history, Strategy strategy) {

    // Use appropriate strategy for game level
    switch (difficulty) {
      case EASY:
        return new EasyLevel(strategy);

      case MEDIUM:
        return new MediumLevel(strategy, numOfRound, history);

      case HARD:
        return new HardLevel(strategy, numOfRound, history);

      case MASTER:
        return new MasterLevel(strategy, numOfRound, history);

      default:
        return null;
    }
  }
}
