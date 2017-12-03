package core.arquivos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriterTeste {
    public static void main(String[] args) {

        //escrevendo no arquivo

        try {
            //criando o arquivo com File,append true adiciona linha
            FileWriter fw = new FileWriter(new File("texto.txt"),true);
            fw.write("Escrevendo no arquivo\n e pulando linha2");
            fw.flush();//cuspindo o texto inteiro
            fw.close();

            //lendo o arquivo, faz a leitura por caracteres
            FileReader fr = new FileReader(new File("texto.txt"));
            char[] in = new char[500];//para guardar os caracteres
            int size = fr.read(in);//retorna o numero de char lidos
            System.out.println("Tamanho " + size);
            for (char c : in) {
                System.out.print(c);
            }
            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
