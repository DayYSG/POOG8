/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author poo08alu07
 */
public class Perro {
    //ATRIBUTOS
    public String nombre;
    public String color;
    public String raza;
    public float peso;
    public float edad;

    public Perro() {
    }
    //Todo lo que es Sring lo va inicializar en NULL y primitivas en 0

    public Perro(String nombre, String color, String raza, float peso, float edad) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.peso = peso;
        this.edad = edad;
    }
    //Constructores
    public void ladrar(){  
        System.out.println("Guau Guau!");
               
    }
    public void comer(){
        System.out.println("Que ricas croquetas");
    }
    public void dormir(){
        System.out.println("ZzZzZzZz");
    }
    public void jugar(){
        System.out.println("Vamos a jugar");
    }
    public void desansar(){
        System.out.println("Quiero descansar");
    }
}