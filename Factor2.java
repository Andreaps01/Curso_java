/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factor2;
import javax.swing.JOptionPane;
/**
 *
 * @author PC02-LAB02
 */
public class Factor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String valor=JOptionPane.showInputDialog("Introduce un numero");
  int numero=Integer.parseInt(valor);
  long factor=1;
  for(int i=1;i<=numero;i++){
      
      
      factor=factor*i;
      System.out.println( i+"!"+"="+factor);
  }
  
    }
    
}
