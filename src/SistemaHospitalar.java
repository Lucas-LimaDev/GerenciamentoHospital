
public class SistemaHospitalar {
    public static void main(String[] args) {
       Medicos medico = new Medicos("DR. José", "med123","12354698845","Cardiologia");
       Pacientes paciente = new Pacientes(27,"Lucas","12345678900","20/05/2035",1);
       ResponsavelTecnico rt = new ResponsavelTecnico("Dr. Nilva","0000555876",35,"Cirugia","rt123");



       Consulta consulta = new Consulta(paciente,medico,rt);

       consulta.aprovarProcedimento();
       Agendamentos.agendarProcedimento(medico, consulta,"med123");
       consulta.finalizar();


    }
}