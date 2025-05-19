/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

import br.com.ifba.atividade10.LogAuditoria;
import br.com.ifba.atividade10.Sessao;
import br.com.ifba.atividade10.Usuario;

/**
 *
 * @author waria
 */
import java.util.List;

public class PerfilUsuario {
   
    // atributos da classe
    private long id;
    private String descricao;
    private String permissao; 
    private List<String> permissoes;

    
    // método Construtor -------------
    public PerfilUsuario(long id, String descricao, String permissao, List<String> permissoes) {
        this.id = id;
        this.descricao = descricao;
        this.permissao = permissao;
        this.permissoes = permissoes;
    }

    // métodos getters e setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

    public List<String> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(List<String> permissoes) {
        this.permissoes = permissoes;
    }

    
    // método toString()
    @Override
    public String toString() {
        return "PerfilUsuario{" + "id=" + id + ", descricao=" + descricao + ", permissao=" + permissao + ", permissoes=" + permissoes + '}';
    }

    
    
    
    
    
}
    
    
    





   
    

