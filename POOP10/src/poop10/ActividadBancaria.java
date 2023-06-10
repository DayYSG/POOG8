/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author poo08alu07
 */
public class ActividadBancaria {
    private double saldo;
    private int contadorRetiros;

    public ActividadBancaria() {
        saldo = 0.0;
        contadorRetiros = 0;
    }

    public void depositar(double cantidad) throws Exception {
        if (cantidad > 20000) {
            throw new Exception("No se pueden depositar más de 20000 pesos.");
        }
        saldo += cantidad;
    }

    public void retirar(double cantidad) throws Exception {
        if (cantidad > saldo) {
            throw new Exception("Saldo insuficiente.");
        }
        if (contadorRetiros >= 3) {
            throw new Exception("Se ha alcanzado el límite de retiros.");
        }
        saldo -= cantidad;
        contadorRetiros++;
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public int obtenerContadorRetiros() {
        return contadorRetiros;
    }
}

