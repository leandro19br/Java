package core.arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Classes para para arquivos
 * File
 * FileReader
 * BufferReader
 * FileWriter
 * BufferWriter
 */

public class FileTeste {
    public static void main(String[] args) {
        File file = new File("arq.txt");//ou colocar o caminho do diretório
        try {
            boolean criado = file.createNewFile();//cria o arquivo
            boolean existe = file.exists();
            System.out.println("Permissão de Leitura? " + file.canRead());
            System.out.println("Caminho: " + file.getPath());
            System.out.println("Caminho Completo " + file.getAbsolutePath());
            System.out.println("É um diretório? " + file.isDirectory());
            System.out.println("É um arquivo oculto? " + file.isHidden());
            System.out.println("Ultima modificação: " + new Date( file.lastModified()));//para ver a data utiliza se Date
            
            if (existe){
                boolean deletado = file.delete();//método para deletar o arquivo
                System.out.println("Deletado? = " + deletado);
            }
            System.out.println("Criado ? " + criado);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
