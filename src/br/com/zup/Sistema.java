package br.com.zup;

import java.util.List;
import java.util.Scanner;

public class Sistema {

    public static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menuPrincipal() {
        System.out.println("\n==================BEM VINDO==================");
        System.out.println("Digite 1 - para cadastrar um cliente.");
        System.out.println("Digite 2 - para cadastrar um vendedor.");
        System.out.println("Digite 3 - para registrar uma venda.");
        System.out.println("Digite 4 - para exibir registros da organização.");
        System.out.println("Digite 5 - para sair.");
    }


    public static void menuExibirRegistros() {
        System.out.println("\n===========Resgistros=da=Organização===========");
        System.out.println("Digite 1 - para exibir clientes cadastrados.");
        System.out.println("Digite 2 - para exibir vendedores cadastrados.");
        System.out.println("Digite 3 - para exibir todas vendas registradas.");
        System.out.println("Digite 4 - para exibir compras por cliente.");
        System.out.println("Digite 5 - para exibir vendas por vendedor.");
        System.out.println("Digite 6 - para voltar ao menu anterior.");
    }


    public static boolean executar() throws Exception {

        boolean executarMenu = true;

        while (executarMenu) {

            menuPrincipal();
            int opcaoSelecionada = capturarDados("\nDigite o número da opção que deseja selecionar: ").nextInt();

            if (opcaoSelecionada == 1) {
                SistemaCliente.executarCliente();

            } else if (opcaoSelecionada == 2) {
                SistemaVendedor.executarVendedor();

            } else if (opcaoSelecionada == 3) {
                SistemaVendas.registrarVenda();
                System.out.println("\nVenda registrada com sucesso!");

            } else if (opcaoSelecionada == 4) {

                boolean exibirSubMenu = true;

                while (exibirSubMenu) {

                    menuExibirRegistros();
                    opcaoSelecionada = capturarDados("\nDigite o número da opção que deseja selecionar: ").nextInt();

                    if (opcaoSelecionada == 1) {
                        ServicoCliente.exibirClientesCadastrados();

                    } else if (opcaoSelecionada == 2) {
                        ServicoVendedor.exibirVendedoresCadastrados();

                    } else if (opcaoSelecionada == 3) {
                        ServicoVenda.exibirVendasRegistradas();

                    } else if (opcaoSelecionada == 4) {
                        SistemaCliente.comprasPorCliente();

                    } else if (opcaoSelecionada == 5) {
                        SistemaVendedor.vendasPorVendedor();
                    } else if (opcaoSelecionada == 6) {
                        exibirSubMenu = false;
                    } else {
                        System.out.println("\nOpção selecionada inválida, digite novamente!");

                    }

                }

            } else if (opcaoSelecionada == 5) {
                executarMenu = false;
                System.out.println("\nAté a proxima!\n");

            } else {
                System.out.println("\nOpção selecionada inválida, digite novamente!");

            }

        }

        return executarMenu;
    }

}
