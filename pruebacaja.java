/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

/**
 *
 * @author PC02-LAB02
 */
public class pruebacaja {
 int ancho;
 int alto;
 int profundo;
 
 
 pruebacaja(){
 }//constructor vacio
  pruebacaja(int ancho,int alto,int profundo){
     this.ancho=ancho;
     this.alto=alto;
     this.profundo=profundo;
    
 }
//metodo
  
  public int Volumen(/*int ancho,int alto, int profundo*/){
    return ancho*alto*profundo;
} 
  
 
 }

     


