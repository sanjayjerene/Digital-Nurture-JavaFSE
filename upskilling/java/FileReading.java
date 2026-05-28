import java.io.*;
import java.util.*;
public class FileReading{
    public static void main(String[] args){
        try{
            FileReader reader=new FileReader("C:\\Users\\fmluc\\Desktop\\cts\\output.txt");
            int i;
            while((i=reader.read())!=-1){
                System.out.print((char) i);
            }
            reader.close();
        }catch(IOException e){
            System.out.println("an error occurred");
            e.printStackTrace();
        }
    }
}
