/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author poo08alu07
 */
public class Profesor {
    public String Nombre;
    public float Edad;
    public String Asignatura;
    public String Sexo;
    //constructores

    public Profesor() {
    }

    public Profesor(String Nombre, float Edad, String Asignatura, String Sexo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Asignatura = Asignatura;
        this.Sexo = Sexo;
    }
    //métodos
    public void escuela(){
        System.out.println("Imparto clases en UNAM/UAM/IPN/PRIVADA");
    }
    public void nivel(){
        System.out.println("Soy profesor de nivel MediaSuperio/Superior");
    }
    public void turno(){
        System.out.println("Matutino,Vespertino,Mixto");
    }
}
