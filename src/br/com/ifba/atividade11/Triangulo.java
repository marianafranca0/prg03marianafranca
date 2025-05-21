/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11;

/**
 *
 * @author waria
 */
class Triangulo extends FormaBidimensional {
    
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        super("Triangulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double obterArea() {
        return (base*altura)/2;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
}
