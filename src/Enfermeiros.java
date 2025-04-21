public class Enfermeiros  extends Usuario {
    private String especialidade;
   private String coren;

   public Enfermeiros( String nome, String cpf, int idade,String especialidade, String coren) {
       super(nome,cpf,idade);
       this.especialidade = especialidade;
       this.coren = coren;
   }

    @Override
    public void exibir() {

    }

    @Override
   public void exibirInfo() {
       System.out.println("Especialidade:" + especialidade);
       System.out.println("Coren:" + coren);

   }

    @Override
    public void exibirIfor() {

    }
}
