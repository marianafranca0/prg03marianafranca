/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.tela;

/**
 *
 * @author waria
 */
// define a classe fatorial
public class Fatorial {
    
    // atributos da classe
    private int num = 0; 
    private int fatorial = 1;
    private String formula = "";
    
    // metodo que calcula o fatorial 
    public void setValor(int n){
       num = n; // atribui o numero recebido ao atributo num
       int f = 1; // variavel temporaria para calcular o fatorial
       String s = ""; // variavel que constroi a formula do calculo
       
       // estrutura de repetição que calcula o fatorial
       for(int i = n; i > 1; i--){
           f *= i; // multiplica a variável f pelo valor de i
           s += i + " x "; // adiciona o numero e o simbolo de multiplicação a formula

       }
       // adiciona o último valor "1 =" a formula
       s += "1 = ";
       // armazena os valores calculados nos atributos da classe
       fatorial = f;
       formula = s;
       
    }
    // metodo que retorna o valor do fatorial calculado
    public int getFatorial(){
        return fatorial;
    }
    // metodo que retorna a formula do calculo do fatorial
    public String getFormula(){
        return formula;
    }
    
}
