/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class Ave extends Animal {
    private boolean voa;
    
    public Ave(String n, boolean v){
    super(n);
    this.setVoa(v);
    }
    
    public boolean getVoa(){
    return this.voa;
    }
    
    public void setVoa(boolean v){
    this.voa=v;
    }
    
    public void talk(){
       System.out.println("piu-piu");
    }
}
