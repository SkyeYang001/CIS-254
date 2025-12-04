import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int score = 0;
        String word = "";
        System.out.println("Hello, Scrabble!");
        Tile tileS = new Tile('S', 1);
        word = tileS.addWord(word);
        score = tileS.addScore(score);
        System.out.println("Tile 1: " + tileS);
        Tile tileK = new Tile('K', 5);
        word = tileK.addWord(word);
        score = tileK.addScore(score);
        System.out.println("Tile 2: " + tileK);
        Tile tileY = new Tile('Y', 4);
        word = tileY.addWord(word);
        score = tileY.addScore(score);
        System.out.println("Tile 3: " + tileY);
        Tile tileE = new Tile('E', 1);
        word = tileE.addWord(word);
        score = tileE.addScore(score);
        System.out.println("Tile 4: " + tileE);
        // System.out.println("" + tileS + tileK + tileY + tileE);
        System.out.println("Your word and score: " + word + " | " + score);
    }
}
