package br.com.ragassi.caixaeletronic;

import br.com.ragassi.caixaeletronic.model.Conta;
import br.com.ragassi.caixaeletronic.repository.MemoriaContaRepository;
import br.com.ragassi.caixaeletronic.service.Transferencia;

public class TransferenciaImpl implements Transferencia {

    private final MemoriaContaRepository repository;

    public TransferenciaImpl(MemoriaContaRepository repository) {
        this.repository = repository;

    }


        @Override
        public double execute(double valorASerTransferido, int numeroDaConta, String Transferencia) {
            Conta conta;
            conta = repository.findByID(numeroDaConta);
            boolean transferenciaRealizada = conta.retirarSaldo(valorASerTransferido);
            if (transferenciaRealizada) {
                System.out.printf("Transferencia realizada! Seu saldo atual é de R$ %.2f !%n", conta.getSaldo());
            }
            return valorASerTransferido;

        }

    }

}
