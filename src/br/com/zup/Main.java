package br.com.zup;

import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        try {
            Sistema.cadastrarVendedor();
            Sistema.cadastrarVendedor();
            ServicoVendedor.exibirVendedoresCadastrados();
            System.out.println(Sistema.buscarVendedor());
        }catch (Exception erro){
            System.out.println(erro.getMessage());
        }


    }
}
