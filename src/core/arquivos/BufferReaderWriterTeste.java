package core.arquivos;

import java.io.*;

public class BufferReaderWriterTeste {
    public static void main(String[] args) {

        try {
            //criando o arquivo com File,append true adiciona linha
            FileWriter fw = new FileWriter(new File("texto.txt"),true);
            BufferedWriter bf = new BufferedWriter(fw);//BufferWriter
            bf.write("Escrevendo no arquivo ");
            bf.newLine();//criando uma nova linha
            bf.write("e pulando linha2");
            bf.flush();//cuspindo o texto inteiro
            bf.close();

            //lendo o arquivo, faz a leitura por caracteres
            FileReader fr = new FileReader(new File("texto.txt"));
            BufferedReader br = new BufferedReader(fr);
            //br.readLine();//método para ler a linha inteira
            String s = null;
            //enquanto não for nulo
            while ((s=br.readLine()) != null){
                System.out.println(s);
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
