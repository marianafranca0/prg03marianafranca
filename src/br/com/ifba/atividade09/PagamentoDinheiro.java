/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

// Classe PagamentoDinheiro implementa interface Pagamento
public class PagamentoDinheiro implements Pagamento {
   
    // definição das variaveis
    private double valor;
    private String reciboTexto;
    
    
    // --- métodos ---
    @Override
    public double calculaTotal() {
        return valor - (valor * 0.10); 
        
    }
    @Override
    public void imprimirRecibo(){
        // armazena o recibo em uma string
        // solução implementada para que o recibo possa ser exibido na interface gráfica
        String recibo = String.format("Tipo de pagamento: Dinheiro \nValor inicial: %.2f \nDesconto: %.2f \nValor final: %.2f", valor, valor*0.10, calculaTotal());
       
        // armazena a string recibo
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
