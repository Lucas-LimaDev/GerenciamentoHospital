public class Medicos extends  Usuario {
    private String especialidade;
    private String crm;

    public Medicos(String nome, int idade, String cpf, String especialidade, String crm) {
        super(nome,cpf,idade);
        this.especialidade = especialidade;
        this.crm = crm;
    }


    @Override
    public void exibir() {

    }

    @Override
    public void exibirInfo() {

    }

    @Override
    public void exibirIfor(){
        super.exibirInformacoes();{
            System.out.println("Especialidade: " + especialidade);
            System.out.println("Crm: " + crm);

        }
    }

}





