public abstract class Usuario {
    protected  String nome;
    protected  String cpf;
    public  String senha;

    public Usuario(String nome, String cpf, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}



