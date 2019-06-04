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
public class Operador extends Empregado{
    private double valorProducao;
    private double comissao;
    
     public double calcularSalario(){
    
          double x =  this.salarioBase+(this.valorProducao-(100-this.comissao)/100);
          
         double salarioTotal =x -((x*this.imposto)/100);
            return salarioTotal;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public Operador(double valorProducao, double comissao, int codigoSetor, double salarioBase, double imposto, String nome, String endereco, String telefone) {
        super(codigoSetor, salarioBase, imposto, nome, endereco, telefone);
        this.setValorProducao(valorProducao);
        this.setComissao(comissao);
    }
    
     
     
}
