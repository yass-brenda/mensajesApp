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
        MensajesDAO.leerMensajeDB();
    }

    public static void borrarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el id del mensaje a borrar");
        int id = sc.nextInt();
        MensajesDAO.borrarMensajeDB(id);
    }
    public static void editarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nuevo mensaje");
        String mensaje = sc.nextLine();

        System.out.println("Indica el mensaje a editar");
        int id = sc.nextInt();
        Mensajes actualizacionMensaje = new Mensajes();
        actualizacionMensaje.setId(id);
        actualizacionMensaje.setMensaje(mensaje);
        MensajesDAO.actualizarMensajeDB(actualizacionMensaje);
    }
}
