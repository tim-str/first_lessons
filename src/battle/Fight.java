package battle;

import java.util.Random;

public class Fight {
    public static void fight(Soldier[] whiteArmy, Soldier[] redArmy){
        Random rnd = new Random();

        for (int i = 0; i < 10; i++){
            if (rnd.nextBoolean()){
                whiteArmy[i].attack(redArmy[i]);
            } else {
                redArmy[i].attack(whiteArmy[i]);
            }
        }
    }

    public static void winner(Soldier[] whiteArmy, Soldier[] redArmy){

    }

    public static void main(String[] args){
        Soldier[] whites = new Soldier[10];
        Soldier[] reds = new Soldier[10];

        for (int i = 0; i < whites.length; i++){
            whites[i] = new White();
            reds[i] = new Red();
        }
        fight(whites, reds);
        winner(whites, reds);
    }
}
