import java.util.Scanner;
public class PalindromeChecker{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        str=str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean isPalindrome=true;
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                isPalindrome=false;
                break;
            }
            left++;
            right--;
        }
        if(isPalindrome){
            System.out.println("The string is a palindrome.");
        }else{
            System.out.println("The string is not a palindrome.");
        }
    }

}
