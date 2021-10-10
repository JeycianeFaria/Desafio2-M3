package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {

    private  static List<Venda> registroVendas = new ArrayList<>();

    public static Venda registrarVenda(Cliente cliente,Vendedor vendedor, double valorASerPago, String dataRegistro){
        Venda venda = new Venda(cliente,vendedor,valorASerPago,dataRegistro);
        registroVendas.add(venda);

        return venda;
    }

    public static List<Venda> exibirVendasRegistradas(){
        for (Venda referencia:registroVendas){
            System.out.println(referencia);
        }

        return registroVendas;
    }

    public static List<Venda> comprasPorCliente(Cliente cliente){
        List<Venda> comprasCliente = new ArrayList<>();

        for (Venda referencia:registroVendas){
            if (referencia.getCliente().equals(cliente)){
                comprasCliente.add(referencia);
                System.out.println(referencia);
            }
        }

        return comprasCliente;
    }

    public static List<Venda> vendasPorVendedor(Vendedor vendedor){
        List<Venda> vendasVendedor = new ArrayList<>();

        for (Venda referencia:registroVendas){
            if (referencia.getVendedorResponsavel().equals(vendedor)){
                vendasVendedor.add(referencia);
                System.out.println(referencia);
            }
        }

        return vendasVendedor;
    }

}
