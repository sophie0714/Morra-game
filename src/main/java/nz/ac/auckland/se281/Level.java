package nz.ac.auckland.se281;

public abstract class Level {

  Strategy strategy;

  public Level(Strategy strategy){
    this.strategy = strategy;
  }

  abstract void useStrategy();

  public void setStrategy(Strategy strategy){
    this.strategy = strategy;
  }

  public String giveNumbers(){
    return strategy.getNumbers();
  }
}
