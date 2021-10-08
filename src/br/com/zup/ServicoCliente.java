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

    public static List<Cliente> exibirClientesCadastrados(){
        for (Cliente referencia:clientes){
            System.out.println(referencia);
        }

        return clientes;
    }

    public static Cliente buscarCliente(String cpfBusca) throws Exception{
        for (Cliente referencia:clientes){
            if(referencia.getCpf().equals(cpfBusca)){
                return referencia;
            }
        }

        throw new Exception("Cliente não encontrado!");
    }

}
