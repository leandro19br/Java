package core.excecoes.tratamentoExecoesChecked;

import java.io.File;
import java.io.IOException;

public class TesteLancamentoExecaoChecked {
    public static void main(String[] args) {
        //método main está fazendo o tratamento da exceção
        try{
            criarArquivo();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    //lançando exeção para ser tratada por quem chamar o método
public static void criarArquivo() throws IOException{

    File file = new File("Teste2.txt");

        System.out.println("Arquivo Criado? " + file.createNewFile());//metodo retorna um boolean
        System.out.println("Arquivo Criado");

}
}
