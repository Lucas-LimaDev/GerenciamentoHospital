public class ProcedimentoCirurgico  extends Procedimento {
    private int duracaoHoras;
    private boolean liberacao;



    public static void main (String arg[]){

        ProcedimentoCirurgico cirurgia = new ProcedimentoCirurgico(2,true,"Retirada visicúla","20/02/2030",paciente,medicoResponsavel);
        cirurgia.exibirDetalhes();

        if (!cirurgia.podeSair()){
            System.out.println("Paciente ainda não pode sair!");
            cirurgia.liberarPaciente();
        }
        System.out.println("Pode sair ?" + (cirurgia.podeSair()));

    }
    public  ProcedimentoCirurgico(int duracaoHoras, boolean liberacao,String descricao, String data,Usuario paciente, Medicos medicoResponsavel) {
        super(descricao,data,paciente,medicoResponsavel);
        this.duracaoHoras = duracaoHoras;
        this.liberacao = false;


    }



    public void liberarPaciente(){
        liberacao = true;
        System.out.println("Paciente liberado!");
    }

    public boolean podeSair(){
        return liberacao;
    }


    @Override
    public void exibirDetalhes(){
        System.out.println("Consulta:");
        System.out.println("Descricao:"+ descricao);
        System.out.println("Data:"+ data);
        System.out.println("Paciente:"+ paciente.nome);
        System.out.println("Medico:"+ medicoResponsavel.nome);
        System.out.println("DuracaoHoras:"+ duracaoHoras);
        System.out.println("Liberacao:"+ liberacao);
    }




}
