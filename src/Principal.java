import java.sql.Connection;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("--------------------------");
            System.out.println("Aplicación de mensajes");
            System.out.println("1. Crear un mensaje");
            System.out.println("2. Listar un mensaje");
            System.out.println("3. Editar mensaje");
            System.out.println("4. Eliminar mensaje");
            System.out.println("5. Salir");

            // leer la opcion del ususario
            opcion  = sc.nextInt();

            switch (opcion){
                case 1 :
                    MensajeServices.crearMensaje();
                    break;
                case 2 :
                    MensajeServices.listraMensajes();
                    break;
                case 3 :
                    MensajeServices.editarMensake();
                    break;
                case 4 :
                    MensajeServices.borrarMensaje();
                    break;
                default:
                    break;
            }
        } while (opcion != 5);


    }
}
