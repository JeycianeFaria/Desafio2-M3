package br.com.zup;

import java.util.List;
import java.util.Scanner;

public class Sistema {

    public static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);

        return new Scanner(System.in);
    }

    public static void menuPrincipal() {
        System.out.println("======Bem Vindo=====");
        System.out.println("Digite 1 - para cadastrar um cliente.");
        System.out.println("Digite 2 - para cadastrar um vendedor.");
        System.out.println("Digite 3 - para registrar uma venda.");
        System.out.println("Digite 4 - para exibir cadastros já realizados.");
        System.out.println("Digite 5 - para sair.");
    }

    public static void menuExibirCadastros() {
        System.out.println("Digite 1 - para exibir clientes cadastrados.");
        System.out.println("Digite 2 - para exibir vendedores cadastrados.");
        System.out.println("Digite 3 - para exibir vendas registradas.");
        System.out.println("Digite 4 - para voltar ao menu anterior.");
    }

    public static Cliente cadastrarCliente() throws Exception{
        String nome = capturarDados("Digite o nome do cliente: ").nextLine();
        String cpf = capturarDados("Digite o cpf do cliente: ").nextLine();
        ServicoCliente.verificarCpfCliente(cpf);
        String email = capturarDados("Digite o email do cliente: ").nextLine();
        ServicoCliente.validarEmail(email);
        ServicoCliente.verificarEmailCliente(email);
        String telefone = capturarDados("Digite o telefone do cliente: ").nextLine();

        return ServicoCliente.cadastrarCliente(nome, cpf, email, telefone);
    }

    public static Cliente buscarCliente() throws Exception {
        String cpfBusca = capturarDados("\nDigite o CPF do cliente que deseja buscar: ").nextLine();

        return ServicoCliente.buscarCliente(cpfBusca);
    }


    public static Vendedor cadastrarVendedor() throws Exception {
        String nome = capturarDados("Digite o nome do vendedor: ").nextLine();
        String cpf = capturarDados("Digite o cpf do vendedor: ").nextLine();
        ServicoVendedor.verificarCpfVendedor(cpf);
        String email = capturarDados("Digite o email do vendedor: ").nextLine();
        ServicoCliente.validarEmail(email);
        ServicoVendedor.verificarEmailVendedor(email);
        double salario = capturarDados("Digite o salário do vendedor: ").nextDouble();

        return ServicoVendedor.cadastrarVendedor(nome, cpf, email, salario);
    }

    public static Vendedor buscarVendedor() throws Exception {
        String emailBusca = capturarDados("\nDigite o email do vendedor que deseja buscar: ").nextLine();

        return ServicoVendedor.buscarVendedor(emailBusca);
    }

    public static Venda registrarVenda() throws Exception {
        Cliente cliente = Sistema.buscarCliente();
        Vendedor vendedor = Sistema.buscarVendedor();
        double valorASerPago = capturarDados("Digite o valor a ser pago: ").nextDouble();
        String dataRegistro = capturarDados("Digite a data do registro da venda: ").nextLine();

        return ServicoVenda.registrarVenda(cliente, vendedor, valorASerPago, dataRegistro);
    }

    public static List<Venda> comprasPorCliente() throws Exception{
        String cpf = capturarDados("Digite o cpf do cliente que deseja verificar as compras: ").nextLine();
        Cliente cliente = ServicoCliente.buscarCliente(cpf);
        return ServicoVenda.comprasPorCliente(cliente);
    }

    public static boolean executar() throws Exception {

        boolean executarMenu = true;

        while (executarMenu) {

            menuPrincipal();
            int opcaoSelecionada = capturarDados("Digite a opção desejada: ").nextInt();

            if (opcaoSelecionada == 1) {
                cadastrarCliente();
                System.out.println("\nCliente cadastrado com sucesso!\n");

            } else if (opcaoSelecionada == 2) {
                cadastrarVendedor();
                System.out.println("\nVendedor cadastrado com sucesso!\n");

            } else if (opcaoSelecionada == 3) {
                registrarVenda();
                System.out.println("\nVenda registrada com sucesso!\n");

            } else if (opcaoSelecionada == 4) {

                boolean exibirSubMenu = true;

                while (exibirSubMenu) {

                    menuExibirCadastros();
                    opcaoSelecionada = capturarDados("Digite a opção desejada: ").nextInt();

                    if (opcaoSelecionada == 1) {
                        ServicoCliente.exibirClientesCadastrados();

                    } else if (opcaoSelecionada == 2) {
                        ServicoVendedor.exibirVendedoresCadastrados();

                    } else if (opcaoSelecionada == 3) {
                        ServicoVenda.exibirVendasRegistradas();

                    } else if (opcaoSelecionada == 4) {
                        Sistema.comprasPorCliente();

                    } else if (opcaoSelecionada == 5){
                        exibirSubMenu = false;
                    } else {
                        System.out.println("\nOpção selecionada inválida, digite novamente!\n");

                    }
                }

            } else if (opcaoSelecionada == 5) {
                executarMenu = false;
                System.out.println("\nAté a proxima!\n");

            } else {
                System.out.println("\nOpção selecionada inválida, digite novamente!\n");

            }

        }

        return executarMenu;
    }
}
