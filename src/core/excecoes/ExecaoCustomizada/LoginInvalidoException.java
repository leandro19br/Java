package core.excecoes.ExecaoCustomizada;

//exception customizada do tipo Checked
public class LoginInvalidoException extends Exception {
    //construtor
    public LoginInvalidoException() {
        super("Usuário ou senha Inválida");
    }
}
