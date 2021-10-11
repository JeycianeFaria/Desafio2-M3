package br.com.zup;

import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {

        boolean executarSistema = true;

        while (executarSistema){

            try {
                executarSistema = Sistema.executar();
            }catch (Exception erro){
                System.out.println(erro.getMessage());
            }

        }

    }

}
