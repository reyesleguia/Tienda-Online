
package Modelo;


public class CuentaAhorro extends CuentaBancaria{
     private double saldo;

    public CuentaAhorro(double saldo, String idCuenta, String idTitular, String nombreTitular, String tipoCuenta, String idSede) {
        super(idCuenta, idTitular, nombreTitular, tipoCuenta, idSede);
        this.saldo = saldo;
    }

    public CuentaAhorro(double saldo) {
        this.saldo = saldo;
    }
     
    
    
}
