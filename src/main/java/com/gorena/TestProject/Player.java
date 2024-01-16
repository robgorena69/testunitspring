package com.gorena.TestProject;

public class Player {
    
    private Dice dado;
    private int minNumberToWin;

    public Player(Dice dice, int minNumberToWin){
        this.dado = dice;
        this.minNumberToWin = minNumberToWin;
    }


    public boolean jugar(){
        int diceNumber = dado.roll();
        return diceNumber > minNumberToWin;
    }
}
