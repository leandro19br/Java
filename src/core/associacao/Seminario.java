package core.associacao;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario() {
    }


    public void print(){
        System.out.println("Título: " + this.titulo);

        for (Aluno aluno:alunos) {

            System.out.println("Alunos: " + " Nome: " + aluno.getNome() + "\n Idade:" + aluno.getIdade());

        }
        System.out.println("Professor: " + professor.getNome() + "\n Especialidade: " + professor.getEspecialidade());
        System.out.println("Local " + local.getRua() + "\n Bairro:" + local.getBairro());

    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
