package core.Colecoes;

/**
 * Métodos hashCode() e equals() são utilizados para trabalhar com Collections
 */

public class Celular {

    private String nome;
    private String imei;

    public Celular(String nome, String imei) {
        this.nome = nome;
        this.imei = imei;
    }

/*
 * Regras para criação do equls
 * Reflexivo - x.equals(x) tem que ser true para tudo que for diferente de null
 * Simétrico - para x e Y diferentes de null, se x.equals(y) == true logo y.equals(x) também
 * Transitividade - para x,y,z diferentes de null, x.equals(y) == true logo y.equals(x) == true
 * e logo x.equals(z) == true então logo y.equals(z) também tem que ser true
 * Consistente - x.equals(y) deve sempre retornar o mesmo valor
 * para x diferente de null x.equals(null) tem que retornar false
 * Regra para HashCode
 * Se x.equals(y) == true y.hashCode() == x.hashCode()
 * y.hashCode() == x.hashCode() não necessáriamente o equals retornará true
 * x.equals(y) == false
 * y.hashCode() != x.hashCode() o x.equals(y) deverá retornar false
*/

 //ctrl + o

    @Override
    public boolean equals(Object obj) {
        //verificar se o objeto é nulo
       if (obj == null) return false;
       //se estão no mesmo endereço de memória
       if (this == obj) return true;
       //para saber se o objeto que está vindo é um celular
       if (this.getClass() != obj.getClass()) return false;
       Celular outroCel = (Celular) obj;//tenho certeza de que o objeto é um celular
        //verificando so o imei do objeto é o mesmo do que foi passado utilizando operador ternário
       return imei != null && imei.equals(outroCel.getImei());
    }

    @Override
    public int hashCode() {
        //se imei não for nullo ele devolve o hash senão devolve 1
        return imei != null ? imei.hashCode() : 1;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "nome='" + nome + '\'' +
                ", imei='" + imei + '\'' +
                '}';
    }

    public Celular() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }
}
