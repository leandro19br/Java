package core.introducaoClasse.introducaoClasseTeste;

import core.introducaoClasse.Estudante;

public class estudanteTeste {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.idade = 15;
        estudante.nome = "João";
        estudante.matricula = "1212";

        System.out.println("nome: " + estudante.nome);
        System.out.println("idade: " + estudante.idade);
        System.out.println("matricula: " + estudante.matricula);
    }
}
