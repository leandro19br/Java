package core.sobrecargaMetodos.classes;

/**
 * Se voce colocar um outro atributo e tiver que modificar o método initi o código pode ser quebrado a solução é a criação de outro método
 * que seria a sobrecarga de método onde vc utiliza o mesmo nome do método porém os parâmetros precisam obrigtoriamente ser diferentes
 */

public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;
    private String rg;

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Construtor
    public Funcionario(String nome, String cpf,double salario,String rg){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.rg = rg;
    }

    //sobrecarga de construtor

    public Funcionario(){

    }

//antes de incuir o rg
    public void init(String nome, String cpf,double salario){

        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;

    }
    //depois de incuir o rg sobrecarga de métodos
    public void init(String nome, String cpf,double salario,String rg){
        init(nome,cpf,salario);
        this.rg = rg;

    }

    public void imprime(){

        System.out.println("Nome: " + this.nome );
        System.out.println("CPF: " + this.cpf );
        System.out.println("RG: " + this.rg );
        System.out.println("Salário: " + this.salario );

    }

}
