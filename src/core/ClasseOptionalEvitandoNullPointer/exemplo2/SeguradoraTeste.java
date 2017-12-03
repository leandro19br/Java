package core.ClasseOptionalEvitandoNullPointer.exemplo2;

import java.util.Optional;

public class SeguradoraTeste {

    public static void main(String[] args) {

        //criando os objetos
        Seguradora seguradora = new Seguradora("Seguros SA");
        Carro carro = new Carro(seguradora, "Spim");
        Pessoa pessoa = new Pessoa("Leandro", carro);

        System.out.println(obterNomeSeguradora(Optional.ofNullable(pessoa)));

    }

    //método para obter o nome da seguradora onde a pessoa pose ser opcional
    public static String obterNomeSeguradora(Optional<Pessoa> pessoa) {

        return  pessoa.flatMap(Pessoa::getCarro)
                .flatMap(Carro::getSeguradora)
                .map(Seguradora::getNome)
                .orElse("Não Existe !");

    }
}
