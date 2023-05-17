package nz.ac.auckland.se281;

public class MediumLevel implements Level{

    @Override
    public String useStrategy(int numOfRound){
        
        if (numOfRound >= 4){
            Strategy strategy = new AverageStrategy();
            return strategy.getNumbers();
        } else {
            Strategy strategy = new RandomStrategy();
            return strategy.getNumbers();
        }
    }
}
