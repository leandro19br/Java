package core.padraoFactory;

public class MoedaFactory {

    public static Moeda criarMoeda(Pais pais){

        if (pais.equals(Pais.BRASIL)){
            return new Real();//criar objeto Real
        }else if (pais.equals(Pais.EUA)){
            return new Dolar();//criar objeto Dolar
        }
        throw new IllegalArgumentException("Não existe esse Pais");//menssagem de erro de argumento
    }
}
