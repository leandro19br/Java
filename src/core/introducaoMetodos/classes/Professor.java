package core.introducaoMetodos.classes;

public class Professor {

    public String nome;
    public String cpf;
    public String rg;
    public String matricula;

    public Professor(String nome, String cpf, String rg, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;


    }
    /*método recebe como parâmetro um objeto professor para poder imprimir

    public void imprime(Professor prof){

        System.out.println("Nome: " + prof.nome);
        System.out.println("Nome: " + prof.cpf);
        System.out.println("Nome: " + prof.rg);
        System.out.println("Nome: " + prof.matricula);




    }*/

    // para pegar atributos e métodos direto no objeto utiliza this
    public void imprime() {

        System.out.println("Nome: " + this.nome);
        System.out.println("Nome: " + this.cpf);
        System.out.println("Nome: " + this.rg);
        System.out.println("Nome: " + this.matricula);

    }


}
