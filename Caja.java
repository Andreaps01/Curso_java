/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;
//import javax.swing.JOptionPane; 
import java.util.Scanner;

    
        
    


/**
 *
 * @author PC02-LAB02
 */
public class Caja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ingresar=new Scanner(System.in);
        //String valor=JOptionPane.showInputDialog("Introduce los valores");
       pruebacaja c=new pruebacaja();
      c.ancho=ingresar.nextInt();
       c.alto=ingresar.nextInt();
        c.profundo=ingresar.nextInt();
      
            System.out.println("el volumen de la caja es; "+ c.Volumen());
               
       
    }

    
}
