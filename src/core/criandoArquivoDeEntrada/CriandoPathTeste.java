package core.criandoArquivoDeEntrada;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CriandoPathTeste {
    public static void main(String[] args) {

        //Path é uma interface para pegar diretório
        Path p1 = Paths.get("C:\\Users\\leand\\IdeaProjects\\Projeto_Java\\arquivo.txt");
        Path p2 = Paths.get("C:\\Users\\leand\\IdeaProjects\\Projeto_Java" , "arquivo.txt");
        Path p3 = Paths.get("C:","Users","leand","IdeaProjects" ,"Projeto_Java" , "arquivo.txt");//pode ser tudo separado

        System.out.println(p3.toAbsolutePath());
        // a Classe Paths veio para substituir a classe File
        File file = p3.toFile();//transformando Path em File
        Path path1 = file.toPath();

/*
        try {
            Path path = Paths.get("pasta");//criando diretório com Path
           if (Files.notExists(path)){
               Files.createDirectory(path);
           }else{
               System.out.println("Já existe");
           }

        } catch (IOException e) {
            e.printStackTrace();
        }
 */
        //criando mais de um diretório
        try {
            Path path = Paths.get("pasta","subDiretorio");//criando diretório com Path
            Path arquivo = Paths.get("pasta","subDiretorio","arquivo.txt");//criando diretório com Path

            if (Files.notExists(path)){
                Files.createDirectories(path);
                Files.createFile(arquivo);//criando arquivo

            }else{
                System.out.println("Já existe");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        //copiando arquivo
        Path sources = Paths.get("folder2\\arquivo.txt");
        Path target = Paths.get( "folder2\\arquivo_alterado.txt");
        try {
            Files.copy(sources,target, StandardCopyOption.REPLACE_EXISTING);//arquivo será sobescrito
            Files.deleteIfExists(target);//deleta o arquivo
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

