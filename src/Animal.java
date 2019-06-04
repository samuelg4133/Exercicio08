/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class Animal {
    private String nome;
    
    public Animal (String n){
  this.setNome(n);
    }
    
    public void imprime(){
        System.out.println(getNome());
    }
    
    public void talk(){}
    
    public String getNome(){
    return this.nome;
    }
    
    public void setNome(String n){
    this.nome=n;
    }
}
