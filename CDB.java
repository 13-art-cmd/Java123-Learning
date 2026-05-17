import java.sql.*;

public class CDB {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ultimate";
        String user = "root";
        String passwd = "java10";

        try (
            Connection con = DriverManager.getConnection(url, user, passwd);
            Statement st = con.createStatement();
        ) {
            System.out.println("Connection established");
            int rs2 = st.executeUpdate(
                "INSERT INTO laptop VALUES('computer2345',22233,'apple',2022,'m4','mac','amd_pro')"
            );
            ResultSet rs1 = st.executeQuery("SELECT * FROM laptop");

            while (rs1.next()) {
                String model = rs1.getString("model");
                int price = rs1.getInt("price");
                String brand = rs1.getString("brand");
                int mfg = rs1.getInt("mfg");
                String processor = rs1.getString("processor");
                String os = rs1.getString("os");
                String graphics_Card = rs1.getString("graphicscard");
                System.out.println(model + " " + price + " " + brand + " " + mfg + " " + processor + " " + os + " " + graphics_Card);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}