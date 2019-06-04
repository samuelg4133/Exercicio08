/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão03;

/**
 *
 * @author ifnmg
 */
public class Pessoa {
    private String nome, endereco, telefone;
    
    public Pessoa (String nome, String endereco, String telefone){
    this.setNome(nome);
    this.setEndereco(endereco);
    this.setTelefone(telefone);
    }
    
    public void setNome(String nome){
    this.nome=nome;
    }
    
    public void setEndereco(String endereco){
    this.endereco=endereco;
    }
    
    public void setTelefone(String telefone){
    this.telefone=telefone;
    }
}
