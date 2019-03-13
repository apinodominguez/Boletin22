package boletin22;

import Utils.PedirValor;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Buzon {
    
    //Creador de correo
    public void Correo(ArrayList<Correo> corre){   
        String correo=PedirValor.pedirString("Mensaje del correo");
        boolean leido=false;
        Correo cor=new Correo(correo,leido);
        corre.add(cor);
    }
    
    //mostrar numero de correos
    public void numCorreos(ArrayList<Correo> cor){
        JOptionPane.showMessageDialog(null,cor.size());
    }
    
    //Comprobar existencia de correos no leidos
    public boolean leer(ArrayList<Correo> cor){
        for(Correo corre:cor){
            if(corre.getLeido()==false){
                return true;
            }
        }
        return false;
    }
    
        //mostrar primero no leido
        public String mostrar(ArrayList<Correo>cor){
        String mensaje;
        
        for(Correo corre: cor){
            if(leer(cor)){
                mensaje=corre.getMensaje();
                corre.setLeido(true);
                return mensaje;
            }
        }
        return "Ninguno por leer";
    }
    
    //mostrar por posicion
    public void mostrar(ArrayList<Correo> cor,int posicion){
        System.out.println(cor.get(posicion-1));
        Correo comprobacion=cor.get(posicion-1);
        if (comprobacion.getLeido()==false){
            comprobacion.setLeido(true);
        }

    }
    //eliminar elementos por posicion
    public void eliminar(ArrayList<Correo>cor,int posicion){
        for(Correo corre:cor){
            if(cor.contains(posicion-1)){
                cor.remove(corre);
            }
        }
    }
}


