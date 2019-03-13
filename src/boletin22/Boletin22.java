/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin22;

import Utils.PedirValor;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class Boletin22 {

    public static void main(String[] args) {
        
        ArrayList<Correo> cor=new ArrayList<>();
        Buzon obx=new Buzon();
        
        int op;
        do{
           op=Integer.parseInt(PedirValor.pedirString("****MENU****\n\n"
                   + " 1 -> Crear nuevo correo.\n"
                   + " 2 -> Mostrar num correos\n"
                   + " 3 -> Mostar si hay correo no leido.\n"
                   + " 4 -> Mostrar primer correo no leido.\n"
                   + " 5 -> Mostrar correo posicion x.\n"
                   + " 6 -> Borrar correo posicion x.\n"
                   + " 0 -> Salir (cierra el buzon).\n\n"));
                   
        switch(op){
            case 1: obx.Correo(cor);
                          break;
            case 2: obx.numCorreos(cor);
                    break;
            case 3: 
                    if(obx.leer(cor)==false){
                        JOptionPane.showMessageDialog(null,"Tiene correos por leer");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"No tiene correos por leer");
                    }
                break;
            case 4: System.out.println(obx.mostrar(cor));
                                            break;
            case 5: int posicion=PedirValor.enteiro("Introduzca que correo desea visualizar");
                                         obx.mostrar(cor, posicion);
                                         break;
            case 6: posicion=PedirValor.enteiro("Introduzca que correo desea eliminar");
                             obx.eliminar(cor, posicion);
                             break;
            case 0: System.exit(0);
                          break;
            default: op=Integer.parseInt(JOptionPane.showInputDialog(null, "Opcion no valida\n introduzca otra seguir para volver al menu:"));
        }
        }while(op != 0);
            
    }
    
}
    
    

