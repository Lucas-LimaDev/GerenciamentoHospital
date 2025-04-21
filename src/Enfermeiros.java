public class Enfermeiros  extends Usuario {
    private String especialidade;

   public Enfermeiros( String nome, String cpf, String senha,String especialidade) {
       super(nome,cpf,senha);
       this.especialidade = especialidade;

   }


}
