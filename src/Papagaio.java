/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class Papagaio extends Ave{
   
    private String frase;
  
    public Papagaio(String n, boolean v, String f){
    super(n, v);
    this.setFrase(f);
    }
    
    public void talk(){
      System.out.println(this.getFrase());
    }
              
              public void setFrase(String f){
              this.frase=f;
              }
              
              public String getFrase(){
              return this.frase;
              
              }
}
