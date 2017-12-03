package core.sobreescritaMetodos;

public class Pessoa {

    private String nome;
    private int idade;

    //método herdado de object que será feita a sobreescrita

    /**
     * para sobescrever um método ele precisa ter a mesma assinatura e os mesmos parâmetros e alterar
     * o comportamento do método na classe que ela herda
     *
     * @return
     */
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
