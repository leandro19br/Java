package core.ClasseOptionalEvitandoNullPointer;

import java.util.Optional;

public class OptionalTeste1 {

    String nome;
    public static void main(String[] args) {

        OptionalTeste1 optionalTeste1 = new OptionalTeste1();
        //compila mostrando null na variável, porém ao chamar um metodo por ex ToUpperCase dára null pointer pq não existe objeto
        //System.out.println(optionalTeste1.nome.toUpperCase());
        //utilizando a classe Optional para Objetos null
        Optional<String> optional1 = Optional.of("Leandro");//vc tem certexa que o objeto não é null
        System.out.println(optional1);
        Optional<String> optional2 = Optional.empty();//vc tem certexa que o objeto é null
        System.out.println(optional2);
        Optional<String> optional3 = Optional.ofNullable(optionalTeste1.nome);//existe a possibilidade do objeto ser null
        System.out.println(optional3);
        //buscando valores
        System.out.println(optional1.orElse("nada"));
        System.out.println(optional2.orElse("nada"));
        System.out.println(optional3.orElse("nada"));


    }
}
