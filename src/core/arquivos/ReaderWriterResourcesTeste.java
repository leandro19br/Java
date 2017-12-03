package core.arquivos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriterResourcesTeste {
    public static void main(String[] args) {
        //com try/catch whit Resources não precisa utilizzar o close

        try (FileWriter fw = new FileWriter(new File("textoResources.txt"), true);
             FileReader fr = new FileReader(new File("textoResources.txt"))) {
            fw.write("Escrevendo no arquivo\n e pulando linha2");
            fw.flush();//cuspindo o texto inteiro

            //lendo o arquivo, faz a leitura por caracteres

            char[] in = new char[500];//para guardar os caracteres
            int size = fr.read(in);//retorna o numero de char lidos
            System.out.println("Tamanho " + size);
            for (char c : in) {
                System.out.print(c);
            }

        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
