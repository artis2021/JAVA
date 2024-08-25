import java.util.Random;
import java.util.Scanner;

public class CWH_50_PracticeSet {
    public static void main(String[] args) {
        Game g = new Game();
        boolean f = false;
        while(!f){
            g.takeUserInput();
            f = g.isCorrectNumber();
        }

    }
}

class Game{
    int num;
    int inputNum;
    int attempts = 1;

    public int getNumOfGuess() {
        return numOfGuess;
    }

    public void setNumOfGuess(int numOfGuess) {
        this.numOfGuess = numOfGuess;
    }

    int numOfGuess;
    Game(){
        Random rand = new Random();
        this.num = rand.nextInt(100);
//        System.out.println("Choosen num is "+ num);
    }

    void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        inputNum = sc.nextInt();
    }

    boolean isCorrectNumber(){
        if(num == inputNum){
            System.out.println("Yaah you find the num withing "+ attempts + " attempts.");
            return true;
        }
        else if(num > inputNum){
            attempts++;
            System.out.println("Too Low...");
            return false;
        }
        else{
            attempts++;
            System.out.println("Too High...");
            return false;
        }

    }




}
