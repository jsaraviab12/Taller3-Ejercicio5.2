/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Jesus
 */
public class Cuenta {
    int identi;
    int ncuenta;
   double saldo;
    double interes;
   public Cuenta(int  identi,int ncuenta, double saldo, double interes){
       this.identi = identi;
       this.ncuenta =ncuenta;
       this.saldo = saldo;
       this.interes= interes;
      
   } 

    public int getIdenti() {
        return identi;
    }

    public void setIdenti(int identi) {
        this.identi = identi;
    }

    public int getNcuenta() {
        return ncuenta;
    }

    public void setNcuenta(int ncuenta) {
        this.ncuenta = ncuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }
   public double ingresar (long ingreso){
       double nuevosaldo=0;
       nuevosaldo=this.saldo+ingreso;
       return nuevosaldo;
   }
   public double actualizar(){
   double intediario, saldonuevo;
   intediario=this.interes/365;
   saldonuevo=this.saldo+(intediario*this.saldo)/100;
   return saldonuevo;
   } 
   public double retirar(int retiro  ){
   double res;
   
   if(this.saldo<retiro){
   res = 0;
   }else{
  
   res =this.saldo=this.saldo-retiro; ;   
   }
   return res;
   } 
   public double ingres(double ingresa){
       double nuevo,op1;
        if (ingresa <= 0) {
            nuevo = 0;
        } else {
            op1 = this.saldo + ingresa;
            nuevo = op1;
        }
        return nuevo;
   }
     public Cuenta mostrar() {
        Cuenta c;
        int identificacion,numerocuenta;
        double saldon, interes;
        numerocuenta = this.ncuenta;
        identificacion = this.identi;
        saldon = this.saldo;
        interes = this.interes;
        c = new Cuenta(numerocuenta, identificacion,  interes, saldon);
        return c;
    }
   
   }
           

