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
public class Teste {
    
    public static void main (String [] args){
    Pessoa p1 = new Pessoa ("Igor", "Rua B, 173", "(38)3742-6250");
    Fornecedor f1 = new Fornecedor ("Conectv", "Rua Bahia, 17", "(38)3740-0000", 1000.00, 500.00);
    
    f1.obterSaldo();
}
}