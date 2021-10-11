package br.com.zup;

import java.util.List;
import java.util.Scanner;

import static br.com.zup.SistemaCliente.executarCliente;
import static br.com.zup.SistemaVendas.executarVendas;
import static br.com.zup.SistemaVendedor.executarVendedor;

public class Sistema {

    public static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menuPrincipal() {
        System.out.println("\n==================BEM VINDO==================");
        System.out.println("Digite 1 - para gerenciar um cliente.");
        System.out.println("Digite 2 - para gerenciar um vendedor.");
        System.out.println("Digite 3 - para gerenciar vendas.");
        System.out.println("Digite 4 - para sair.");
    }


    public static boolean executar() throws Exception {

        boolean executarMenu = true;

        while (executarMenu) {

            menuPrincipal();
            int opcaoSelecionada = capturarDados("\nDigite o número da opção que deseja selecionar: ").nextInt();

            if (opcaoSelecionada == 1) {
                executarCliente();

            } else if (opcaoSelecionada == 2) {
                executarVendedor();

            } else if (opcaoSelecionada == 3) {
                executarVendas();

            } else if (opcaoSelecionada == 4) {
                executarMenu = false;
                System.out.println("\nAté a proxima!\n");
            } else {
                System.out.println("\nOpção selecionada inválida, digite novamente!");

            }

        }

        return executarMenu;
    }

}
