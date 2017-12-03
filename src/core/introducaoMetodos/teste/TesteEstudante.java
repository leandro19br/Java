package core.introducaoMetodos.teste;

import core.introducaoMetodos.classes.Estudantes;

public class TesteEstudante {
    public static void main(String[] args) {
        Estudantes estudantes = new Estudantes();
        estudantes.setNome("Leandro");
        estudantes.setIdade(-2);
        estudantes.setNotas( new int[]{8,8,9});

        estudantes.imprimeNota();
        System.out.println("aprovado? " + estudantes.isAprovado());

    }
}
