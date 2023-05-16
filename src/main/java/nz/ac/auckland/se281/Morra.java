package nz.ac.auckland.se281;

import nz.ac.auckland.se281.Main.Difficulty;

public class Morra {

  private int numOfRound;
  private String name;

  public Morra() {}

  public void newGame(Difficulty difficulty, int pointsToWin, String[] options) {
    // For new game, round number is always 1
    numOfRound = 1;
    
    // Print welcome message with the typed human player's name
    MessageCli.WELCOME_PLAYER.printMessage(options[0]);
    name = options[0];
  }

  public void play() {
    // Initiate a game
    MessageCli.START_ROUND.printMessage(Integer.toString(numOfRound));
    MessageCli.ASK_INPUT.printMessage();
    String input = Utils.scanner.nextLine();

    // Error message for invalid input and re-get the inputs from the player
    while (!inputValidityChecker(input)) {
      MessageCli.INVALID_INPUT.printMessage();
      MessageCli.ASK_INPUT.printMessage();
      input = Utils.scanner.nextLine();
    }

    // Show players input information
    String inputs[] = input.split(" ");
    MessageCli.PRINT_INFO_HAND.printMessage(name, inputs[0], inputs[1]);

    // Increment the number of round for the next round
    numOfRound++;
  }

  public void showStats() {}

  // A method which checks if the inputs given by the human player are valid or not
  private boolean inputValidityChecker(String input) {
    String inputs[] = input.split(" ");
    // The number of inputs must be exactly 2 
    if (inputs.length != 2) {
      return false;
    // The inputs must be both integer
    } else if (!Utils.isInteger(inputs[0]) || !Utils.isInteger(inputs[1])) {
      return false;
    // The inputs must be within the appropriate range
    } else if (Integer.valueOf(inputs[0]) > 5
        || Integer.valueOf(inputs[1]) > 10
        || Integer.valueOf(inputs[0]) <= 0
        || Integer.valueOf(inputs[1]) <= 0){
      return false;
    } else {
      return true;
    }
  }
}
