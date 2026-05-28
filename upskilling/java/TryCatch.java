import java.util.Scanner;
public class TryCatch{
    public static void main(String[] args){
        try{
            Scanner sc=new Scanner(System.in);
            System.out.print("enter the first number: ");
            int a=sc.nextInt();
            System.out.print("enter the second number: ");
            int b=sc.nextInt();
            int res=a/b; 
            System.out.println("result: "+res);
        }catch(ArithmeticException e){
            System.out.println("denominator is 0");
        }
    }
}