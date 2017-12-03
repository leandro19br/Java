package core.excecoes.TratamentoExecaoUnchecked.blocoFinal;

public class TesteBlocoFinal {

    public static void main(String[] args) {

    abrirNovo();
    }

    public static void abrir(){

        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Lendo Arquivo");
            throw new Exception();//forçando uma exeção
        }catch (Exception e ){
            System.out.println("Dentro do Catch");
            e.printStackTrace();
        }finally {
            System.out.println("Fechando recurso");
        }

    }

    public static String abrirNovo(){

        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Lendo Arquivo");
           return "Valor";
        }catch (Exception e ){
            System.out.println("Dentro do Catch");
            e.printStackTrace();
        }finally {
            System.out.println("Fechando recurso");
        }
        return null;
    }
}
