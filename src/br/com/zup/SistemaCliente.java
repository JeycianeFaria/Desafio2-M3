package br.com.zup;

import java.util.List;

import static br.com.zup.Sistema.capturarDados;

public class SistemaCliente {

    public static void menuCliente(){
        System.out.println("\n================MENU CLIENTE=================");
        System.out.println("Digite 1 - para cadastrar um cliente.");
        System.out.println("Digite 2 - para exibir clientes cadastrados.");
        System.out.println("Digite 3 - para exibir todas as compras por cliente.");
        System.out.println("Digite 5 - para voltar ao menu principal.");
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
        String cpfBusca = capturarDados("Digite o CPF do cliente que deseja buscar: ").nextLine();
        return ServicoCliente.buscarCliente(cpfBusca);
    }


    public static List<Venda> comprasPorCliente() throws Exception{
        String cpf = capturarDados("Digite o cpf do cliente que deseja verificar as compras: ").nextLine();
        Cliente cliente = ServicoCliente.buscarCliente(cpf);

        return ServicoVenda.comprasPorCliente(cliente);
    }

}