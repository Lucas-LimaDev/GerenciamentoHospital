public abstract class Usuario {
    protected  String nome;
    protected  String cpf;
    public   int idade;

    public Usuario(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }


    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
    }

    public abstract void exibir();

    public abstract void exibirInfo();

    public abstract void exibirIfor();
}
