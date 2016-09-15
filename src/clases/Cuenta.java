/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Jesus
 */
public class Cuenta {
    int identi;
    int ncuenta;
   double saldo;
    
   public Cuenta(int  identi,int ncuenta, double saldo){
       this.identi = identi;
       this.ncuenta =ncuenta;
       this.saldo = saldo;
       
      
   }

    public Cuenta(int identi, int ncuenta) {
        this.identi = identi;
        this.ncuenta = ncuenta;
        this.saldo = 0;
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

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
   public void ingresar (double ingreso){
       double aux;
       aux=this.getSaldo ()+ingreso;
       this.setSaldo(aux);
   }
   public void acturalizar(double ian){
        double aux, aux2;
        aux = this.getSaldo()*(ian /365);
        aux2 = this.getSaldo() + aux;
        this.setSaldo(aux2);
   } 
   public void retirar(double retiro  ){
   double aux;
       aux = this.getSaldo() - retiro;
       this.setSaldo(aux);
   }
     public String mostrar() {
        String aux;
       aux = "No. de la cuenta: "+this.getNcuenta()+"\n"
           + "No. de Identificación: "+this.getIdenti()+"\n"
           + "Saldo Actual: "+this.getSaldo()+"\n"
               +"El interes agregado es de 12% del saldo acutal anualmente";
        return aux;
    } public String renovar(){
      String aux;
      aux=""+this.getSaldo();
      return aux;
    }
    
   
   }
           

