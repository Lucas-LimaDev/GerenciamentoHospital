public class Consulta extends Procedimento {
    private String diagnostico;

    public static void main (String[] args) {
        System.out.println("Consulta diagnostico!");

        Pacientes lucas = new Pacientes(30, "Lucas ","1242145554444","20/20/2050",21);
        Medicos jose = new Medicos("José Silva",40,"000.333.555.89","Clínico Geral","mg123456");
        Procedimento x = new Procedimento("Consulta de Rotina", "20/02/2015", paciente, medicoResponsavel) {
            @Override
            public void exibirDetalhes() {

            }
        };

        System.out.println("Paciente: "+lucas.nome);
        System.out.println("Cpf: "+lucas.cpf);
        System.out.println("Idade : "+lucas.idade);
        System.out.println("Médico Responsável: "+jose.nome);
        System.out.println("Procedimento: "+x.descricao);






    }


    public Consulta(String descricao, String data, Usuario paciente, Medicos medicoResponsavel) {
        super(descricao, data, paciente, medicoResponsavel);
    }

    @Override
    public void exibirDetalhes() {

        System.out.println("Consulta:");
        System.out.println("Descricao:"+ descricao);
        System.out.println("Data:"+ data);
        System.out.println("Paciente:"+ paciente.nome);
        System.out.println("Médico:" + medicoResponsavel.nome);
        System.out.println("Diagnostico:"+ diagnostico);


    }



}
