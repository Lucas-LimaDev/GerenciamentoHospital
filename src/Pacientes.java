public class Pacientes extends Usuario {
    private int numPlano;


    public Pacientes(int idade,String nome, String cpf, String dataNascimento, int numPlano) {
       super(nome,cpf,idade);
       this.numPlano = numPlano;
    }


    @Override
    public void exibir() {

    }

    @Override
    public void exibirInfo() {

    }

    @Override
    public void exibirIfor() {

    }

}



