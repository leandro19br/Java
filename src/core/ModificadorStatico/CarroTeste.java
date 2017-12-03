package core.ModificadorStatico;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro("BMW",280);
        Carro carro1 = new Carro("Audi",240);
        Carro carro2 = new Carro("Mercedes",290);

        carro.imprime();
        carro1.imprime();
        carro2.imprime();

        System.out.println("Alterando velocidade Limite--------------------------------------------");
        /**
         * ao fazer a alteração do atributo velocidadeLimite, mesmo sendo alterada em um objeto específico,
         * será alterado em todos os objetos por ser um atributo static e fazer parte da classe Carro
         * Para acessar um atributo Static basta colocar o nome da classe = valor
         */
        //Carro.VelocidadeLimite = 200;

        Carro.setVelocidadeLimite(200);

        carro.imprime();
        carro1.imprime();
        carro2.imprime();
    }
}
