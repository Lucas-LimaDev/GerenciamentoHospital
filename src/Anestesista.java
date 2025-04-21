public class Anestesista extends Usuario {
    private String especialidade;
    private String crm;


    public Anestesista( String nome,String cpf, int Idade,String especialidade, String crm) {
        super(nome, cpf, Idade);
        this.especialidade = especialidade;
        this.crm = crm;
    }


    @Override
    public void exibir() {

    }

    @Override
    public void exibirInfo() {
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("Crm: " + this.crm);

    }

    @Override
    public void exibirIfor() {

    }
}
