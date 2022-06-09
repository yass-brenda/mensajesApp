import java.sql.Connection;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.println("--------------------------");
            System.out.println("Aplicación de mensajes");
            System.out.println("1. Crear un mensaje");
            System.out.println("2. Listar un mensaje");
            System.out.println("3. Editar mensaje");
            System.out.println("4. Eliminar mensaje");
            System.out.println("5. Salir");
        } while (opcion!=5);

        Conexion connection = new Conexion();
        try(Connection cnx= connection.getConection()) {

        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("MAin");
    }
}
