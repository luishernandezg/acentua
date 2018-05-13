package game;

import model.Word;

import java.util.List;

public class LevelOneContract {

    public interface View{

        void updatePoints(int points, int negativePoints);

        void updateWords(List<Word> wordList);

        void showVictoryAlert();

        void showDefeatAlert();

    }

    public interface Actions{
        boolean move(String word);
        void loadPoints(int points, int negativePoints);
        void gameContinue(boolean isVictory, boolean isDefeat);
        void loadWords(List<Word> wordList);
        void reset();
    }

    public interface Repository{
        boolean procesMove(String word);
        void getWords();
        void getAllPoints();
        void getGameState();
        void resetGame();

    }
}
