/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author waria
 */
import java.time.LocalDateTime;

public class Usuario {
    
    // atributos da classe
    private String nomeUsuario;
    private String email;
    private String senha;
    private LocalDateTime ultimoLogin;
    private Boolean ativo;
    private PerfilUsuario perfil;

    
    // método Construtor -------------
    public Usuario(String nomeUsuario, String email, String senha, LocalDateTime ultimoLogin, Boolean ativo, PerfilUsuario perfil) {
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.ultimoLogin = null;
        this.ativo = ativo;
        this.perfil = perfil;
    }

    // métodos getters e setters
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(LocalDateTime ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public PerfilUsuario getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
    }
    
    // método logar
    public void logar(String senha){
        if(!ativo){
            System.out.println("Não é possivel logar, usuario inativo!!");
             return;
        }
        if(this.senha.equals(senha)){
            this.ultimoLogin = LocalDateTime.now();
            System.out.println("Login realizado!!");
        }else{
            System.out.println("Senha incorreta!!");
        }
    }
    
    // método toString()
    @Override
    public String toString() {
        return "Usuario{" + "nomeUsuario=" + nomeUsuario + ", email=" + email + ", senha=" + senha + ", ultimoLogin=" + ultimoLogin + ", ativo=" + ativo + ", perfil=" + perfil + '}';
    }
    
       
}

    
    
    

