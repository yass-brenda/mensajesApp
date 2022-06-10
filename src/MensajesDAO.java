import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajesDAO {

    public static void crearMensaje(Mensajes mensaje){
        Conexion db_connect = new Conexion();
        try(Connection connection = db_connect.getConection()) {
            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO mensaje (id, mensaje,autor_mensaje,fecha_mensaje) VALUES (?,?,?,CURRENT_TIMESTAMP ) ";
                ps = connection.prepareStatement(query);

                ps.setInt(1, mensaje.getId());
                ps.setString(2,mensaje.getMensaje());
                ps.setString(3,mensaje.getAutorMensaje());
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
        Conexion connection = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection conexion = connection.getConection()){
            String query = "SELECT * FROM mensaje";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()){
                System.out.println("ID " + rs.getInt("id"));
                System.out.println("Mesaje: " +rs.getString("mensaje"));
                System.out.println("Autor: " + rs.getString("autor_mensaje"));
                System.out.println("Fecha: " + rs.getString("fecha_mensaje"));
                System.out.println("");
            }
        } catch(SQLException ex){
            System.out.println("No se pudieron recuperar los datos");
            System.out.println(ex);
        }
    }

    public static void borrarMensajeDB(int id){
        Conexion connection = new Conexion();

        try(Connection conexion = connection.getConection()){
            PreparedStatement ps = null;
            try {
                String  query = "DELETE FROM mensaje where id = ? ";
                ps = conexion.prepareStatement(query);
                ps.setInt(1,id);
                ps.executeUpdate();
                System.out.println("EL mensaje se borro con exito");
                System.out.println("");
            }catch (SQLException e){
                System.out.println("No se pudo borrar");
                System.out.println(e);
            }
        }catch(SQLException e){
            System.out.println("No se pudo borrar");
            System.out.println(e);
        }
    }

    public static void actualizarMensajeDB(Mensajes mensaje){
        Conexion connection = new Conexion();

        try(Connection cx = connection.getConection()){
            PreparedStatement ps = null;
            try {
                String query = "UPDATE mensaje SET mensaje= ? WHERE id= ?";
                ps =cx.prepareStatement(query);
                ps.setString(1,mensaje.getMensaje());
                ps.setInt(2,mensaje.getId());
                ps.executeUpdate();
                System.out.println("EL mensaje se  actualizo correctamente");
            }catch (SQLException e1){
                System.out.println("Ocurrio un error");
                System.out.println(e1);
            }
        }catch (SQLException e){
            System.out.println("Ocurrio un error");
            System.out.println(e);
        }
    }
}
