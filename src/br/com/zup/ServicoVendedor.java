package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedor {

    private static List<Vendedor> vendedores = new ArrayList<>();

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

}
