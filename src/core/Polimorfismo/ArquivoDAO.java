package core.Polimorfismo;

public class ArquivoDAO implements GenericDAO {
    @Override
    public void salvar() {
        System.out.println("Salvando dados no arquivo");
    }
}
