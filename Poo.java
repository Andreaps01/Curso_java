/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;
import java.util.Scanner;
/**
 *
 * @author PC01-LAB02
 */
public class Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String nombre, numero;
         double tipo, importe;

         cuenta cuenta1 = new cuenta();
         
System.out.print("Nombre : ");
nombre = sc.nextLine();
System.out.print("Número de cuenta : ");
numero = sc.nextLine();
System.out.print("Tipo de interes : ");
tipo = sc.nextDouble();
System.out.print("Saldo: ");
importe = sc.nextDouble();

cuenta1.setNombre(nombre);
cuenta1.setNumeroCuenta(numero);
cuenta1.setTipoInteres(tipo);
cuenta1.setSaldo(importe);

cuenta cuenta2 = new cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);
 
cuenta cuenta3 = new cuenta(cuenta1);

   System.out.println("Datos de la cuenta 1");
System.out.println("Nombre del titular: " + cuenta1.getNombre());
System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
System.out.println("Tipo de interés: " + cuenta1.getTipoInteres());
System.out.println("Saldo: " + cuenta1.getSaldo());
System.out.println();

cuenta1.ingreso(4000);

System.out.println("Saldo: " + cuenta1.getSaldo());

System.out.println("Datos de la cuenta 2");
System.out.println("Nombre del titular: " + cuenta2.getNombre());
System.out.println("Número de cuenta: " + cuenta2.getNumeroCuenta());
System.out.println("Tipo de interés: " + cuenta2.getTipoInteres());
System.out.println("Saldo: " + cuenta2.getSaldo());
System.out.println();

System.out.println("Datos de la cuenta 3");
System.out.println("Nombre del titular: " + cuenta3.getNombre());
System.out.println("Número de cuenta: " + cuenta3.getNumeroCuenta());
System.out.println("Tipo de interés: " + cuenta3.getTipoInteres());
System.out.println("Saldo: " + cuenta3.getSaldo());
System.out.println();

cuenta3.transferencia(cuenta2, 10);

System.out.println("Saldo de la cuenta 2");
System.out.println("Saldo: " + cuenta2.getSaldo());
System.out.println();
       

   }
    
    }


