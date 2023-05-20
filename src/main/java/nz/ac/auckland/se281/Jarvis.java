package nz.ac.auckland.se281;

public abstract class Jarvis {

  private Strategy strategy;

  public Jarvis(Strategy strategy) {
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
