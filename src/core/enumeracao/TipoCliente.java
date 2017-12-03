package core.enumeracao;

/**
 * em uma enum todos os atributos são considerados CONSTANTES
 */
public enum TipoCliente {
    PESSOA_JURICA(1,"Pessoa Juridica"),PESSOA_FISICA(2,"Pessoa Fisica");
    //os atributos devem ser criados após a constante
    private int tipo;
    private String nome;
    //construtor
    TipoCliente(int tipo,String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }
}
