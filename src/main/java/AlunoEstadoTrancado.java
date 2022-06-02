public class AlunoEstadoTrancado extends AlunoEstado {

    private static AlunoEstadoTrancado instancia = new AlunoEstadoTrancado();

    private AlunoEstadoTrancado() {}

    public static AlunoEstadoTrancado getInstancia() {
        return instancia;
    }

    public boolean matricular(Aluno aluno) {
        aluno.setEstado(AlunoEstadoMatriculado.getInstancia());
        return true;
    }
}
