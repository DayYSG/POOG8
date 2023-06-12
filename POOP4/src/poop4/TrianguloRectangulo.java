/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author poo08alu07
 */
public class TrianguloRectangulo {
    public float base;
    public float altura;
    //constructores

    public TrianguloRectangulo() {
    }

    public TrianguloRectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    //metodos 
    public void area(){
        System.out.println("Para calcular el area es: base*altura");
    }
    public void hipotenusa(){
        System.out.println("Para calcular la hipotenusa es: sqrt((base*altura)+(base*altura))");
    }
    public void perimetro(){
        System.out.println("Para calcular el perimetro: base + altura + hipotenusa");
    }
    
}
