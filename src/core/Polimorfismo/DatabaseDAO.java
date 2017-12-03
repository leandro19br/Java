package core.Polimorfismo;

public class DatabaseDAO implements GenericDAO {
    @Override
    public void salvar() {
        System.out.println("Salvando dados no banco");
    }
}
