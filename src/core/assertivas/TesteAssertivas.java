package core.assertivas;

public class TesteAssertivas {

    public static void main(String[] args) {

        calculaSalario(-100);
    }

    //garantia que o código vai fazer o que vc planejou
    private static void calculaSalario(double salario) {
        assert (salario > 0) : "Salario não pode ser menor que zero";
    }
}
