import java.util.Scanner;
public class RecursiveFibonacci {
    public static int fibo(int n){
        if(n<=1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Negative number");
        } else {
            System.out.println("Fibonacci of "+n+" is: "+fibo(n));
        }
    }
    
}
