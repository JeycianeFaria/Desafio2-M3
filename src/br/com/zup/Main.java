package br.com.zup;

import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        try {
            Sistema.cadastrarCliente();
            Sistema.cadastrarCliente();
            ServicoCliente.exibirClientesCadastrados();
            System.out.println(Sistema.buscarCliente());
        }catch (Exception erro){
            System.out.println(erro.getMessage());
        }


    }
}
