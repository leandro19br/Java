package core.ClasseOptionalEvitandoNullPointer;

import java.util.Optional;

public class OptionalTesteSeguradora {
    public static void main(String[] args) {

        Seguradora s = new Seguradora("SSS");
        System.out.println(obterNomeSeguradoraOptional(s));


    }
    //método que verifica se o nome pode vir null utilizando a Classe Optional
    public static String obterNomeSeguradoraOptional(Seguradora seguradora){
        //alterado o método GET utilizando a Classe Optional
        //o métodp flstMap retorna String portanto poderia utilizar o orElse da Classe Optional
        System.out.println(Optional.ofNullable(seguradora).flatMap(Seguradora::getNome).orElse("VAZIO"));
        return "";
    }

    //método que verifica se o nome pode vir null sem a Classe Optional
    public static String obterNomeSeguradora(Seguradora seguradora){
        String nome = null;
        if (seguradora.getNome() != null){
          //  nome = seguradora.getNome();
        }
        return nome;
    }
}
