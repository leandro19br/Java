package core.excecoes.tratamentoExecoesChecked;

import java.io.File;
import java.io.IOException;

public class TesteLancamentoExecaoChecked2 {
    public static void main(String[] args) {

        try {
            criarArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void criarArquivo() throws IOException{
        //utilizando a classe file do java para criação de arquivo

        File file = new File("Teste.txt");

        //vai dar um erro e compilação esperando um tratamento por ser do tipo Checked
        //voce pode fazer um tratamento para que ele tente fazer senão siga outro caminho Try/catch
        try {
            System.out.println("Arquivo Criado? " + file.createNewFile());//metodo retorna um boolean
            System.out.println("Arquivo Criado");
        } catch (IOException e) {
            e.printStackTrace();
            //posso trar a exception mas também lançcar ela novamente utilizando throw
            throw e;

        }
    }

}
