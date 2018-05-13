package game;

import model.Game;

public class LevelOneRepository implements LevelOneContract.Repository{

    LevelOneContract.Actions mPresenter;
    Game game;

    public LevelOneRepository(LevelOneContract.Actions mPresenter) {
        this.mPresenter = mPresenter;
        game = new Game(1);
    }

    @Override
    public boolean procesMove(String word) {
        return game.intent(word);
    }

    @Override
    public void getWords() {
        mPresenter.loadWords(game.getWordList());
    }

    @Override
    public void getAllPoints() {
        mPresenter.loadPoints(game.getPoints(),game.getNegativePoints());
    }

    @Override
    public void getGameState() {
        mPresenter.gameContinue(game.isVictory(),game.isDefeat());
    }

    @Override
    public void resetGame() {
        game = new Game(1);
    }
}
