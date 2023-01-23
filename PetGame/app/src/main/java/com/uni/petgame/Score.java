package com.uni.petgame;

public class Score {

    private static int bestScore;
    private static int currentScore;

    public static void setBestScore(int score){
        if (score > bestScore){
            bestScore = score;
        }
    }

    public static void setCurrentScore(int score){
        currentScore = score;
    }

    public static int getBestScore(){
        return bestScore;
    }

    public static int getCurrentScore(){
        return currentScore;
    }

}
