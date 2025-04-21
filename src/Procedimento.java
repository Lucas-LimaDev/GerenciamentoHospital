public abstract class Procedimento {
    protected Pacientes paciente;
    protected Medicos medicosResposavel;
    protected Enfermeiros enfermeiros;
    protected Anestesista anestesista;
    protected ResponsavelTecnico responsavelTecnico;
    protected boolean aprovado;

    public Procedimento(Pacientes paciente, Medicos medicosResposavel, ResponsavelTecnico rt) {
        this.paciente = paciente;
        this.medicosResposavel = medicosResposavel;
        this.responsavelTecnico = rt;
    }

    public void aprovarProcedimento() {
        this.aprovado = true;
    }
    public abstract void finalizar();
}
