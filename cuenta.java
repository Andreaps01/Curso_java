/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author PC01-LAB02
 */
public class cuenta {
   private String Nombre;
    private String NumeroCuenta;
   private double TipoInteres;
    private double Saldo;

    public cuenta(String Nombre, String numCuenta, double interes, double saldo) {
        this.Nombre=Nombre;
         this.NumeroCuenta = numCuenta;
        this.TipoInteres = interes;
        this.Saldo = saldo;

    }

   public cuenta() {
        }

   public  cuenta(final cuenta c) {
       Nombre = c.Nombre;
        NumeroCuenta = c.NumeroCuenta;
        TipoInteres = c.TipoInteres;
        Saldo = c.Saldo;
        }

   public void setNombre(String s) {
       Nombre=s;
    }

    public void setNumeroCuenta(String s) {
    NumeroCuenta=s;
    }

    public void setTipoInteres(double n) {
    TipoInteres=n; 
    }

    public void setSaldo(double n) {
    Saldo=n;
    }

    public String getNombre() {
        return Nombre;
   }

    public String getNumeroCuenta() {
        return NumeroCuenta;
   }

    public double getTipoInteres() {
        return TipoInteres;
    }

    public double getSaldo() {
        return Saldo;
    }

  public boolean ingreso(double n){
      boolean ingresoCorrecto=true;
      if(n<0){
         ingresoCorrecto=false;
         
      }else{
          Saldo=Saldo+n;
      }
      return ingresoCorrecto;
  }

    public boolean reintegro(double n){
        boolean reintegroCorrecto=true;
        if(n<0){
            reintegroCorrecto=false;
        }else if (Saldo >=n){
            Saldo -=n;
        }else{
           reintegroCorrecto=false;
        }
    return reintegroCorrecto;
    }
     public boolean transferencia(cuenta c, double n) {
        boolean correcto = true;
        if (n < 0) {
            correcto = false;
        } else if (Saldo >= n) {
            reintegro(n);
            c.ingreso(n);
        } else {
            correcto = false;
        }
        return correcto;
    }
}
    
    
    
    
    

