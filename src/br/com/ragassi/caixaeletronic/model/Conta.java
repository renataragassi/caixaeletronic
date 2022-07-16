package br.com.ragassi.caixaeletronic.model;

public class Conta {

    private int numeroDaConta;
    private double saldo;

    public Conta() {
        saldo = 0;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;

    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {

        return saldo;
    }

    public void adicionaSaldo(double valorASerAdicionado) {

        saldo = saldo + valorASerAdicionado;
    }

    public boolean retirarSaldo (double valorASerRetirado){
        if (saldo >= valorASerRetirado) {
            saldo = saldo - valorASerRetirado;
            return true;
        } else {
            System.out.println("Seu saldo é insuficiente!");
            return false;
        }
    }

}