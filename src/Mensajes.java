public class Mensajes {

    private int id;
    private String mensaje;
    private String autorMensaje;
    private String fechaMensaje;

    public Mensajes(){}

    public Mensajes(String mensaje,String autorMensaje,String fechaMensaje){
        this.mensaje = mensaje;
        this.autorMensaje = autorMensaje;
        this.fechaMensaje = fechaMensaje;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public void mensaje(String mensaje){
        this.mensaje = mensaje;
    }

    public String getMensaje(){
        return mensaje;
    }

    public void setMensaje(String mensaje){
        this.mensaje = mensaje;
    }

    public void setAutorMensaje(String autorMensaje){
        this.autorMensaje = autorMensaje;
    }

    public String getAutorMensaje(){
        return  autorMensaje;
    }

    public void setFechaMensaje(String fecha){
        this.fechaMensaje = fecha;
    }

    public String getFechaMensaje(){
        return fechaMensaje;
    }
}
