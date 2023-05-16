package nz.ac.auckland.se281;

public class Jarvis {
  public static String createNumbers(String difficulty) {
    Level level = null;
    switch (difficulty) {
      case "EASY":
        level = new EasyLevel();
        return level.useStrategy();

      case "MEDIUM":
        level = new MediumLevel();
        return level.useStrategy();

      default:
        return null;
    }
  }
}
