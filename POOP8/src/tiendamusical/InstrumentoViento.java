/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendamusical;

/**
 *
 * @author poo08alu07
 */
public class InstrumentoViento extends Object implements InstrumentoMusical {

    public InstrumentoViento() {
    }
    
    
    @Override
    public void tocar() {
        System.out.println("Tocando instrumento de viento");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando instrumento de viento");
    }

    @Override
    public String tipoInstrumento() {
        return "Instrumento de viento";
    }

    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
    
    
}
