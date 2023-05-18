package nz.ac.auckland.se281;

import java.util.ArrayList;

public interface Strategy {
  public String getNumbers(int numOfRound, ArrayList<Integer> history);
}
