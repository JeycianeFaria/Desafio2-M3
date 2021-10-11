package br.com.zup;

import java.util.List;

public class SistemaCliente {

    public static Cliente cadastrarCliente() throws Exception{
        String nome = Sistema.capturarDados("Digite o nome do cliente: ").nextLine();
        String cpf = Sistema.capturarDados("Digite o cpf do cliente: ").nextLine();
        ServicoCliente.verificarCpfCliente(cpf);
        String email = Sistema.capturarDados("Digite o email do cliente: ").nextLine();
        ServicoCliente.validarEmail(email);
        ServicoCliente.verificarEmailCliente(email);
        String telefone = Sistema.capturarDados("Digite o telefone do cliente: ").nextLine();

        return ServicoCliente.cadastrarCliente(nome, cpf, email, telefone);
    }


    public static Cliente buscarCliente() throws Exception {
        String cpfBusca = Sistema.capturarDados("Digite o CPF do cliente que deseja buscar: ").nextLine();
        return ServicoCliente.buscarCliente(cpfBusca);
    }


    public static List<Venda> comprasPorCliente() throws Exception{
        String cpf = Sistema.capturarDados("Digite o cpf do cliente que deseja verificar as compras: ").nextLine();
        Cliente cliente = ServicoCliente.buscarCliente(cpf);

        return ServicoVenda.comprasPorCliente(cliente);
    }

}
