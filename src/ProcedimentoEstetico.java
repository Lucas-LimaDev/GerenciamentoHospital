public class ProcedimentoEstetico extends Procedimento {
    private String TipoProcedimento;


    public ProcedimentoEstetico( String descricao, String data, Usuario paciente, Medicos medicoResponsavel,String diagnostico) {
        super(descricao,data,paciente,medicoResponsavel);
        this.TipoProcedimento = diagnostico;
    }

    @Override
    public void exibirDetalhes() {


    }
}



