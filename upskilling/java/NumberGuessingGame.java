import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int r_num=r.nextInt(100)+1;
        int guess=0;
        
        while(guess!=r_num){
            System.out.print("Enter your guess:");
            guess=sc.nextInt();
            if(guess<r_num){
                System.out.println("guess is Too low. Try again");
            }else if (guess>r_num){
                System.out.println("guess is Too high. Try again");
            }else{
                System.out.println("correct guess");
            }
        }
    }
}
