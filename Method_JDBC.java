
import java.sql.*;

public class Method_JDBC{
    private final String url = "jdbc:mysql//localhost:3306/try_jdbc";
    private final String user = "root";
    private final String passwd = "java10";

    public void insert(String name,int age, long enrollment_id){
        String insertion = "Insert into hostel (name, age, enrollment_id) values (?, ? , ?)";

        try(Connection con = DriverManager.getConnection(url,user,passwd);
            PreparedStatement pstmt = con.prepareStatement(insertion)){

                pstmt.setString(1,name);
                pstmt.setInt(2,age);
                pstmt.setLong(3,enrollment_id);
                int rowsaffected = pstmt.executeUpdate();

                if(rowsaffected>0){
                    System.out.println("Insertion was successfull");
                }
        }
        catch(SQLException e){
            System.out.println("Unable to insert it into table" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Method_JDBC nikhil = new Method_JDBC();
        nikhil.insert("nikhil",24,246301167L);
    }
}
