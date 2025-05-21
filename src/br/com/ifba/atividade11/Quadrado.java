/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11;

/**
 *
 * @author waria
 */
class Quadrado extends FormaBidimensional {

    
    private double lado;

    public Quadrado(double lado) {
        super("Quadrado");
        this.lado = lado;
    }
    

    @Override
    public double obterArea() {
       return lado * lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" + "lado=" + lado + '}';
    }

    
    
    
    
}
