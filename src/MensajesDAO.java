import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MensajesDAO {

    public static void crearMensaje(Mensajes mensaje){
        Conexion db_connect = new Conexion();

        try(Connection connection = db_connect.getConection()) {
            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO mensaje (mensaje,autor_mensaje) VALUES (?,?) ";
                ps = connection.prepareStatement(query);
                ps.setString(1,mensaje.getMensaje());
                ps.setString(2,mensaje.getAutorMensaje());
                ps.executeUpdate();
                System.out.println("Mensaje creado con exito :)");
            }catch (SQLException ex){
                System.out.println(ex);
            }
        } catch(SQLException e){
            System.out.println(e);
        }

    }

    public static void leerMensajeDB(){

    }

    public static void borrarMensajeDB(int id){

    }

    public static void actualizarMensajeDB(){

    }
}
