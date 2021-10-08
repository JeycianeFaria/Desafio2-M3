package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedor {

    private static List<Vendedor> vendedores = new ArrayList<>();

    public static void verificarCpfVendedor(String cpf) throws Exception{
        for (Vendedor referencia:vendedores){
            if (referencia.getCpf().equals(cpf)){
                throw new Exception("CPF já cadastrado!");
            }
        }
    }


    public static Vendedor cadastrarVendedor(String nome, String cpf, String email, double salario){

        Vendedor vendedor = new Vendedor(nome,cpf,email,salario);
        vendedores.add(vendedor);

        return vendedor;
    }

    public static List<Vendedor> exibirVendedoresCadastrados(){
        for (Vendedor referencia:vendedores){
            System.out.println(referencia);
        }

        return vendedores;
    }

    public static Vendedor buscarVendedor(String emailBusca) throws Exception{
        for (Vendedor referencia:vendedores){
            if(referencia.getEmail().equals(emailBusca)){
                return referencia;
            }
        }

        throw new Exception("\nVendedor não encontrado!");
    }

}
