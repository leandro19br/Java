package core.ClasseOptionalEvitandoNullPointer.exemplo2;

import java.util.Optional;

public class Carro {

    private Seguradora seguradora;
    private String nome;

    public Carro(Seguradora seguradora, String nome) {
        this.seguradora = seguradora;
        this.nome = nome;
    }

    public Carro(String nome) {
        this.nome = nome;
    }

    //nem todo carro vai ter uma seguradora, portanto utilza -se Optinal
    public Optional<Seguradora> getSeguradora() {
        return Optional.ofNullable(seguradora);
    }

    public void setSeguradora(Seguradora seguradora) {
        this.seguradora = seguradora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
