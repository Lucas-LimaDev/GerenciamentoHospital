public class ProcedimentoEstetico extends Procedimento {
    public ProcedimentoEstetico(Pacientes paciente, Medicos medico, ResponsavelTecnico rt) {
        super(paciente, medico, rt);


    }

    @Override
    public void finalizar() {
        if (aprovado){
            System.out.println("Aprovado");
        }
    }
}



