package br.com.santiago.introducao;

public class Array2 {
    public static void main(String[] args) {

        String[] nomes = new String[3];

        nomes[0] = "Leandro";
        nomes[1] = "Gustavo";
        nomes[2] = "Miguel";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i+1) + " nome " + nomes[i]);
        }
        //criando uma nova referência sem valores
        nomes = new String[4];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }


}



