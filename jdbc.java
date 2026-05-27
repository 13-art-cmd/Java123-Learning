import java.sql.*;

public class jdbc{
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/try_jdbc";
        String user = "root";
        String passwd = "java10";

        try(Connection con = DriverManager.getConnection(url,user,passwd);
            Statement st = con.createStatement();){
                System.out.println("Connection Established");
                int update = st.executeUpdate("Update hostel set name = 'Varun' where name is null;");
                int delete = st.executeUpdate("Delete from hostel where age = 21;");
                ResultSet rs = st.executeQuery("Select * from hostel;");

                while(rs.next()){
                    System.out.println(rs.getString(1) + " " + rs.getInt(2) + " " + rs.getString(3));
                }

            }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
