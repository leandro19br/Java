package br.com.santiago.introducao;

public class Array3 {
    public static void main(String[] args) {
        //formas de inicializar os Arrays
        int [] numeros = new int[3];
        int [] numeros2 = {1,2,3,4,5};//inicializando o Array já com valores
        int [] numeros3 = new int[]{1,2,3,4};//criando já inicializando os valores

        //foreach variável local aux vai representar cada posição do Array. Sintaxe mais simples

        for (int aux: numeros2 ) {
            System.out.println(aux);
        }
    }
}
