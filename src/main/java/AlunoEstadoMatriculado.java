public class AlunoEstadoMatriculado extends AlunoEstado {

    private static AlunoEstadoMatriculado instancia = new AlunoEstadoMatriculado();

    private AlunoEstadoMatriculado() {}

    public static AlunoEstadoMatriculado getInstancia() {
        return instancia;
    }

    public boolean formar(Aluno aluno) {
        aluno.setEstado(AlunoEstadoFormado.getInstancia());
        return true;
    }

    public boolean trancar(Aluno aluno) {
        aluno.setEstado(AlunoEstadoTrancado.getInstancia());
        return true;
    }
}
