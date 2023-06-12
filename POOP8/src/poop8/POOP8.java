/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop8;

import mesario.Meses;
import tiendamusical.Flauta;
import tiendamusical.InstrumentoMusical;

/**
 *
 * @author poo08alu07
 */
public class POOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*No se pueden crear objetos de clases abtractas
        Poligono pol=new Poligono();*/
        //Se hace un parseo 
        Poligono pol;//se crea variable de tipo poligono
        pol = new Cuadrilatero(); //dentro de pol hay un cuadrilatero
        System.out.println(pol);
        //pol.setBase(0); (la funcion padre no conoce las demas funciones de las hijas)
        pol = new Triangulo();
        System.out.println(pol);
        pol.area();
        
        InstrumentoMusical ints;
        //ints = new InstrumentoMusical();
        ints =new Flauta();
        ints.tocar();
        
        System.out.println(Math.PI);
        System.out.println("El mes "+ Meses.DOS+" Corresponde al mes de "+ Meses.NOMBRE_MESES[Meses.DOS]);
        
    }
    
}
