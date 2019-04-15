/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacion.swich;
import javax.swing.JOptionPane; 

/**
 *
 * @author PC19-LAB02
 */
public class EstacionSwich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String valor=JOptionPane.showInputDialog("Introduce un numero de mes");
  int mes=Integer.parseInt(valor);
        switch(mes){
            case 3: case 4: case 5:  
         System.out.println("es primavera");
         break;
            case 6:
            case 7:
            case 8:
         System.out.println("es verano");
         break;
            case 9:
            case 10:
            case 11:
         System.out.println("es otoño");
         break;
            case 12:
            case 1:
            case 2:
         System.out.println("es invierno");
         break;
            default:
            System.out.println("mes incorrecto");
                    
                 
        }
            
                
        // TODO code application logic here
    }
    
}
