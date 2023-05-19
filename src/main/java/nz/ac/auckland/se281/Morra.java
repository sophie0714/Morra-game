package nz.ac.auckland.se281;

import java.util.ArrayList;
import nz.ac.auckland.se281.Main.Difficulty;

public class Morra {
  // fields
  private int numOfRound;
  private String name;
  private Difficulty level;
  private boolean newGameStarted = false;
  private int endScore;
  private int humanPoints;
  private int aiPoints;
  private ArrayList<Integer> history = new ArrayList<Integer>();
  private Strategy strategy;

  public Morra() {}

  public void newGame(Difficulty difficulty, int pointsToWin, String[] options) {
    // For new game, reset the variables
    numOfRound = 1;
    humanPoints = 0;
    aiPoints = 0;
    history.clear();

    // New Game has started
    newGameStarted = true;

    // Print welcome message with the typed human player's name
    MessageCli.WELCOME_PLAYER.printMessage(options[0]);

    // Store information for games
    name = options[0];
    level = difficulty;
    endScore = pointsToWin;
    strategy = new RandomStrategy();
  }

  public void play() {
    // If play was tried before starting new game, error message is printed and play does not run
    if (newGameStarted == false) {
      MessageCli.GAME_NOT_STARTED.printMessage();
      return;
    }

    // Initiate a game
    MessageCli.START_ROUND.printMessage(Integer.toString(numOfRound));
    MessageCli.ASK_INPUT.printMessage();
    String numbersFromHuman = Utils.scanner.nextLine();

    // Error message for invalid input and re-get the inputs from the player
    while (!inputValidityChecker(numbersFromHuman)) {
      MessageCli.INVALID_INPUT.printMessage();
      MessageCli.ASK_INPUT.printMessage();
      numbersFromHuman = Utils.scanner.nextLine();
    }

    // Get numbers from Jarvis using appropriate strategies for given level
    Level whatLevel = JarvisFactory.createLevel(level, numOfRound, history, strategy);
    whatLevel.useStrategy();
    String numbersFromJarvis = whatLevel.giveNumbers();


    // Show players input information
    String[] humanNumbers = numbersFromHuman.split(" ");
    MessageCli.PRINT_INFO_HAND.printMessage(name, humanNumbers[0], humanNumbers[1]);

    // Show Jarvis' numbers
    String[] jarvisNumbers = numbersFromJarvis.split(" ");
    MessageCli.PRINT_INFO_HAND.printMessage("Jarvis", jarvisNumbers[0], jarvisNumbers[1]);

    // Determine who is the winner
    int sum = Integer.valueOf(humanNumbers[0]) + Integer.valueOf(jarvisNumbers[0]);
    if (Integer.valueOf(humanNumbers[1]) == Integer.valueOf(jarvisNumbers[1])) {
      MessageCli.PRINT_OUTCOME_ROUND.printMessage("DRAW");
    } else if (Integer.valueOf(humanNumbers[1]) == sum) {
      MessageCli.PRINT_OUTCOME_ROUND.printMessage("HUMAN_WINS");
      humanPoints++;
    } else if (Integer.valueOf(jarvisNumbers[1]) == sum) {
      MessageCli.PRINT_OUTCOME_ROUND.printMessage("AI_WINS");
      aiPoints++;
    } else {
      MessageCli.PRINT_OUTCOME_ROUND.printMessage("DRAW");
    }

    // Store human's fingers history
    history.add(Integer.valueOf(humanNumbers[0]));

    // If reaching the endScore, print winning message and end game
    if (aiPoints == endScore) {
      MessageCli.END_GAME.printMessage("Jarvis", Integer.toString(numOfRound));
      newGameStarted = false;
      return;
    } else if (endScore == humanPoints) {
      MessageCli.END_GAME.printMessage(name, Integer.toString(numOfRound));
      newGameStarted = false;
      return;
    }

    // Increment the number of round for the next round
    numOfRound++;
  }

  public void showStats() {
    // If showStats is tried when the game is not running, print error message
    // and showStats does not run
    if (newGameStarted == false) {
      MessageCli.GAME_NOT_STARTED.printMessage();
      return;
    }
    // Print stats (order: human first, jarvis second)
    MessageCli.PRINT_PLAYER_WINS.printMessage(
        name, Integer.toString(humanPoints), Integer.toString(endScore - humanPoints));
    MessageCli.PRINT_PLAYER_WINS.printMessage(
        "Jarvis", Integer.toString(aiPoints), Integer.toString(endScore - aiPoints));
  }

  // A method which checks if the inputs given by the human player are valid or not
  private boolean inputValidityChecker(String input) {
    String[] inputs = input.split(" ");
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
        || Integer.valueOf(inputs[1]) <= 0) {
      return false;
    } else {
      return true;
    }
  }
}
