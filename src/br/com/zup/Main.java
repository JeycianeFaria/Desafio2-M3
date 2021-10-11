package br.com.zup;

public class Main {

    public static void main(String[] args) {

        boolean executarSistema = true;

        while (executarSistema) {

            try {
                executarSistema = Sistema.executar();
            } catch (Exception erro) {
                System.out.println(erro.getMessage());
            }

        }

    }

}
