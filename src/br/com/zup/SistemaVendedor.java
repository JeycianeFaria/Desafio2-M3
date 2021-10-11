package br.com.zup;

import java.util.List;

public class SistemaVendedor {

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

}
