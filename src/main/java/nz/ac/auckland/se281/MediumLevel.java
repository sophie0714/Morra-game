package nz.ac.auckland.se281;

public class MediumLevel implements Level{

    @Override
    public String useStrategy(){

        Morra morra_obj = new Morra();

        if (morra_obj.getNumOfRound() >=4){
            Strategy strategy = new AverageStrategy();
            return strategy.getNumbers();
        } else {
            Strategy strategy = new RandomStrategy();
            return strategy.getNumbers();
        }
    }
}
