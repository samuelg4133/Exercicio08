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
public class Administrador extends Empregado {
    private double ajudaDeCusto;

    public Administrador(double ajudaDeCusto, int codigoSetor, double salarioBase, double imposto, String nome, String endereco, String telefone) {
        super(codigoSetor, salarioBase, imposto, nome, endereco, telefone);
        this.setAjudaDeCusto(ajudaDeCusto);
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

 public double calcularSalario(){
    return this.salarioBase-((this.salarioBase*this.imposto)/100)+this.ajudaDeCusto;
    }
    
}
