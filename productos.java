/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producto;

/**
 *
 * @author Andrea
 */
public class productos {
    String Nombre;
double alto;
double ancho;
double profundo;
int stock;
String tipo;
double precio;

productos(){
}
productos(String nombre,double alto,double ancho,double profundo,int stock,String tipo,double precio){

    this.Nombre=nombre;
    this.alto=alto;
    this.ancho=ancho;
    this.profundo=profundo;
    this.stock=stock;
    this.tipo=tipo;
    this.precio=precio;
}
double volumen(){
return alto*ancho*profundo;
        }
double cantidad(){
    return stock*precio;
}
public int getstock(){
    return stock;
}
}


