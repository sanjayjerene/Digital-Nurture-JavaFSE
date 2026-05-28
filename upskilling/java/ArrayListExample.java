import java.util.*;

public class ArrayListExample{
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of names: ");
        int n=sc.nextInt();
        System.out.println("enter the names: ");
        for(int i=0;i<n;i++){
            String name=sc.next();
            list.add(name);
        }
        System.out.println("names in the list: ");
        for(String name:list){
            System.out.println(name);
        }
    }
    
}
