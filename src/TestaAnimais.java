/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class TestaAnimais {
    
    public static void main(String[]args){
    
    Papagaio Pedro = new Papagaio("Pedro Henrique", true, "Raiquiz");
        Pedro.talk();
        Pedro.imprime();
        
        Cachorro Hernany = new Cachorro("Hernany Gomes Vieira", 4, true);
        Hernany.talk();
        Hernany.imprime();
        
        Arara Raquel = new Arara("Raquel", true);
        Raquel.talk();
        Raquel.imprime();
        
        Vaca Tayssa = new Vaca("Tayssa Mara", 4, false);
        Tayssa.talk();
        Tayssa.imprime();
    }
}
