import java.io.*;
import java.net.*;

public class Server{
    public static void main(String[] args)throws Exception{
        ServerSocket ss=new ServerSocket(5000);
        System.out.println("Server Waiting");
        Socket s=ss.accept();
        System.out.println("Client Connected");
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
        String msg = br.readLine();
        System.out.println("Client: "+ msg);
        pw.println("Hello Client");
        s.close();
        ss.close();
    }
}