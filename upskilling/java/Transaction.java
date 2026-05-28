import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Transaction{
    static String url="jdbc:mysql://localhost:3306/bankdb";
    static String user="root";
    static String password="msj040606";

    public static void transferMoney(
            int senderId,
            int receiverId,
            double amount){
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            con.setAutoCommit(false);

            String debitQuery="UPDATE accounts SET balance=balance - ? WHERE id=?";

            PreparedStatement debitStmt=con.prepareStatement(debitQuery);
            debitStmt.setDouble(1, amount);
            debitStmt.setInt(2, senderId);
            int debitRows=debitStmt.executeUpdate();

            String creditQuery="UPDATE accounts SET balance=balance + ? WHERE id= ?";

            PreparedStatement creditStmt=con.prepareStatement(creditQuery);
            creditStmt.setDouble(1, amount);
            creditStmt.setInt(2, receiverId);
            int creditRows=creditStmt.executeUpdate();

            if(debitRows>0&&creditRows>0){
                con.commit();
                System.out.println("Transaction Successful");
            }else{
                con.rollback();
                System.out.println("Transaction Failed");
            }
            con.close();
        }catch(Exception e){
            try{
                if(con!=null){
                    con.rollback();
                }
            }catch(Exception ex){
                System.out.println(ex);
            }
            System.out.println("Transaction Rolled Back");
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        transferMoney(1, 2, 1000);
    }
}