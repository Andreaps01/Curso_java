/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja1;

/**
 *
 * @author PC02-LAB02
 */
class pruebacaja1 {

 int ancho;
 int alto;
 int profundo;
 pruebacaja1(){
 }//constructor vacio
  pruebacaja1(int ancho,int alto,int profundo){
     this.ancho=ancho;
     this.alto=alto;
     this.profundo=profundo;
    
 }
//metodo
  
  public int Volumen(/*int ancho,int alto, int profundo*/){
    return ancho*alto*profundo;
} 

  public int area(){
     return ancho*alto;
 }
   public int doble(/*int ancho,int alto, int profundo*/){
    this.ancho*=2;
     this.alto*=2;
     this.profundo*=2;
     int d=alto*ancho*2+alto*profundo*2+ancho*profundo*2;
     return d ;
}
}
