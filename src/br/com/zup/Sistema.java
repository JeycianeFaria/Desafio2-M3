package br.com.zup;

import java.util.Scanner;

public class Sistema {

    public static Scanner capturarDados(String mensagem){
        System.out.println(mensagem);

        return new Scanner(System.in);
    }

    public static Cliente cadastrarCliente(){
        String nome = capturarDados("Digite o nome do cliente: ").nextLine();
        String cpf = capturarDados("Digite o cpf do cliente: ").nextLine();
        String email = capturarDados("Digite o email do cliente: ").nextLine();
        String telefone = capturarDados("Digite o telefone do cliente: ").nextLine();

        return ServicoCliente.cadastrarCliente(nome,cpf,email,telefone);
    }

    public static Cliente buscarCliente() throws Exception{
        String cpfBusca = capturarDados("\nDigite o CPF do cliente que deseja buscar: ").nextLine();

        return ServicoCliente.buscarCliente(cpfBusca);
    }


    public static Vendedor cadastrarVendedor(){
        String nome = capturarDados("Digite o nome do vendedor: ").nextLine();
        String cpf = capturarDados("Digite o cpf do vendedor: ").nextLine();
        String email = capturarDados("Digite o email do vendedor: ").nextLine();
        double salario = capturarDados("Digite o salário do vendedor: ").nextDouble();

        return ServicoVendedor.cadastrarVendedor(nome,cpf,email,salario);
    }

    public static Vendedor buscarVendedor() throws Exception{
        String emailBusca = capturarDados("\nDigite o email do vendedor que deseja buscar: ").nextLine();

        return ServicoVendedor.buscarVendedor(emailBusca);
    }

}
