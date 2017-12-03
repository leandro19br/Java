package core.enumeracao;

public class Teste  {
    public static void main(String[] args) {
        ClienteComEnumeracao c = new ClienteComEnumeracao("Ana",TipoCliente.PESSOA_FISICA, ClienteComEnumeracao.TipoPagamento.APRAZO);
        System.out.println(c);
    }
}