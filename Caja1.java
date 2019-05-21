/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja1;
import java.util.Scanner;
/**
 *
 * @author PC02-LAB02
 */
public class Caja1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar=new Scanner(System.in);
        pruebacaja1 c=new pruebacaja1();
      c.ancho=ingresar.nextInt();
       c.alto=ingresar.nextInt();
        c.profundo=ingresar.nextInt();
        System.out.println("el volumen de la caja es; "+ c.Volumen());
        System.out.println("el area de la cara es: "+c.area());
        System.out.println("el doble de la caja es: "+c.doble());
    }
    
}
