package br.com.zup;

public class Vendedor extends Pessoa {

    private double salario;


    public Vendedor() {
    }

    public Vendedor(String nome, String cpf, String email, double salario) {
        super(nome, cpf, email);
        this.salario = salario;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    @Override
    public String toString() {
        StringBuilder exibir = new StringBuilder();
        exibir.append("\n=======Vendedor======");
        exibir.append(super.toString());
        exibir.append("\nSalário: R$" + salario);
        return exibir.toString();
    }

}
