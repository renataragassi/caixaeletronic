package br.com.ragassi.caixaeletronic.service;

import java.util.Scanner;

public class ObtemComandoImpl implements ObtemComando {

    @Override
    public int execute(){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite sua opção:");
        System.out.println();
        int comando = entrada.nextInt();
        return comando;
    }
}
