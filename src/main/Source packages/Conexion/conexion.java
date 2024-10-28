package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException
public class conexion {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bdproyectointegrador"; // Cambia a tu URL
        String user = "admin";
        String password = "";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa.");
        } catch (SQLException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }
    }

    }
}