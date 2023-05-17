package nz.ac.auckland.se281;

public class MediumLevel implements Level{

    @Override
    public String useStrategy(Morra morra){
        int numOfRound = morra.getNumOfRound();
        if (numOfRound >= 4){
            Strategy strategy = new AverageStrategy();
            return strategy.getNumbers(morra);
        } else {
            Strategy strategy = new RandomStrategy();
            return strategy.getNumbers(morra);
        }
    }
}
