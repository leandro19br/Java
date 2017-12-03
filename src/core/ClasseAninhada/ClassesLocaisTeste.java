package core.ClasseAninhada;

public class ClassesLocaisTeste {

    private String nome = "Leandro Classe Externa";

    //Método

    public void fazAlgumaCoisa(){
        //atributo precisa ser final ou se tentar alterar dentro da classe dará erro
        //obs: final não pode ser extrendida e abstratic deve ser extendida

        String sobreNome = "Santiago";
        //criando uma classe interna dentro do Método
        class Interna{

            public void imprimeNomeExterno(){
                System.out.println(nome);
            }
        }

        Interna in = new Interna();
        in.imprimeNomeExterno();
    }
    public static void main(String[] args) {

        ClassesLocaisTeste externa = new ClassesLocaisTeste();
        //não tem acesso a clase local dentro do método sem criar um objeto da classe interna
        externa.fazAlgumaCoisa();

    }
}
