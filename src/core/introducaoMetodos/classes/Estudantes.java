package core.introducaoMetodos.classes;

public class Estudantes {

    private String nome;
    private int idade;
    private int[] notas ;
    private boolean aprovado;

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {

        try {
            if (idade <0){
                throw  new Exception();
            }

        }catch (Exception e){
            System.out.println("Idade não pode ser menor que o, valor digitado = " + idade);

        }finally {
            this.idade = idade;
        }

    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public void imprimeNota() {

        if (notas != null) {
            double media = 0;

            for (double nota : notas) {

                media += nota;

            }
            media = media / notas.length;

            if (media > 6) {
                aprovado = true;
                System.out.println("Aluno " + this.nome + " Aprovado, sua média foi: " + media);
            } else {
                aprovado = false;
                System.out.println("Aluno " + this.nome + " Reprovado, sua média foi: " + media);
            }
        } else {
            System.out.println("Não Existe nota");
        }

    }


}
