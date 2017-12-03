package core.ClasseAninhada;

class Externa{


    static class Interna{

        public void imprime(){
            System.out.println("oi");
        }
    }
}

public class ClasseInternaEstatica {

    public static void main(String[] args) {

        //para criar o objeto interna

        Externa.Interna intrna = new Externa.Interna();
        intrna.imprime();

    }
}
