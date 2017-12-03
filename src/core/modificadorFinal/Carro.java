package core.modificadorFinal;

public class Carro {

    /**
     * Uma varoável constante em java(que utiliza final e não pode sere mudada)deve ser escrita em maiúsculo e deve ser inicializada
     * Para variáveis do tipo referencia tb precisa ser inicializada.
     * Quando utilizada em uma classe definida como final ela não pode ser estendida.
     * Em um método se definido como final vc não poderá sobescreve-lo
     */
    public static final double VELOCIDADE_FINAL = 220 ;
    public final Comprador comprador = new Comprador();
    private String nome;
    private String marca;

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public Comprador getComprador() {
        return comprador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
