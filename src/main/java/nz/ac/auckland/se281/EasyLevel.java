package nz.ac.auckland.se281;

public class EasyLevel extends Level {

  public EasyLevel(Strategy strategy){
    super(strategy);

  }
  @Override
  public void useStrategy() {
    // Always use random strategy
    setStrategy(new RandomStrategy());
  }
}
