/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11;

/**
 *
 * @author waria
 */
class Circulo extends FormaBidimensional{
    
    private double raio;

    public Circulo(double raio) {
        super("Circulo");
        this.raio = raio;
    }
    
    

    @Override
    public double obterArea() {
        return 4 * Math.PI * Math.pow(raio, 2);
    }

    @Override
    public String toString() {
        return "Circulo{" + "raio=" + raio + '}';
    }

    

   

    

    
   
    

    
    
}
