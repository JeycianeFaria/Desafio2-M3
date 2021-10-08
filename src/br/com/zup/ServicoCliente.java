package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoCliente {

    private static List<Cliente> clientes = new ArrayList<>();

    public static Cliente cadastrarCliente(String nome, String cpf, String email, String telefone){

        Cliente cliente = new Cliente(nome,cpf,email,telefone);
        clientes.add(cliente);

        return cliente;
    }

}
