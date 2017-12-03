package core.zipandoArquivo;

import java.io.*;

/**
 *
 */
public class SteamsTeste {
    public static void main(String[] args) {
        //gravador();
        //lendo();
        //gravadorTunado();
        lendoTunado();

    }
    //classes InputStream e out implementam closeable
    public static void gravador(){
        byte[] dados = {65,66,67,68,69,70};
        //escrevendo arquivo se o arquivo não existir será criado,append true
        try (FileOutputStream arquivo = new FileOutputStream("pasta/stream.txt",true)){
            //fazendo um for para gravar os dados no arquivo
            /**
             * ou arquivo.write(dados);
             */

            for (byte b : dados){
                arquivo.write(b);

            }
            System.out.println("dados Gravados");

        }catch (IOException e){
            e.printStackTrace();

        }

    }

    public static void gravadorTunado(){
        byte[] dados = {65,66,67,68,69,70};
        //escrevendo arquivo se o arquivo não existir será criado,append true
        try (BufferedOutputStream arquivobuffer = new BufferedOutputStream( new FileOutputStream("pasta/streamBuufer.txt",true))){
            //fazendo um for para gravar os dados no arquivo
            /**
             * ou arquivo.write(dados);
             */

            for (byte b : dados){
                arquivobuffer.write(b);
                arquivobuffer.flush();//gospe tudo antes de fechar

            }
            System.out.println("dados Gravados");

        }catch (IOException e){
            e.printStackTrace();

        }

    }

    public static void lendo() {

        //lendo arquivo fazendo a leitura e guando chega no final retrorna -1
        try (FileInputStream leitor = new FileInputStream("pasta/stream.txt")) {

            int leitora;

            //enquanto leitor for diferente de -1

            while ((leitora = leitor.read()) != -1) {
                byte b = (byte) leitora;
                System.out.println(" " + b);
            }


        } catch (IOException e) {
            e.printStackTrace();

        }


    }

    public static void lendoTunado() {

        //lendo arquivo fazendo a leitura e guando chega no final retrorna -1
        try (BufferedInputStream leitorTunado = new BufferedInputStream( new FileInputStream("pasta/stream.txt"))) {

            int leitora;

            //enquanto leitor for diferente de -1

            while ((leitora = leitorTunado.read()) != -1) {
                byte b = (byte) leitora;
                System.out.println(" " + b);
            }


        } catch (IOException e) {
            e.printStackTrace();

        }


    }


}
