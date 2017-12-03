package core.excecoes.ExecaoCustomizada;

public class TesteCustonException {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }

    public static void logar()throws LoginInvalidoException{
        String usuarioBanco = "Goku";
        String senhaBanco = "111";
        String usuarioDigitado = "Goku";
        String senhaDigitada = "123";
        if (!usuarioBanco.equals(usuarioDigitado) || !senhaBanco.equals(senhaDigitada)){
            throw new LoginInvalidoException();
        }else{
            System.out.println("Logado");
        }

    }
}
