/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author waria
 */
import java.util.Arrays;

// Classe Main
public class Main {
    public static void main(String[] args) {
     
        // Criando perfis
        PerfilUsuario perfil1 = new PerfilUsuario(1L, "Usuario1", "true", Arrays.asList("GERENCIAR_USUARIOS", "EDITAR_CONFIGURACOES"));
        PerfilUsuario perfil2 = new PerfilUsuario(2L, "Usuario2", "true", Arrays.asList("GERENCIAR_USUARIOS", "EDITAR_CONFIGURACOES"));

        // Criando usuários
        Usuario usuario1 = new Usuario("Mariana", "mariana@email.com", "senha123", null, true, perfil1);
        Usuario usuario2 = new Usuario("Samuel", "samuel@email.com", "senha1234", null, true, perfil2);

        // login com a senha correta 
        usuario1.logar("senha123");
        System.out.println(usuario1);
        
        // login com a senha incorreta
        usuario2.logar("senha345");
        System.out.println(usuario2);
        }
    }




    



