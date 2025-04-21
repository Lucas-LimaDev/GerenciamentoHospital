public abstract class Procedimento {
    protected String descricao;
    protected String data;
    protected static Usuario paciente;
    protected static Medicos medicoResponsavel;

    public Procedimento(String descricao, String data, Usuario paciente, Medicos medicoResponsavel) {
        this.descricao = descricao;
        this.data = data;
        this.paciente = paciente;
        this.medicoResponsavel = medicoResponsavel;
    }

    public abstract void exibirDetalhes();
}
