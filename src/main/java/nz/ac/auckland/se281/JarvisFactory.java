package nz.ac.auckland.se281;

public class JarvisFactory {
  public static String createNumbers(Morra morra) {
    // Find what level this game is
    String difficulty = morra.getLevel();

    // Use appropriate strategy for game level
    switch (difficulty) {
      case "EASY":
        Level level = new EasyLevel();
        return level.useStrategy(morra);

      case "MEDIUM":
        level = new MediumLevel();
        return level.useStrategy(morra);

      case "HARD":
        level = new HardLevel();
        return level.useStrategy(morra);

      case "MASTER":
        level = new MasterLevel();
        return level.useStrategy(morra);  

      default:
        return null;
    }
  }
}
