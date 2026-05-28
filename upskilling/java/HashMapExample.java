import java.util.*;
public class HashMapExample{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> map=new HashMap<>();
        System.out.print("enter the number of entries: ");
        int n=sc.nextInt();
        System.out.println("enter the key-value pairs: ");
        for(int i=0;i<n;i++){
            int key=sc.nextInt();
            String value=sc.next();
            map.put(key, value);
        }
        System.out.println("enter the key to search: ");
        int Key=sc.nextInt();
        System.out.println("the name of id "+Key+" is: "+map.get(Key));
    }
    
}
