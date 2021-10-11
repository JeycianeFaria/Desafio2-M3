package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoCliente {

    private static List<Cliente> clientes = new ArrayList<>();


    public static void validarEmail(String email) throws Exception{
        if (!email.contains("@")){
            throw new Exception("\nEmail digitado inválido.Cadastro não realizado!");
        }
    }


    public static void verificarCpfCliente(String cpf) throws Exception{
        for (Cliente referencia: clientes){
            if (referencia.getCpf().equals(cpf)){
                throw new Exception("\nCPF já cadastrado!");
            }
        }
    }


    public static void verificarEmailCliente(String email) throws Exception{
        for (Cliente referencia:clientes){
            if(referencia.getEmail().equalsIgnoreCase(email)){
                throw new Exception("\nEmail já cadastrado!");
            }
        }
    }


    public static Cliente cadastrarCliente(String nome, String cpf, String email, String telefone){

        Cliente cliente = new Cliente(nome,cpf,email,telefone);
        clientes.add(cliente);

        return cliente;
    }


    public static List<Cliente> exibirClientesCadastrados(){

        if (clientes.size() != 0){
            for (Cliente referencia:clientes){
                System.out.println(referencia);
            }
        }else {
            System.out.println("\nNão exitem clientes cadastrado!");
        }

        return clientes;
    }


    public static Cliente buscarCliente(String cpfBusca) throws Exception{

        for (Cliente referencia:clientes){
            if(referencia.getCpf().equals(cpfBusca)){
                return referencia;
            }
        }

        throw new Exception("\nCliente não encontrado!");
    }

}
