package br.com.ragassi.caixaeletronic.service;

import br.com.ragassi.caixaeletronic.model.Conta;
import br.com.ragassi.caixaeletronic.repository.MemoriaContaRepository;


public class AbrirContaImpl implements AbrirConta {

        private final MemoriaContaRepository repository;
        public AbrirContaImpl(MemoriaContaRepository repository){

            this.repository = repository;
        }

        @Override
        public Conta execute() {
            Conta conta;
            conta = new Conta();
            repository.adiciona(conta);
            System.out.printf("Sua conta %d possui saldo atual de R$ %.2f. %n", conta.getNumeroDaConta(),conta.getSaldo());
            return conta;
        }

    }

