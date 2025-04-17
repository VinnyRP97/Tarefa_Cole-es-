package br.com.vinicus.Colecoes;

import java.util.*;

public class OrdenarNomes {

        public static void main(String[] args) {
           listaDeNomesSeparadosPorVirgula();
           listadeNomesSeparadosPorSexo();
    }

    private static void listadeNomesSeparadosPorSexo() {
        System.out.println("**** listadeNomesSeparadosPorSexo ****");

        String nomes = "Vinicius - M, Dayane - F, Felipe - M, Lilian - F, Lucio - M, Kessila - F";
        System.out.println(nomes);
        System.out.println(" ");
        String[] pessoas = nomes.split(",");

        // Listas para armazenar por sexo
        List<String> masculinos = new ArrayList<>();
        List<String> femininos = new ArrayList<>();


        for (String pessoa : pessoas) {
            // Remove espaços extras
            pessoa = pessoa.trim();

            // Divide nome e sexo
            String[] partes = pessoa.split("-");

            if (partes.length == 2) {
                String nome = partes[0].trim();
                String sexo = partes[1].trim().toUpperCase();

                if (sexo.equals("M")) {
                    masculinos.add(nome);
                } else if (sexo.equals("F")) {
                    femininos.add(nome);
                }
            }
        }

        // Imprime os grupos
        System.out.println("Masculinos:");
        for (String nome : masculinos) {
            System.out.println(nome);
        }

        System.out.println("\nFemininos:");
        for (String nome : femininos) {
            System.out.println(nome);
         }
        }


    private static void listaDeNomesSeparadosPorVirgula() {

        String entrada = "Vinicius, Abner, Lilian, Lucio, Dayanne, Felipe, Kessila";


        String[] nomesArray = entrada.split(",");
        List<String> nomes = new ArrayList<>();

        for (String nome : nomesArray) {
            nomes.add(nome.trim());
        }

        Collections.sort(nomes);

        System.out.println("Lista de Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println(" ");
    }

}




