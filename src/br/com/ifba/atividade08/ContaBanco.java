/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

/**
 *
 * @author waria
 */

public class ContaBanco {
    
    // atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
   
    // método que mostra o estado atual do objeto
    public void estadoDaConta(){
        System.out.println("Conta - " + this.getNumConta());
        System.out.println("Tipo - " + this.getTipo());
        System.out.println("Dono - " + this.getDono());
        System.out.println("Saldo - " + this.getSaldo());
        System.out.println("Status - " + this.getStatus());
    }
    
    // método que abre uma conta
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        
        if (t == "cc"){
            this.setSaldo(50);   
        }else if (t == "cp"){
            this.setSaldo(150);
        }
         System.out.println("Conta aberta!!");
    }
    
    // método que fecha uma conta
    public void fecharConta(){
         if(this.getSaldo()> 0){
             System.out.println("Não é possivel fechar a conta");
         }else if (this.getSaldo() < 0){
             System.out.println("Não é possivel fechar a conta");
         }else{
             this.setStatus(false);
             System.out.println("Conta fechada!!");
         }
    }
    
    // método que deposita valores na conta
    public void depositar(float valor){
        
        if(this.getStatus()){
            this.setSaldo(this.getSaldo()+valor);
            System.out.println("Deposito realizado!!");  
        }else{
            System.out.println("Não é possível realizar o deposito!!");
        }
    }
    
    // metodo que saca valores da conta
    public void sacar(float valor){
        
        if(this.getStatus()){
            if(this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado!!");  
            }else{
                System.out.println("Não é possível realizar o saque, saldo insuficiente!!");
            }
        }else{
            System.out.println("Não é possível realizar o saque, conta fechada!!");
        }
    }
    
    // metodo que cobra a mensalidade a partir do tipo da conta
    public void pagarMensal(){
        int v = 0;
        if(this.getTipo() == "cc"){
            v = 12;
        }else if (this.getTipo()== "cp"){
            v = 20;
        }
        
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga!!");
        }else{
            System.out.println("Não é possível pagar a mensalidade, conta fechada!!");
        }
    }
    
    // método construtor
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    
    // MÉTODO ASSOCIATIVO (GETTER) E MODIFICADOR (SETTER)
    
    // método que retorna o numero da conta
    public int getNumConta() {
        return numConta;
    }
    
    // método que atuzaliza/define o numero da conta
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    } 
    
    // método que retorna o tipo da conta
    public String getTipo() {
        return tipo;
    }
    
    // método que atuzaliza/define o tipo da conta
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    // método que retorna o dono da conta
    public String getDono() {
        return dono;
    }
    
    // método que atuzaliza/define o dono da conta
    public void setDono(String dono) {
        this.dono = dono;
    }
    
    // método que retorna o saldo
    public float getSaldo() {
        return saldo;
    }
    
    // método que atuzaliza/define o saldo da conta
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    // método que retorna status da conta
    public boolean getStatus() {
        return status;
    }
    
    // método que atuzaliza/define o status da conta
    public void setStatus(boolean status) {
        this.status = status;
    }
    
   
}
