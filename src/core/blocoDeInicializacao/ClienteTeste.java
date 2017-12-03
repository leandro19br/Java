package core.blocoDeInicializacao;

public class ClienteTeste {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        System.out.println("Imprimindo quantidade de parcelas possíveis");
        for (int parcela: cliente.getParcelas()) {
            System.out.print(parcela + " ");
        }
    }
}
