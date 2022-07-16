package br.com.ragassi.caixaeletronic.service;

import br.com.ragassi.caixaeletronic.repository.MemoriaContaRepository;

import java.util.Scanner;

    public class ExecutarComandoEspecificoImpl implements ExecutarComandoEspecifico {

        private final Deposito deposito;
        private final AbrirConta abrirConta;
        private final Saque saque;


        public ExecutarComandoEspecificoImpl() {
            MemoriaContaRepository repository = new MemoriaContaRepository ();
            this.deposito = new DepositoImpl(repository);
            this.saque = new SaqueImpl(repository);
            this.abrirConta = new AbrirContaImpl(repository);
        }

        @Override
        public boolean execute(int comando) {
            boolean resultado = true;
            Scanner entrada = new Scanner(System.in);

            if (comando == 0) {
                System.out.println("Encerrando o serviço");
                resultado = false;

            } else if (comando ==1) {
                System.out.println("Digite o número da conta: ");
                int numeroDaConta = entrada.nextInt();

                System.out.println("Digite o valor de saque: ");
                double valorSacado = entrada.nextInt();

                this.saque.execute(valorSacado, numeroDaConta);

            } else if (comando == 2) {
                System.out.println("Digite o número da conta: ");
                int numeroDaConta = entrada.nextInt();

                System.out.println("Digite o valor para depósito: ");
                double valorDepositado = entrada.nextInt();

                this.deposito.execute(valorDepositado, numeroDaConta);

            } else if (comando == 3) {
                this.abrirConta.execute();

            } else {
                System.out.println("Comando inválido!");
            }
            return resultado;
        }
    }


