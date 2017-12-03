package core.associacao;

public class TesteAssociacao {
    public static void main(String[] args) {


        Seminario seminario = new Seminario("Como ser um Programador");
        Seminario seminario2 = new Seminario("Como Programar em Java");
        Professor prof = new Professor("Fioda","Java");
        Local local = new Local("Rua das Araras","Araras");
        Aluno aluno = new Aluno("Leandro",37);
        Aluno aluno1 = new Aluno("Miguel",27);
        //aluno.setSeminario(seminario);

        seminario.setProfessor(prof);
        seminario.setAlunos(new Aluno[]{aluno,aluno1});
        seminario.setLocal(local);
        prof.setSeminarios(new Seminario[]{seminario,seminario2});

        //aluno.print();
        //seminario.print();
          //local.print();
        prof.print();




    }
}
