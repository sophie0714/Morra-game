package nz.ac.auckland.se281;

import nz.ac.auckland.se281.Main.Difficulty;

public class JarvisFactory {
  public static Level createLevel(Difficulty difficulty) {

    // Use appropriate strategy for game level
    switch (difficulty) {
      case EASY:
        return new EasyLevel();

      case MEDIUM:
        return new MediumLevel();

      case HARD:
        return new HardLevel();

      case MASTER:
        return new MasterLevel();

      default:
        return null;
    }
  }
}
