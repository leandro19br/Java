package core.arquivos;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTeste  {
    public static void main(String[] args) throws IOException {
        File diretorio = new File("folder");
       boolean criado = diretorio.mkdir();//cria diretório e retorna um boolean
        System.out.println("Diretório Criado " + criado);
        File arquivo = new File("folder\\arquivo.txt");
        boolean arquivoCriado = arquivo.createNewFile();//criando o arquivo e retorna um booleano
        System.out.println("Arquivo Criado " + arquivoCriado);

        //renomenando arquivo
        File novoNome = new File("C:\\Users\\leand\\IdeaProjects\\Projeto_Java\\folder\\arquivo_novo.txt");
        boolean trocado = arquivo.renameTo(novoNome); //alterando para o novo nome
        System.out.println("arquivo Alterado " + trocado);

        //renomar diretório
        File diretorioRenomeado = new File("Folder2");
        boolean diretorioAlterado = diretorio.renameTo(diretorioRenomeado);
        System.out.println("Diretório Alterado " + diretorioAlterado);
        buscarArquivos();

    }

    public static void buscarArquivos(){

        File f = new File("Folder2");
        String[] list = f.list();
        System.out.println("....Buscando Arquivos");
        for (String arq:list) {
           System.out.println(arq);

        }

    }
}