package nz.ac.auckland.se281;

public class EasyJarvis extends Jarvis {

  public EasyJarvis(Strategy strategy) {
    super(strategy);
  }

  @Override
  public void useStrategy() {
    // Always use random strategy
    setStrategy(new RandomStrategy());
  }
}
