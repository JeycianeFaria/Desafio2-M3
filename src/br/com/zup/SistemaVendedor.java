package br.com.zup;

import java.util.List;

import static br.com.zup.Sistema.capturarDados;

public class SistemaVendedor {

    public static void menuVendedor(){
        System.out.println("\n================MENU VENDEDOR================");
        System.out.println("Digite 1 - para cadastrar um vendedor.");
        System.out.println("Digite 2 - para exibir vendedores cadastrados.");
        System.out.println("Digite 3 - para exibir todas as vendas de um vendedor.");
        System.out.println("Digite 4 - para voltar ao menu principal.");
    }


    public static Vendedor cadastrarVendedor() throws Exception {
        String nome = Sistema.capturarDados("Digite o nome do vendedor: ").nextLine();
        String cpf = Sistema.capturarDados("Digite o cpf do vendedor: ").nextLine();
        ServicoVendedor.verificarCpfVendedor(cpf);
        String email = Sistema.capturarDados("Digite o email do vendedor: ").nextLine();
        ServicoCliente.validarEmail(email);
        ServicoVendedor.verificarEmailVendedor(email);
        double salario = Sistema.capturarDados("Digite o salário do vendedor: ").nextDouble();

        return ServicoVendedor.cadastrarVendedor(nome, cpf, email, salario);
    }

    public static Vendedor buscarVendedor() throws Exception {
        String emailBusca = Sistema.capturarDados("Digite o email do vendedor que deseja buscar: ").nextLine();
        ServicoCliente.validarEmail(emailBusca);
        return ServicoVendedor.buscarVendedor(emailBusca);
    }

    public static List<Venda> vendasPorVendedor() throws Exception{
        String email = Sistema.capturarDados("Digite o email do vendedor que deseja verificar as vendas: ").nextLine();
        Vendedor vendedor = ServicoVendedor.buscarVendedor(email);

        return ServicoVenda.vendasPorVendedor(vendedor);
    }

    public static void executarVendedor() throws Exception {

        boolean executarMenuVendedor = true;

        while (executarMenuVendedor) {

            menuVendedor();
            int opcaoSelecionada = capturarDados("\nDigite o número da opção que deseja selecionar: ").nextInt();

            if (opcaoSelecionada == 1){
                cadastrarVendedor();
                System.out.println("\nVendedor cadastrado com sucesso!");

            }else if (opcaoSelecionada == 2){
                ServicoVendedor.exibirVendedoresCadastrados();

            }else if (opcaoSelecionada == 3){
                SistemaVendedor.vendasPorVendedor();

            }else if (opcaoSelecionada == 4){
                executarMenuVendedor = false;

            }else{
                System.out.println("\nOpção selecionada inválida, digite novamente!");
            }

        }

    }

}
