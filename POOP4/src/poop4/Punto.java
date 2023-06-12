/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author poo08alu07
 */
public class Punto {
    //Declaracion de atributos
    //protector int x;
    int x;
    int y;
    //Constructores(dos tipos: vacio y lleno)

    public Punto() {
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //Metodos
    public void imprimirPunto(){
        System.out.println("x="+x+" y="+y);
    }
}
