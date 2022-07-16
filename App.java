public class App {

    public static void main(String[] args) {
        System.out.println("Caixa Eletrônico Ligar");
        SelecionaComando selecionaComando = new SelecionaComando();

        while (selecionaComando.executar()) {
            System.out.println("Executando um novo Comando" !);
        }


        System.out.println("Caixa Eletrônico Desligando");

    }
}
}
