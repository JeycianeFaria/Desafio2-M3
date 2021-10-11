package br.com.zup;

import static br.com.zup.Sistema.capturarDados;

public class SistemaVendas {

    public static void menuVendas(){
        System.out.println("\n================MENU VENDAS==================");
        System.out.println("Digite 1 - para registar uma venda.");
        System.out.println("Digite 2 - para exibir vendas registradas.");
        System.out.println("Digite 3 - para exibir todas as compras por cliente.");
        System.out.println("Digite 4 - para exibir todas as vendas de um vendedor.");
        System.out.println("Digite 5 - para voltar ao menu principal.");
    }


    public static Venda registrarVenda() throws Exception {
        Cliente cliente = SistemaCliente.buscarCliente();
        Vendedor vendedor = SistemaVendedor.buscarVendedor();
        double valorASerPago = capturarDados("Digite o valor a ser pago: ").nextDouble();
        String dataRegistro = capturarDados("Digite a data do registro da venda: ").nextLine();

        return ServicoVenda.registrarVenda(cliente, vendedor, valorASerPago, dataRegistro);
    }

}
