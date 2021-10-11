package br.com.zup;

import static br.com.zup.Sistema.capturarDados;

public class SistemaVendas {

    public static Venda registrarVenda() throws Exception {
        Cliente cliente = SistemaCliente.buscarCliente();
        Vendedor vendedor = SistemaVendedor.buscarVendedor();
        double valorASerPago = capturarDados("Digite o valor a ser pago: ").nextDouble();
        String dataRegistro = capturarDados("Digite a data do registro da venda: ").nextLine();

        return ServicoVenda.registrarVenda(cliente, vendedor, valorASerPago, dataRegistro);
    }

}
