package model;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Game {
    int VICTORY_POINTS= 5;
    int DEFEAT_POITNS = 2;
    boolean isVictory = false;
    boolean isDefeat = false;
    int points;
    int negativePoints;
    int level;
    int time;
    List<Word> wordList;

    public Game( int level) {
        this.points = 0;
        this.negativePoints = 0;
        this.level = level;
        this.time = 0;
       wordListLevelOne();
    }


    public int getPoints() {
        if(points == VICTORY_POINTS)
            isVictory = true;
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getNegativePoints() {
        if(negativePoints == DEFEAT_POITNS)
            isDefeat = true;
        return negativePoints;
    }

    public void setNegativePoints(int negativePoints) {
        this.negativePoints = negativePoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isVictory() {
        return isVictory;
    }

    public boolean isDefeat() {
        return isDefeat;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public List<Word> getWordList() {
        return wordList;
    }

    public void setWordList(List<Word> wordList) {
        this.wordList = wordList;
    }

    //Funciones del juego

    public boolean intent(String intento){
        if (intento.equalsIgnoreCase("") || intento == null)
            return false;
        for(Word word:this.wordList){
            if (word.getWord().equalsIgnoreCase(intento)){
                if (word.isAccent){
                    points++;
                    return true;
                }
            }
        }
        negativePoints++;
        return false;
    }

    private void wordListLevelOne(){

        String[] accentWordsLevelOne ={
                 "árbol"
                ,"ratón"
                ,"París"
                ,"máquina"
                ,"matemáticas"
                ,"cámion"
                ,"código"
                ,"sílaba"
                ,"bárbaro"
                ,"cólera"
                ,"impedirá"
                ,"brócoli"
                ,"bóveda"
                ,"aritmética"
                ,"álbum"
                ,"cerámica"
                ,"Cancún"
                ,"cálculo"
                ,"ídolo"
                ,"triángulo"
                ,"glándula"
                ,"gótico"
                ,"héroe"
                ,"mártir"
                ,"imágenes"
                ,"cómputo"
                ,"lágrima"
                ,"francés"
                ,"Mónaco"
                ,"gráfica"
                ,"Líbano"
                ,"fósforo"
                ,"célebre"
                ,"brújula"
                ,"llovió"
                ,"micrófono"
                ,"escorpión"
                ,"cálido"



        };

        String[] wordsLevelOne= {
                "puérta"
                ,"cása"
                ,"persiána"
                ,"relój"
                ,"cárro"
                ,"períco"
                ,"aceptár"
                ,"acomodár"
                ,"acusár"
                ,"adivinár"
                ,"administrár"
                ,"adoptár"
                ,"afectár"
                ,"animár"
                ,"billár"
                ,"borrár"
                ,"Boxeár"
                ,"cantár"
                ,"cazár"
                ,"centrál"
                ,"cepillár"
                ,"enfocár"
                ,"escribír"
                ,"expedír"
                ,"funcionár"
                ,"geniál"
                ,"mandár"
                ,"tígre"
                ,"elefánte "
                ,"Píña"
                ,"manzána"
                ,"Líma"
                ,"Chíle"
                ,"adúlto"
                ,"aíre"
                ,"cuéllo"
                ,"gáses"
        };

        Collections.shuffle(Arrays.asList(wordsLevelOne));
        Collections.shuffle(Arrays.asList(accentWordsLevelOne));

        System.out.println(wordsLevelOne[0]);
        wordList = new ArrayList<>();
        for(String word: accentWordsLevelOne){
            wordList.add(new Word(word,true));
        }
        for(String word: wordsLevelOne){
            wordList.add(new Word(word,false));
        }

        Collections.shuffle(wordList);
    }
}
