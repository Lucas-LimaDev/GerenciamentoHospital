public class Medicos extends  Usuario  {
    private String especialidade;

    public Medicos(String nome, String senha, String cpf, String especialidade) {
        super(nome,cpf,senha);
        this.especialidade = especialidade;


    }


}





