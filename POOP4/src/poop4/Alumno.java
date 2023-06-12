/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author poo08alu07
 */
public class Alumno {
    public String Nombre;
    public float Edad;
    public int NCuenta;
    public String Sexo;
    //constructores

    public Alumno() {
    }

    public Alumno(String Nombre, float Edad, int NCuenta, String Sexo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.NCuenta = NCuenta;
        this.Sexo = Sexo;
    }
    //métodos
    public void división(){
        System.out.println("Ciencias Basicas");
    }
    public void nivel(){
        System.out.println("Superior");
    }
    public void turno(){
        System.out.println("Matutino,Vespertino,Mixto");
    }
    
}
