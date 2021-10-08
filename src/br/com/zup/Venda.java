package br.com.zup;

public class Venda {

    private Cliente cliente;
    private Vendedor vendedorResponsavel;
    private double valorASerPago;
    private String dataDeRegistro;


    public Venda() {
    }

    public Venda(Cliente cliente, Vendedor vendedorResponsavel, double valorASerPago, String dataDeRegistro) {
        this.cliente = cliente;
        this.vendedorResponsavel = vendedorResponsavel;
        this.valorASerPago = valorASerPago;
        this.dataDeRegistro = dataDeRegistro;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedorResponsavel() {
        return vendedorResponsavel;
    }

    public void setVendedorResponsavel(Vendedor vendedorResponsavel) {
        this.vendedorResponsavel = vendedorResponsavel;
    }

    public double getValorASerPago() {
        return valorASerPago;
    }

    public void setValorASerPago(double valorASerPago) {
        this.valorASerPago = valorASerPago;
    }

    public String getDataDeRegistro() {
        return dataDeRegistro;
    }

    public void setDataDeRegistro(String dataDeRegistro) {
        this.dataDeRegistro = dataDeRegistro;
    }


    @Override
    public String toString() {
        StringBuilder exibir = new StringBuilder();
        exibir.append("========Venda========\n");
        exibir.append(getCliente() + "\n");
        exibir.append(getVendedorResponsavel());
        exibir.append("\n====Dados=da=Venda===");
        exibir.append("\nValor: R$" + valorASerPago);
        exibir.append("\nData registro: " + dataDeRegistro);
        exibir.append("\n=====================");
        return exibir.toString();
    }
}
