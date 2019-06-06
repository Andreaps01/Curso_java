/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producto;
import java.util.Scanner;
/**
 *
 * @author Andrea
 */
public class Producto {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar=new Scanner(System.in);
        productos a = new productos();
        System.out.println("ingresar el nombre del producto: ");
        a.Nombre=ingresar.nextLine();
        System.out.println("ingresar el tipo: ");
        a.tipo=ingresar.nextLine();
        System.out.println("ingrese el alto: ");
        a.alto=ingresar.nextDouble();
        System.out.println("ingrese el ancho: ");
        a.ancho=ingresar.nextDouble();
        System.out.println("ingrese el profundo: ");
        a.profundo=ingresar.nextDouble();
        System.out.println("ingrese el stock: ");
        a.stock=ingresar.nextInt();
        System.out.println("ingrese el precio del producto: "+ "S/. ");
        a.precio=ingresar.nextDouble();
      
        
        System.out.println("el volumen de la caja es:"+a.volumen());
        System.out.println("el precio total es: "+"S/. "+a.cantidad());
    }
    
}
