package core.erro;

//simulando erro da Classe Error que é filha da classe Throwable com stackOverflowErro (Stack = pilha)
//vai chamar o método Stack várias vezes e vai estourar o espaço na memória
// exception ou error são lançdos quando algo não segue o fluxo normal

public class Teste {
    public static void main(String[] args) {
        stackOverflowErro();
    }

    public static void stackOverflowErro(){
        stackOverflowErro();
    }
}
