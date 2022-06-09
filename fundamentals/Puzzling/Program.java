import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Program {
    public static void main(String[] args){
        Puzzle generator = new Puzzle();
        ArrayList<Integer> tenRolls = Puzzle.getTenRolls();
        // System.out.println(tenRolls);
        String randomLetter = Puzzle.getRandomLetter();
        // System.out.println(randomLetter);
        String password = Puzzle.generatePassword();
        // System.out.println(password);
        int passwordSetLength = 5;
        ArrayList<String> passwordSet = Puzzle.getNewPasswordSet(5);
        // System.out.println(passwordSet);
        String[] newStringArray = {"a","b","c","d","e","f","g"};
        String[] answer = Puzzle.shuffleArray(newStringArray);
        System.out.println(Arrays.toString(answer));
    }

}
