// You will need to import the Random library from java.util
import java.util.ArrayList;
import java.util.Random;



public class Puzzle {
    
    // public int[] GetTenRolls(){
    //     int[] arr = new int[10];
    //     System.out.println(arr);
    //     int max = 21;
    //     int min = 1;
    //     Random rand = new Random();
    //     for(int i=0; i<arr.length; i++){
    //         // arr[i] = (int)Math.floor(Math.random()*(max-min+1)+min);
    //         int num = rand.nextInt(21);
    //         arr[i] = num;
    //     }
    //     return arr;
    // } 
    public static ArrayList<Integer> getTenRolls(){
        Random rand = new Random();
        ArrayList<Integer> tenRolls = new ArrayList<>();
        for(int i=0; i<10; i++){
            tenRolls.add(rand.nextInt(21));
        }
        return tenRolls;
    }

    public static String getRandomLetter(){
        String[] letterArray = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        Random rand = new Random(); 
        int randNum = rand.nextInt(25);
        return letterArray[randNum];
    }

    public static String generatePassword(){
        String password = "";
        for (int i=0; i<8; i++){
            password += Puzzle.getRandomLetter();
        }
        return password;
    }

    public static ArrayList<String> getNewPasswordSet(int numLength){
        ArrayList<String> arr = new ArrayList<>();
        for (int i=0; i<numLength; i++){
            arr.add(Puzzle.generatePassword());
        }
        return arr;
    }
}
