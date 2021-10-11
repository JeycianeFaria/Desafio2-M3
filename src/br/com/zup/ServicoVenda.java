package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {

    private static List<Venda> registroVendas = new ArrayList<>();


    public static Venda registrarVenda(Cliente cliente, Vendedor vendedor, double valorASerPago, String dataRegistro) {

        Venda venda = new Venda(cliente, vendedor, valorASerPago, dataRegistro);
        registroVendas.add(venda);

        return venda;
    }


    public static List<Venda> exibirVendasRegistradas() throws Exception {

        if (registroVendas.size() != 0) {
            for (Venda referencia : registroVendas) {
                System.out.println(referencia);
            }
        } else {
            throw  new Exception("\nNão exitem vendas registradas!");
        }

        return registroVendas;
    }


    public static List<Venda> comprasPorCliente(Cliente cliente) throws Exception {

        List<Venda> comprasCliente = new ArrayList<>();

        for (Venda referencia : registroVendas) {
            if (referencia.getCliente().equals(cliente)) {
                comprasCliente.add(referencia);
            }
        }

        if (comprasCliente.size() != 0) {
            System.out.println(comprasCliente);
        } else {
            throw new Exception("\nNão exitem compras registrada para este cliente!");
        }


        return comprasCliente;
    }


    public static List<Venda> vendasPorVendedor(Vendedor vendedor) throws Exception {

        List<Venda> vendasVendedor = new ArrayList<>();

        for (Venda referencia : registroVendas) {
            if (referencia.getVendedorResponsavel().equals(vendedor)) {
                vendasVendedor.add(referencia);
            }
        }

        if (vendasVendedor.size() != 0) {
            System.out.println(vendasVendedor);
        } else {
            throw new Exception("\nNão exitem vendas registrada para este vendedor!");
        }

        return vendasVendedor;
    }

}
