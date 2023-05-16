package nz.ac.auckland.se281;

public class Jarvis {
  public static String createNumbers(String difficulty) {
    switch (difficulty) {
      case "EASY":
        Level level = new EasyLevel();
        return level.useStrategy();

      default:
        return null;
    }
  }
}
