package game;

import model.Word;

import java.util.List;

public class LevelOnePresenter implements LevelOneContract.Actions{

    LevelOneContract.View mView;
    LevelOneContract.Repository mRepository;

    public LevelOnePresenter(LevelOneContract.View mView) {
        this.mView = mView;
        mRepository = new LevelOneRepository(this);
        mRepository.getWords();

    }

    @Override
    public boolean move(String word) {
        boolean moveReponse = mRepository.procesMove(word);
        mRepository.getAllPoints();
        mRepository.getGameState();
        return moveReponse;
    }

    @Override
    public void loadPoints(int points, int negativePoints) {
        //TODO condicion de victoria/ derrota
        mView.updatePoints(points,negativePoints);
    }

    @Override
    public void gameContinue(boolean isVictory, boolean isDefeat) {
        if(isVictory)
            mView.showVictoryAlert();
        if (isDefeat)
            mView.showDefeatAlert();
    }

    @Override
    public void loadWords(List<Word> wordList) {
        mView.updateWords(wordList);
    }

    @Override
    public void reset() {
        mRepository.resetGame();
        mRepository.getWords();
        mRepository.getAllPoints();
    }
}
