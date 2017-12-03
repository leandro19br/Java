package core.Array;
//implementando a interface comprable
public class Produto implements Comparable<Produto>{

    private String serialNumber;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String serialNumber, String nome, double preco,int quantidade) {
        this.serialNumber = serialNumber;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produto produto = (Produto) o;

        return serialNumber != null ? serialNumber.equals(produto.serialNumber) : produto.serialNumber == null;
    }

    @Override
    public int hashCode() {
        return serialNumber != null ? serialNumber.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "serialNumber='" + serialNumber + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }



    @Override
    public int compareTo(Produto outroObjeto) {
        //Regra para p compareTo
        //retorna negativo se thisObject  < outroObjeto
        //retorna Zero se thisObject == outroObjeto
        //retorna positivo se thisObject  > outroObjeto
        //o método compareTo da Classe String vai retornar esse inteiro para mim
        //comparando duas Strings de dois objetos
        //não iremos conseguir ordenar por double pois os tipos primitivos não recebem métodos
        //podemos alterar para Double
         //int numero = this.serialNumber.compareTo(outroObjeto.getSerialNumber());
        //return numero;
        Double p = preco;
        return p.compareTo(outroObjeto.getPreco());
    }
}
