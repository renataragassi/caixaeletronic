package br.com.ragassi.caixaeletronic.service;

public class ListarComandosImpl implements ListarComandos {


    @Override
    public void execute() {
        System.out.println("Digite o comando desejado, conforme opções abaixo: ");
        System.out.println(" Opção 0 para Encerrar" );
        System.out.println(" Opção 1 para Saque" );
        System.out.println(" Opção 2 para Depósito ");
        System.out.println(" Opção 3 para Abertura de Conta ");
        System.out.println(" Opção 4 para Transferência ");
    }
    }
