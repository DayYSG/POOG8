/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author poo08alu07
 */
public class Triangulo extends Poligono {
    private int alpha;
    private int betha;
    private int gamma;

    private float a;
    private float b;
    private float c;
    
    private float base;
    private float altura;

    public Triangulo() {
    }

    public Triangulo(int alpha, int betha, int gamma, float a, float b, float c, float base, float altura) {
        this.alpha = alpha;
        this.betha = betha;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
    }

    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    public int getBetha() {
        return betha;
    }

    public void setBetha(int betha) {
        this.betha = betha;
    }

    public int getGamma() {
        return gamma;
    }

    public void setGamma(int gamma) {
        this.gamma = gamma;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    @Override
    public void area(){
        System.out.println("Area= "+(base*altura)/2);
    }
    
    @Override
    public void perimetro(){
        System.out.println("Perimetro="+ (a+b+c));
    }

    @Override
    public String toString() {
        return "Triangulo{" + "alpha=" + alpha + ", betha=" + betha + ", gamma=" + gamma + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + '}';
    }
    
    
    
}
