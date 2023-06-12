/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author poo08alu07
 */
public class Coche {
    //atributos
    public String marca;
    public String modelo;
    public String color;
    public float anio;
    //Constructores
    public Coche() {
    }
    public Coche(String marca, String modelo, String color, float anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio= anio;
    }
    //métodos
    public void kilometraje(){
        System.out.println("0 kilometros");
    }
    public void agencia(){
        System.out.println("Este coche es de agencia");        
    }
    public void uso(){
        System.out.println("Puede ser nuevo o seminuevo depende lo que busque");
    } 
}
