/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop2;
/**
 *
 * @author alumno
 */
public class POOP2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo");
        System.out.println("########### if 1 ##########");
        int a=15;
        int b;
        b=10;
        if (a<b) {
            System.out.println("a es menor que b");
        } else if (a==b){
            System.out.println("a es igual que b");
        } else {
            System.out.println("a es mayor que b");
        }
        System.out.println("########### if ej1 ##########");
        //Esta haciendo comparaciones 
        int e=50;
        int d=50;
        if (e<d) {
            System.out.println("e es menor que d");
        } else if (e==d){
            System.out.println("e es igual que d");
        } else {
            System.out.println("e es mayor que d");
        }
        System.out.println("########### if ej1 ##########");
        //Esta haciendo comparaciones 
        int x=50;
        int y=80;
        if (x<y) {
            System.out.println("x es menor que y");
        } else if (x==y){
            System.out.println("x es igual que y");
        } else {
            System.out.println("x es mayor que y");
        }
       
        System.out.println("########### if 2 ##########");
        if (menor(a,b)) {
            System.out.println("evaluacion menor");
        }else{
            System.out.println("Evaluacion msyor o igual");          
        }

        System.out.println("########### switch ##########");
        int dia=3;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;    
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;            
                   
            default:
                System.out.println("No es un dia de la semana");                
        }
           
        System.out.println("########### switch2 ##########");
        char vocal='a';
        switch (vocal) {
            case 'a':
                System.out.println("Vocal a");
                break;
            case 'e':
                System.out.println("Vocal e");
                break;
            case 'i':
                System.out.println("Vocal i");
                break;
            case 'o':
                System.out.println("Vocal o");
                break;
            case 'u':
                System.out.println("Vocal u");
                break;              
                   
            default:
                System.out.println("No es una vocal");                
        }
       
        System.out.println("######### while ######### ");
        int n=0;
        while (n<10){
            System.out.println("Contando hacia arriba"+n);
            n++;
        }
        while (n<10){
            System.out.println("Contando hacia abajo"+n);
            n--;
        }
        System.out.println("############ do-while #############");
        do {            
            System.out.println("Contando hacia abajo"+n);
            n--;
        } while (n>0);
        System.out.println("valor de n"+n);
   
        System.out.println("############ for 1 #############");
        for (int i = 0; i < 10; i++) {
            System.out.println("Contando hacia arriba i="+1);
        }
        for (int i = 10; i < 0; i--) {
            System.out.println("Contando hacia abajo");
        }
   
        System.out.println("######### for 2 ########### ");
        int[] miArreglo = {1,2,3,4,5};
        int numElementos = miArreglo.length;
        System.out.println("Numero de elementos del arreglo= "+numElementos);
       
        int[] miArreglo2 = new int[10];
        for (int i = 0; i < miArreglo2.length; i++) {
            miArreglo2[i]=i+1;

        }
        for (int i = 0; i < miArreglo2.length; i++) {
            System.out.println("miArreglo["+i+"]="+miArreglo2[i]);
       
        }
        for (int i = 0; i < miArreglo2.length; i++) {
            int j = miArreglo2[i];
            System.out.println("Cargando archivos "+j*10+"%");
           
        }
        System.out.println("####### foreach ##############");
        for(int i : miArreglo2){
            System.out.println("Extraccion de archivos confidenciales "+i*10+"%");
        }
    }              
    
    private static boolean menor(int x, int y) {
        /*if (x<y){
            return true;
        }else{
            return false;
        }*/
        System.out.println(x<y);
        return x<y;
    }
}     
