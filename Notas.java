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
public class Notas {
 String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    String carrera;
    int dni;
    double pension;
    String sede;
    int codigo;
    double nota1;
    double nota2;
    double nota3;
    double promedio;
    public void desplejaronjeto(){
        System.out.println("nombre: "+nombre);
        System.out.println("Apellido Paterno: "+apellidoPaterno);
        System.out.println("apellido Materno: "+apellidoMaterno);
        System.out.println("Carrera: "+carrera);
        System.out.println("dni: "+dni);
        System.out.println("pension: "+pension);
        System.out.println("sede: "+sede);
        System.out.println("codigo: "+codigo);
        System.out.println("nota1: "+nota1);
        System.out.println("nota2: "+nota2);
        System.out.println("nota3: "+nota3);
        System.out.println("promedio: "+promedio);
        // TODO code application logic here
    }
    
    public void promedio(){
       promedio=(nota1+nota2+nota3)/3;
    }
    


}
