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
public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;
    
    public double obterSaldo(){
   return this.valorCredito-this.valorDivida; 
    }
    
    public Fornecedor(String nome, String endereco, String telefone, double valorCredito,
            double valorDivida){
    super(nome, endereco, telefone);
    this.setValorCredito(valorCredito);
    this.setValorDivida(valorDivida);
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
}
