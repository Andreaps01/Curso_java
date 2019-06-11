/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buble;

import java.util.Arrays;



/**
 *
 * @author PC02-LAB02
 */
public class Buble {

 

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
        int[]L={2,27,26,6,6,8,5,13,7,10};
        for(int a=0;a<L.length;a++){
            System.out.print(L[a]+",");
        }
        System.out.println();
        
        int temp;
        for (int i = 0; i < L.length; i++) {
            for (int j = i+1; j <L.length; j++) {
                if (L[i]>L[j]) {
                   temp=L[i];
                   L[i]=L[j];
                   L[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(L)); 
        //for (int i = 0; i < L.length; i++) {
        //System.out.print(L[i]+",");         
   // }
   
     
    }
    
}
