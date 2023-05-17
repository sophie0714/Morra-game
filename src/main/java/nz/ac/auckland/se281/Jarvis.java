package nz.ac.auckland.se281;

public class Jarvis {
  public static String createNumbers(Morra morra) {
    Level level = null;
    // Find what level this game is
    String difficulty = morra.getLevel();

    // Use appropriate strategy for game level
    switch (difficulty) {
      case "EASY":
        level = new EasyLevel();
        return level.useStrategy(morra);

      case "MEDIUM":
        level = new MediumLevel();
        return level.useStrategy(morra);

      default:
        return null;
    }
  }
}
