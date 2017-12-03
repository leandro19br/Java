package core.zipandoArquivo;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipandoTeste {
    public static void main(String[] args) {
        //criando diretório do arquivo
        Path dirZip = Paths.get("pasta/subPasta");
        Path dirFiles = Paths.get("pasta/subPasta/subSubPasta");
        Path zipFile = dirZip.resolve("arquivo.zip");

        try(ZipOutputStream zipOutput = new ZipOutputStream(new FileOutputStream(zipFile.toFile()));
            DirectoryStream<Path> stream = Files.newDirectoryStream(dirFiles)) {
            for (Path path: stream) {

                ZipEntry zipEntry = new ZipEntry(path.getFileName().toString());
                zipOutput.putNextEntry(zipEntry);
                FileInputStream fileInput = new FileInputStream(path.toFile());
                byte[] bytes = new byte[2048];
                int dados;
                while ((dados = fileInput.read(bytes)) > 0){
                    zipOutput.write(bytes);
                }
                zipOutput.closeEntry();
                fileInput.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
