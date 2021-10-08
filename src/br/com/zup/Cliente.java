package br.com.zup;

public class Cliente extends Pessoa {

    private String telefone;


    public Cliente() {
    }

    public Cliente(String nome, String cpf, String email, String telefone) {
        super(nome, cpf, email);
        this.telefone = telefone;
    }


    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    @Override
    public String toString() {
        StringBuilder exibir = new StringBuilder();
        exibir.append("=======Cliente=======");
        exibir.append(super.toString());
        exibir.append("\nTelefone: " + telefone);
        exibir.append("\n=====================");
        return exibir.toString();
    }

}
