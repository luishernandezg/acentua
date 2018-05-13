package model;

public class Word {
    public static final int AGUDA = 1;
    public static final int GRABE = 2;
    public static final int ESDRUJULA = 3;
    String word = "";
    int type = 0;
    boolean isAccent = false;

    public Word(String word, int type, boolean isAccent) {
        this.word = word;
        this.type = type;
        this.isAccent = isAccent;
    }

    public Word(String word, boolean isAccent) {
        this.word = word;
        this.isAccent = isAccent;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean isAccent() {
        return isAccent;
    }

    public void setAccent(boolean accent) {
        isAccent = accent;
    }
}
