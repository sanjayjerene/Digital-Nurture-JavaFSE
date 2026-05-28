import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDAO{
    String url="jdbc:mysql://localhost:3306/college";
    String user="root";
    String password="msj040606";

    public void insertStudent(int id, String name, int age, String department){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url, user, password);
            String query="INSERT INTO students(id, name, age, department) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.setString(4, department);

            int rows = ps.executeUpdate();
            System.out.println(rows + " record inserted successfully");
            con.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void updateStudent(int id, String department){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url, user, password);
            String query="UPDATE students SET department = ? WHERE id = ?";

            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1, department);
            ps.setInt(2, id);

            int rows=ps.executeUpdate();
            System.out.println(rows + " record updated successfully");
            con.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        StudentDAO dao=new StudentDAO();
        dao.insertStudent(1, "Alice", 20, "CSE");
        dao.insertStudent(2, "Bob", 22, "ICE");
        dao.updateStudent(1, "AI&DS");
    }
}