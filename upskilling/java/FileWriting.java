import java.util.*;
import java.io.*;
public class FileWriting{
    public static void main(String[] args){
        try{
            FileWriter writer=new FileWriter("output.txt");
            Scanner sc=new Scanner(System.in);
            System.out.print("enter the text to write in file: ");
            String text=sc.nextLine();
            writer.write(text);
            writer.close();
            System.out.println("file written successfully");
        }catch(IOException e){
            System.out.println("an error occurred ");
            e.printStackTrace();
        }
    }
}
