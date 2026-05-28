import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcExample{
    public static void main(String[] args){
        String url="jdbc:mysql://localhost:3306/college";
        String user="root";
        String password="msj040606";
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,user,password);
            System.out.println("Database Connected Successfully!");
            Statement stmt=con.createStatement();
            String query="SELECT * FROM students";
            ResultSet rs=stmt.executeQuery(query);

            System.out.println("\nStudent Details:");
            while(rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                int age=rs.getInt("age");
                String course=rs.getString("department");
                System.out.println(
                    id + " | " + name + " | " + age + " | " + course
                );
            }
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}