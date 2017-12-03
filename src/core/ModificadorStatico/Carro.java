package core.ModificadorStatico;

public class Carro {

    /**
     * neste exemplo todos os carros devem ser produzidos com uma velocidade limite de 240 KM/h
     * para isso utilizamos o static, pois assim esse atributo pertence a classe e não mais de objeto
     */
    private String nome;
    private double velocidadeMaxima;
    //public static double VelocidadeLimite = 240;
    private static  double velocidadeLimite = 240;

    /**
     *
     * Metodos estatios também pertem somente a classe e não ao objeto
     */



    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {
    }

    public void imprime(){
        System.out.println("-----------------------------------------------");
        System.out.println("Carro: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + velocidadeLimite);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    /**
     *
     * Como o atributo é static e private será criado os métodos get e set como static
     */
    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }
}
