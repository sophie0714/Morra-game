package nz.ac.auckland.se281;

public class Jarvis {
  public static String createNumbers( Morra morra) {
    Level level = null;
    String difficulty = morra.getLevel();
    int numOfRound = morra.getNumOfRound();
    switch (difficulty) {
      case "EASY":
        level = new EasyLevel();
        return level.useStrategy(numOfRound);

      case "MEDIUM":
        level = new MediumLevel();
        return level.useStrategy(numOfRound);

      default:
        return null;
    }
  }
}
