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
    public double execute(double valorASerSacado, int numeroDaConta) {

        Conta conta;
        conta = repository.findById(numeroDaConta);
        boolean saqueRealizado = conta.retirarSaldo(valorASerSacado);
        if (saqueRealizado) {
            System.out.printf("Saque realizado! Seu saldo atual é de R$ %.2f! %n", conta.getSaldo());
        }

        return valorASerSacadoSacado;

    }
}

