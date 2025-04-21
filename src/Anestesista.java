public class Anestesista extends Usuario {
    private String especialidade;



    public Anestesista( String nome,String cpf, String senha,String especialidade, String crm) {
        super(nome, cpf, senha);
        this.especialidade = especialidade;

    }


}
