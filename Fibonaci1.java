/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaci1;
import java.util.Scanner;
/**
 *
 * @author PC02-LAB02
 */
public class Fibonaci1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.print("ingres el numero");
     int f=0; 
     int k=1;
     int t;
     int q=sc.nextInt();
   
     for(int i=0;i<=q;i++){
        t=f;
         f=k+f;
         k=t;
         System.out.println(k);
         
        
     }
    }
    
}