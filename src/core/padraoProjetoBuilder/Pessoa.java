package core.padraoProjetoBuilder;

public class Pessoa {
    private String nome;
    private String nomeDoMeio;
    private String ultimoNome;
    private String nomeDoPai;
    private String apelido;

    //criando um construtor privado que será iniciará todos os atributos e será utilizado pelo builder
    private Pessoa(String nome, String nomeDoMeio, String ultimoNome, String nomeDoPai, String apelido) {
        this.nome = nome;
        this.nomeDoMeio = nomeDoMeio;
        this.ultimoNome = ultimoNome;
        this.nomeDoPai = nomeDoPai;
        this.apelido = apelido;
    }

    //criando uma classe interna builder para utilizar como padrão de projeto
    public static class PessoaBuilder{

        private String nome;
        private String nomeDoMeio;
        private String ultimoNome;
        private String nomeDoPai;
        private String apelido;

        public PessoaBuilder() {
        }

        //metodos os métodos deverão retornar PessoaBuilder

        public PessoaBuilder nome(String nome){
            this.nome = nome;
            return this;
        }

        public PessoaBuilder nomeDoMeio(String nomeDoMeio){
            this.nomeDoMeio = nomeDoMeio;
            return this;
        }
        public PessoaBuilder ultimoNome(String ultimoNome){
            this.ultimoNome = ultimoNome;
            return this;
        }
        public PessoaBuilder nomeDoPai(String nomeDoPai){
            this.nomeDoPai = nomeDoPai;
            return this;
        }

        public PessoaBuilder apelido(String apelido){
            this.apelido = apelido;
            return this;
        }
        //criando uma pessoa com todos os campos que vai criar o objeto Pessoa e retornar essa pessoa
        public Pessoa build(){

            return new Pessoa(nome,nomeDoMeio,ultimoNome,nomeDoPai,apelido);
        }


    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", nomeDoMeio='" + nomeDoMeio + '\'' +
                ", ultimoNome='" + ultimoNome + '\'' +
                ", nomeDoPai='" + nomeDoPai + '\'' +
                ", apelido='" + apelido + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeDoMeio() {
        return nomeDoMeio;
    }

    public void setNomeDoMeio(String nomeDoMeio) {
        this.nomeDoMeio = nomeDoMeio;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getNomeDoPai() {
        return nomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
}
