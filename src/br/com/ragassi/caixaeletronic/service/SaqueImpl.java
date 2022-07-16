package br.com.ragassi.caixaeletronic.service;

import br.com.ragassi.caixaeletronic.model.Conta;
import br.com.ragassi.caixaeletronic.repository.BaseRepository;
import br.com.ragassi.caixaeletronic.repository.MemoriaContaRepository;

public class SaqueImpl implements Saque {

    private final MemoriaContaRepository repository;
    public SaqueImpl(MemoriaContaRepository repository) {
        this.repository = repository;

    }
    @Override
    public double execute(double valorSacado, int numeroDaConta) {

        Conta conta;
        conta = repository.findById(numeroDaConta);
        conta.retirarSaldo();
        System.out.printf("Saque realizado! Seu saldo atual é de R$ %.2f! %n", conta.getSaldo());
        return valorSacado;

    }
}

