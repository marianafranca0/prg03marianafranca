/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11;

/**
 *
 * @author waria
 */

// Herda da classe FormaTridimensional
class Piramide extends FormaTridimensional {
    
    // Atributos
    private double base;
    private double altura;

    // Construtor -------------
    public Piramide(double base, double altura) {
        super("Piramide");
        this.base = base;
        this.altura = altura;
    }

    // Métodos ---------------
    // calculos feitos no sentido de que a piramide é quadrada
    @Override
    public double obterVolume() {
       return (Math.pow(base, 2) * altura) / 3;
    }

    @Override
    public double obterArea() {
        double areaBase = Math.pow(base, 2);
        double areaLateral = 4 * (base * altura / 2); 
        return areaBase + areaLateral;
    }

    @Override
    public String toString() {
        return "Piramide{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
}
