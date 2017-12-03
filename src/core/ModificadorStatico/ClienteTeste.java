package core.ModificadorStatico;



public class ClienteTeste {
    public static void main(String[] args) {

       Cliente cliente = new Cliente();

        System.out.println("parcela cleinte " + cliente.getParcelas().length);
        System.out.println("tamanho do array " + core.ModificadorStatico.Cliente.getParcelas().length);

    }
}
