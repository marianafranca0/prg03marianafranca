/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11;

/**
 *
 * @author waria
 */ 
class Cubo extends FormaTridimensional {
    
    private double lado;

    public Cubo(double lado) {
        super("Cubo");
        this.lado = lado;
    }

    @Override
    public double obterVolume() {
       return Math.pow(lado, 3);
    }

    @Override
    public double obterArea() {
       return 6* Math.pow(lado, 2);
    }

    @Override
    public String toString() {
        return "Cubo{" + "lado=" + lado + '}';
    }
    
    
}
