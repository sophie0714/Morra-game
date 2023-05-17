package nz.ac.auckland.se281;

public class Jarvis {
  public static String createNumbers( Morra morra) {
    Level level = null;
    String difficulty = morra.getLevel();
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
