import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion{

    public Connection getConection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensaje" ,"root", "root");
            //System.out.println("Se pudo conectar ala base de datos");
        } catch (SQLException E){
            System.out.println("No se pudo conectar ala base de datos");
        }
        return  connection;
    }
}
