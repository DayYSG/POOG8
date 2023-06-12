/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop4;

/**
 *
 * @author poo08alu07
 */
public class POOP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punto p1=new Punto();
        //System.out.println(p1.imprimirPunto());
        p1.imprimirPunto();
        Punto p2=new Punto(2,3);
        p2.imprimirPunto();
        System.out.println(p1);
         
        Perro Maxi = new Perro();
        System.out.println("Nombre: "+Maxi.nombre);
        Maxi.nombre="Max";
        Maxi.color="cafe";
        Maxi.raza="labrador";
        Maxi.peso= (float)32.6;
        Maxi.edad = 5.0f;//f porque es como un double
       
        System.out.println("Nombre: "+Maxi.nombre);
       
        Perro Kira = new Perro("Kira","Blanco","Dalmata",15.99f,(float)10.0);
        System.out.println(Kira.nombre);
        System.out.println(Kira.color);
        System.out.println(Kira.raza);
        System.out.println(Kira.peso);
        System.out.println(Kira.edad);
       
        System.out.println(Kira.toString());/*aloja la referencia este vamos a 
        utilizar para convertir kira a un tipo string*/
        
        System.out.println("*************************");
        Coche March = new Coche("Nissan","March","Azul",2023f);
        System.out.println(March.marca);
        System.out.println(March.modelo);
        System.out.println(March.color);
        System.out.println(March.anio);
        
        System.out.println("*************************");
        Alumno Dayna = new Alumno ("Dayna",20f,319140765,"Femenino");
        System.out.println(Dayna.Nombre);
        System.out.println(Dayna.Edad);
        System.out.println(Dayna.NCuenta);
        System.out.println(Dayna.Sexo);
        
        System.out.println("*************************");
        Profesor Jorge = new Profesor ("Genaro",45f,"Biologia","Masculino");
        System.out.println(Jorge.Nombre);
        System.out.println(Jorge.Edad);
        System.out.println(Jorge.Asignatura);     
        System.out.println(Jorge.Sexo);
       
        System.out.println("*************************");
        TrianguloRectangulo Tri = new TrianguloRectangulo(2.3f,6.8f);
        System.out.println("Base: "+Tri.base);
        System.out.println("Altura: "+Tri.altura);
              
    }
   
}


