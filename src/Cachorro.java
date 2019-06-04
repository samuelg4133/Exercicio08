/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class Cachorro extends Mamifero{
      private boolean lateAlto;
    
    public Cachorro (String n, int p,boolean l){
        super(n,p);
  this.setLateAlto(l);
    }
    
    public boolean isLateAlto(){
    return this.lateAlto;
    }
    
    public void setLateAlto(boolean l){
    this.lateAlto=l;
    }
    public void talk(){
       System.out.println("au,au");
}
}


