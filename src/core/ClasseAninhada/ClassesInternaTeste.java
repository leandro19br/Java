package core.ClasseAninhada;

public class ClassesInternaTeste {

    private String nome = "Leandro JEDI";

    //criando uma classe interna aninhada ela tem acesso a todos os atributos da classe externa
    class Interna{
        public void VerClasseExterna(){
            System.out.println(nome);
        }

    }

    public static void main(String[] args) {
        //criando objeto da classe mais externa
        ClassesInternaTeste externa = new ClassesInternaTeste();
        //depois criar objeto Interna atraves de externa e guardar na variável de referência
        Interna interna = externa.new Interna();
        interna.VerClasseExterna();
        //Segunda forma
        ClassesInternaTeste.Interna in = new ClassesInternaTeste().new Interna();
       in.VerClasseExterna();

    }
}







