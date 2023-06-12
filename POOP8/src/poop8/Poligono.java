/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author poo08alu07
 */
public abstract class Poligono {
    
    public abstract void area();//metodo abstracto porque esta definido y no tiene funcionalidad 
    public abstract void perimetro();

    @Override
    public String toString() { //Regresa una cadena poligono
        return "Poligono{" + '}';
    }
    
    
}
