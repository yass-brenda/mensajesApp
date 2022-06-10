import java.util.Scanner;

public class MensajeServices {
    public static  void crearMensaje(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();

        System.out.println("Tu nombre");
        String nombre = sc.nextLine();

        Mensajes registroMensaje = new Mensajes();
        registroMensaje.setMensaje(mensaje);
        registroMensaje.setAutorMensaje(nombre);

        MensajesDAO.crearMensaje(registroMensaje);

    }

    public static void listraMensajes(){

    }

    public static void borrarMensaje(){

    }
    public static void editarMensake(){

    }
}
