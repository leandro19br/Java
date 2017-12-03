package core.padraoProjetoBuilder;

public class PessoaTeste {
    public static void main(String[] args) {

    //para cirar o objeto pessoa, teremos que chamar o PessoaBuilder e cahamr os métodos com os atributos e
    //por utimo o método build que retorna uma Pessoa

        Pessoa p = new Pessoa.
                PessoaBuilder().
                nome("Leandro").
                nomeDoMeio("Campos").
                ultimoNome("Santiago").
                nomeDoPai("Fernando").
                apelido("Gostoso").
                build();
        System.out.println(p);
    }

}
