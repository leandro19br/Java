package core.excecoes.tratamentoExecoesChecked;


import java.io.*;

public class TesteTryWithResource {

    public static void main(String[] args) {

        lerArquivo();
    }

    public static void lerArquivo(){

        //ler arquivo

        //para fazer desta forma a classe tem que implementar AutoCloseable

        //try( Reader reader = new BufferedReader(new FileReader("teste.txt"))) {

        try(Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()){

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
