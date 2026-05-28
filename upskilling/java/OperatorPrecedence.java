public class OperatorPrecedence{
    public static void main(String[] args){
        int a=10;
        int b=5;
        int c=2;
        int op=a+b*c; 
        System.out.println("Result of a+b*c: "+op);
        op=(a+b)*c; 
        System.out.println("Result of (a+b)*c: "+op);
        op=a-b/c; 
        System.out.println("Result of a-b/c: "+op);
        op=(a-b)/c; 
        System.out.println("Result of (a-b)/c: "+op);
    }
}