package core.Polimorfismo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DAOTeste {
    public static void main(String[] args) {
        //GenericDAO dao = new ArquivoDAO();
        GenericDAO dao = new DatabaseDAO();
        dao.salvar();

        //mesmo acontece com o List que é mais genérico e uma interface, onde ArrayList e LinkedList implementa ela

       // List<String> lista = new ArrayList<>();
        List<String> lista = new LinkedList<>();
        lista.add("Nome1");
        lista.add("Nome2");
        lista.add("Nome3");
        lista.add("Nome4");
        for (String nome:lista) {
            System.out.println(nome);
        }


    }
}
