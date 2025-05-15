/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

// Classe PagamentoCartao implementa interface Pagamento
public class PagamentoCartao implements Pagamento {
    
    // declaração das variaveis
    private double valor;
    private String reciboTexto;
    
   
    // --- métodos ---
    @Override
    public double calculaTotal() {
        return valor + (valor * 0.05);   
    }

    @Override
    public void imprimirRecibo(){
        // armazena o recibo em uma string
        // solução implementada para que o recibo possa ser exibido na interface gráfica
        String recibo = String.format("Tipo de pagamento: Cartão \nValor inicial: %.2f \nTaxa: %.2f \nValor final: %.2f", valor, valor * 0.05,calculaTotal());
        this.reciboTexto = recibo;
   
    }
    
    // define o valor
     public void setValor(double valor){
        this.valor = valor;
    }
     
     // retorna a string recido
    public String getRecibo(){
        return reciboTexto;
    }
    
    
    
}
