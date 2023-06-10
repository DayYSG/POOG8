/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author poo08alu07
 */
public class Cuenta {
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }        
           
    public void depositar(double monto){
        System.out.println("Depositando.....$"+monto);
        saldo += monto;
    } 
    public void retirar (double monto) throws SaldoInsufisioenteException{
        System.out.println("Retirando.....$"+monto);
        if (saldo > monto)
            saldo-= monto;
        else
            throw new SaldoInsufisioenteException();
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo= $" + saldo + '}';
    }
    
    
}
