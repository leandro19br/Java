package core.padraoFactory;

public interface Moeda {
    String getSimbolo();//na interface o método não tem copor e quem as implementa faz o que quiser no método
}

class Real implements Moeda{


    @Override
    public String getSimbolo() {
        return "R$";
    }
}


class Dolar implements Moeda{


    @Override
    public String getSimbolo() {
        return "U$";
    }
}