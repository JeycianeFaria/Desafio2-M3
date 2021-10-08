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

}
