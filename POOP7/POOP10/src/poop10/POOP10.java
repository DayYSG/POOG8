/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author poo08alu07
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arreglo= {23,45,67,89};
        try{
        for (int i=0; i<=arreglo.length;i++){
            System.out.println(arreglo[i]);
        }
        } catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Excepciòn: "+ex.getMessage());
        } 
        System.out.println("Esta linea sì es alcanzable");       
        //arimetica exception
        try{
            
        float equis = 0/0;
        System.out.println("Divisiòn= "+equis);
        } catch(ArithmeticException ex){
            System.out.println("Excepciòn"+ ex.getMessage());
            ex.printStackTrace();
        }       
        try{
            float a= 0/0;
            System.out.println(a);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Ex :"+ ex.getMessage());
        }catch(ArithmeticException ex){
            System.out.println("Ex :"+ ex.getMessage());
        }catch(Exception ex){
            System.out.println("Ex :"+ ex.getMessage());
        }
        try{
            float division= division(10,2);
            System.out.println("division metodo: "+division);
        }catch(UnsupportedOperationException ex){
            System.out.println("Ex: "+ex.getMessage());
        }catch(ArithmeticException ex){
            System.out.println("Ex :"+ ex.getMessage());
        }
        System.out.println("Esta es la ultima lìnea");
        
        try{
        float divs= division(3,0); 
        }catch(ArithmeticException ex){
            System.out.println("Ex :"+ ex.getMessage());
        }
        
        System.out.println("###############CUENTA######################");
        Cuenta cuenta = new Cuenta (100);
        try {
            System.out.println(cuenta);
            cuenta.depositar(150);
            System.out.println(cuenta.getSaldo());
            cuenta.retirar(300);
        } catch (SaldoInsufisioenteException ex) {
            //Logger.getLogger(POOP10.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        System.out.println(cuenta.getSaldo());
    }

    private static float division(int a, int b) throws ArithmeticException{
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return a/b;
       }
}
    //aCTIVIDAD NO SE PUEDEN DEPOSITAR MAS DE 20000 PESOS SI SE DEPOSITA MAS DE 20000 QUE SALGA UNA EXCEPCION 
//Y NO PUEDE HACER MAS DE 3 RETIROS 
    

