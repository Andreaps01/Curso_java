/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma.de.factoriales;

/**
 *
 * @author Andrea
 */
public class SUMADEFACTORIALES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=4;
 	int s=0;
 		 for(int a=0;a<=n;a++){
  			if(a==0){
  				s=1;
  				System.out.println(a+"!"+"="+s);
  				
  			}else{
  				int f=1;
  				for(int b=1;b<=a;b++){
  					f=f*b;
  				}
  				s=s+f;
  				System.out.println(a+"!"+"="+f);
  				
  			}
  		}
  		System.out.println("suma="+s);
    }
    
}
