package br.com.zup;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Joao","142536","joao@joao", "9999999");
        Vendedor vendedor = new Vendedor("Pedro", "968574", "pedro@pedro", 1500);
        Venda venda = new Venda(cliente,vendedor,150,"08/10");

        System.out.println(venda);

    }
}
