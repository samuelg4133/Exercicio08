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
    Fornecedor f1 = new Fornecedor ("Conectv", "Rua Bahia, 17", "(38)3740-0000", 1000, 500);
    
    System.out.println(f1.obterSaldo());
    
    Empregado e1 = new Empregado (1, 1000.00, 8.0, "Igor", "Rua B, 173", "(38)3742-6250" );
    System.out.println(e1.calcularSalario());
    
    Administrador a1 = new Administrador (150, 2, 3500, 8, "Igor", "Rua B, 173", "(38)3742-6250");
    System.out.println(a1.calcularSalario());
    
    Operador o1 = new Operador (1000, 10, 5, 1000, 8, "Igor", "Rua B, 173", "(38)3742-6250");
    System.out.println(o1.calcularSalario());
    }
}