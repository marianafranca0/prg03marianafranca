/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11;

/**
 *
 * @author waria
 */
abstract class FormaTridimensional extends Forma {

    public FormaTridimensional(String nomeForma) {
        super(nomeForma);
    }
    
    public abstract double obterVolume();

}
