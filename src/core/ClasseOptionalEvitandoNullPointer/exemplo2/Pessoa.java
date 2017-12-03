package core.ClasseOptionalEvitandoNullPointer.exemplo2;

import java.util.Optional;

public class Pessoa {

    private String nome;
    private Carro carro;

    public Pessoa(String nome, Carro carro) {
        this.nome = nome;
        this.carro = carro;
    }

    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //uma pessoa nem sempre vai ter um carro portanto utilizamos Optional
    public Optional<Carro> getCarro() {
        return Optional.ofNullable(carro);
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
}
