public interface Agendamentos {
    public static void agendarProcedimento(Usuario usuario, Procedimento procedimento, String senha){
        if ((usuario instanceof Medicos || usuario instanceof TecnicosAdministrativos) && usuario.autenticar(senha)){
            System.out.println("Agendamento realizado com sucesso!");

        }else {
            System.out.print("Acesso negado!");
        }
    }

}
