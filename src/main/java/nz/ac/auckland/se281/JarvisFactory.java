package nz.ac.auckland.se281;

import java.util.ArrayList;
import nz.ac.auckland.se281.Main.Difficulty;

public class JarvisFactory {
  public static Level createLevel(
      Difficulty difficulty, int numOfRound, ArrayList<Integer> history) {

    // Use appropriate strategy for game level
    switch (difficulty) {
      case EASY:
        return new EasyLevel();

      case MEDIUM:
        return new MediumLevel(numOfRound, history);

      case HARD:
        return new HardLevel(numOfRound, history);

      case MASTER:
        return new MasterLevel(numOfRound, history);

      default:
        return null;
    }
  }
}
