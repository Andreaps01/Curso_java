/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

/**
 *
 * @author PC02-LAB02
 */
public class pruebanotas {
    public static void main(String args[]){
        Notas p1=new Notas();
       
       
        p1.nombre="juan";
        p1.apellidoPaterno="ponce";
        p1.apellidoMaterno="Lara";
        p1.carrera="computacion";
        p1.dni=73814148;
        p1.pension=250.00;
        p1.sede="independencia";
        p1.codigo=48264;
        p1.nota1=15;
        p1.nota2=18;
        p1.nota3=19;
        p1.promedio();
        p1.desplejaronjeto();        
    }
  
}

