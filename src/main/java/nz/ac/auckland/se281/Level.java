package nz.ac.auckland.se281;

public abstract class Level {

  private Strategy strategy;

  public Level(Strategy strategy) {
    this.strategy = strategy;
  }

  abstract void useStrategy();

  protected void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }

  public String giveNumbers() {
    return strategy.getNumbers();
  }
}
