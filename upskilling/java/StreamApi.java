import java.util.*;
import java.util.stream.Collectors;

public class StreamApi{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        List<Integer> arr=new ArrayList<>();
        System.out.println("Enter the elements: ");
        for (int i=0;i<n;i++) {
            arr.add(sc.nextInt());
        }
        List<Integer> res=arr.stream().filter(num -> num%2==0).collect(Collectors.toList());
        System.out.println("Even Numbers: " +res);
    }
}
