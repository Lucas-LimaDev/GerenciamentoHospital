public class ProcedimentoCirurgico  extends Procedimento {
    private boolean liberadoPeloMedico = false;

    public ProcedimentoCirurgico(Pacientes paciente, Medicos medico, ResponsavelTecnico rt, Enfermeiros enf, Anestesista anes ) {
        super(paciente, medico, rt);
        this.enfermeiros = enf;
        this.anestesista = anes;
    }

    public void liberarSaidaPaciente(){
        this.liberadoPeloMedico = true;
    }

    @Override
    public void finalizar() {
        if (aprovado) {
            System.out.println("Procedimento finalizado");
        }
        }









}
