package br.com.ragassi.caixaeletronic.service;

import br.com.ragassi.caixaeletronic.model.Conta;
import br.com.ragassi.caixaeletronic.repository.MemoriaContaRepository;

public class TransferenciaImpl implements Transferencia {

    private final MemoriaContaRepository repository;

    public TransferenciaImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }

    @Override
    public double execute(double valorASerTransferido, int numeroDaConta, String transferencia) {

        Conta conta;
        conta = repository.findByID(numeroDaConta);
        boolean transferenciaRealizada = conta.retirarSaldo(valorASerTransferido);
        if(transferenciaRealizada) {
            System.out.printf("Transferência realizada! Seu saldo atual é de R$ %.2f)!%n", conta.getSaldo());
        }
        return valorASerTransferido;
        }
    }



