package academy.learnprogramming;

public interface Game {
    int getNumber();

    int getGuess();

    void setGuess(int guess);

    int getSmallest();

    int getBiggest();

    int getRemainingGuesses();

    void reset();

    void check();

    boolean inValidNumberRange();

    boolean isGameWon();

    boolean isGameLost();

}
