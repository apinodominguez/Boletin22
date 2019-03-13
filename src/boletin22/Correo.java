package boletin22;

public class Correo {
    
     String mensaje;
    boolean leido;
    
//constructores
    public Correo() {
    }

    public Correo(String mensaje, boolean leido) {
        this.mensaje = mensaje;
        this.leido = leido;
    }
//Getters & Setters
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    public String getMensaje() {
        return mensaje;
    }

    public boolean getLeido() {
        return leido;
    }
//toString
    @Override
    public String toString() {
        return "Mensaje= " + mensaje + "\nLeido=" + leido;
    }

}