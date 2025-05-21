/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11;

/**
 *
 * @author waria
 */
abstract class Forma {
    
    private String nomeForma;

    public Forma(String nomeForma) {
        this.nomeForma = nomeForma;
    }

    public String getNomeForma() {
        return nomeForma;
    }
    
    public abstract double obterArea();

    @Override
    public String toString() {
        return "Forma{" + "nomeForma=" + nomeForma + '}';
    }
    

    
    
    
}
