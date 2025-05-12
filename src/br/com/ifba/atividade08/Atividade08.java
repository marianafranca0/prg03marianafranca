/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;
public class Atividade08 {
     public static void main(String[] args) {
       
         ContaBanco pessoa1 = new ContaBanco();
         pessoa1.setNumConta(1055);
         pessoa1.setDono("Jubileu");
         pessoa1.abrirConta("cc");
         pessoa1.estadoDaConta();
         
         ContaBanco pessoa2 = new ContaBanco();
         pessoa2.setNumConta(1066);
         pessoa2.setDono("Creusa");
         pessoa2.abrirConta("cp");
         pessoa2.estadoDaConta();
         
         pessoa1.depositar(1400);
         pessoa1.estadoDaConta();
         
         pessoa1.sacar(350);
         pessoa1.estadoDaConta();
         
         pessoa2.depositar(500);
         pessoa2.pagarMensal();
         pessoa2.estadoDaConta();
         
         
    }
}


