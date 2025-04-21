public class Consulta extends Procedimento {
    public Consulta(Pacientes paciente, Medicos medico, ResponsavelTecnico rt) {
        super(paciente,medico,rt);
    }


    @Override
    public void finalizar() {
        if (aprovado) {
            System.out.println("Consulta finalizado");
        }
    }
}





















