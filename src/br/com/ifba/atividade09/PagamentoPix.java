/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

// Classe PagamentoPix implementa interface Pagamento
public class PagamentoPix implements Pagamento {
    
    // declaração das variaveis
    private double valor;
    private String reciboTexto;
  
    // --- métodos ---
    @Override
    public double calculaTotal() {
        return valor - valor * 0.02;
        
    }

    @Override
    public void imprimirRecibo(){
         // armazena o recibo em uma string
        // solução implementada para que o recibo possa ser exibido na interface gráfica
        String recibo = String.format("Tipo de pagamento: Pix \nValor inicial: %.2f \nCashback: %f \nValor final: %.2f", valor, valor*0.02,calculaTotal());
        this.reciboTexto = recibo;
   
    }
    
    // define o valor
     public void setValor(double valor){
        this.valor = valor;
    }

    // retorna a string recibo
    public String getRecibo(){
        return reciboTexto;
    }
    
    
}
