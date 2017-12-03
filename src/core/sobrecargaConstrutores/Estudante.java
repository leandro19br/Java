package core.sobrecargaConstrutores;

public class Estudante {

    private String nome;
    private String matricula;
    private double[] notas;
    //se tivermos que colocar mais um atributo para que não quebre o código teremos que fazer a sobrecarga de construtor
    private String dataMatricula;


    //construtor
    public Estudante(String nome, String matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;


    }

    public Estudante(String nome, String matricula, double[] notas, String dataMatricula) {

        /**
         *   para chamar um contrutor dentro de outro
         *   Construtores só podem ser chamados dentro de contrutores e deve ser
         *   a primeira linha a ser executada
         *
         */

        this(nome, matricula, notas);
        this.dataMatricula = dataMatricula;


    }


    //sobrecarga de construtor
    public Estudante() {

    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.matricula);
        for (double nota : this.notas) {
            System.out.println(nota + "");
        }
        System.out.println(this.dataMatricula);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
}
