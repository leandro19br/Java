package core.enumeracao;

public class Cliente {

    private String nome;
    public static final int PESSOA_FISICA = 1;
    public static final int PESSOA_JURIDICA = 2;
    private int tipo;

    public Cliente(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public Cliente() {
    }

    @Override
    public String toString() {
        String tipo;//variável auxiliar para guardar o valor Pessoa Fisica ou Juridica
        if (this.tipo == 1)
            tipo = "Pessoa Fisica";
        else
            tipo = "Pessoa Juridica";
        return "Nome: " + this.nome + " Tipo " + tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
