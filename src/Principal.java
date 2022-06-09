import java.sql.Connection;

public class Principal {
    public static void main(String[] args) {
        Conexion connection = new Conexion();
        try(Connection cnx= connection.getConection()) {

        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("MAin");
    }
}
