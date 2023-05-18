package nz.ac.auckland.se281;

public class JarvisFactory {
  public static Level createNumbers(Morra morra) {
    // Find what level this game is
    String difficulty = morra.getLevel();

    // Use appropriate strategy for game level
    switch (difficulty) {
      case "EASY":
        return new EasyLevel();

      case "MEDIUM":
        return new MediumLevel();

      case "HARD":
        return new HardLevel();

      case "MASTER":
        return new MasterLevel();
        
      default:
        return null;
    }
  }
}
