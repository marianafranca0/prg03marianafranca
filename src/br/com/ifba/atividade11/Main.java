/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11;

/**
 *
 * @author waria
 */
public class Main {
      public static void main(String[] args) {

          // array de formas com os objetos das classes
          Forma[] formas = {new Circulo(5), new Quadrado(4),new Esfera(3),new Cubo(2),new Piramide(7, 9)};
          
          // percorre o array e chama os metodos de cada objeto
          for(Forma forma : formas){
            System.out.println(forma);
            System.out.println("Area: " + forma.obterArea());

            // se for tridimensional, exibe o volume
            if (forma instanceof FormaTridimensional) {
                System.out.println("Volume: " +((FormaTridimensional) forma).obterVolume());
            }
        }
    } 
}
