package br.com.ragassi.caixaeletronic.service;

import br.com.ragassi.caixaeletronic.model.Conta;
import br.com.ragassi.caixaeletronic.repository.BaseRepository;
import br.com.ragassi.caixaeletronic.repository.MemoriaContaRepository;

public class DepositoImpl implements Deposito{

    private final MemoriaContaRepository repository;

    public DepositoImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }


    @Override
    public double execute(double valorDepositado, int numeroDaConta) {
        Conta conta;
        BaseRepository<Object> repository = null;

        conta = repository.findById(numeroDaConta);
        conta.adicionaSaldo(valorDepositado);
        System.out.printf("Depósito realizado! Seu saldo atual é de R$ %.2f)!%n", conta.getSaldo());
        return valorDepositado;
    }

}
