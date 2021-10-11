package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedor {

    private static List<Vendedor> vendedores = new ArrayList<>();


    public static void verificarCpfVendedor(String cpf) throws Exception{
        for (Vendedor referencia:vendedores){
            if (referencia.getCpf().equals(cpf)){
                throw new Exception("\nCPF já cadastrado!");
            }
        }
    }


    public static void verificarEmailVendedor(String email) throws Exception{
        for (Vendedor referencia:vendedores){
            if(referencia.getEmail().equalsIgnoreCase(email)){
                throw new Exception("\nEmail já cadastrado!");
            }
        }
    }


    public static Vendedor cadastrarVendedor(String nome, String cpf, String email, double salario){

        Vendedor vendedor = new Vendedor(nome,cpf,email,salario);
        vendedores.add(vendedor);

        return vendedor;
    }


    public static List<Vendedor> exibirVendedoresCadastrados(){

        if (vendedores.size() != 0){
            for (Vendedor referencia:vendedores){
                System.out.println(referencia);
            }
        }else {
            System.out.println("\nNão exitem vendedores cadastrado!");
        }


        return vendedores;
    }


    public static Vendedor buscarVendedor(String emailBusca) throws Exception{
        for (Vendedor referencia:vendedores){
            if(referencia.getEmail().equalsIgnoreCase(emailBusca)){
                return referencia;
            }
        }

        throw new Exception("\nVendedor não encontrado!");
    }

}
