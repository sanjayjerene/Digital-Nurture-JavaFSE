import java.util.*;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        int a=sc.nextInt();
        System.out.println("enter second number:");
        int b=sc.nextInt();
        System.out.println("enter the opeartor:");
        char op=sc.next().charAt(0);

        switch(op){
            case '+':
                System.out.println("addition of 2 numbers: "+(a+b));
                break;
            case '-':
                System.out.println("subraction of 2 numbers: "+(a-b));
                break;
            case '*':
                System.out.println("multiplication of 2 numbers: "+(a*b));
                break;
            case '/':
                if(b!=0){
                    System.out.println("division1 of 2 numbers: "+(a/b));
                }
                else{
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid operation");
        } 

    }
}
