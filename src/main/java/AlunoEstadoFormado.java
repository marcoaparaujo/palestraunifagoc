public class AlunoEstadoFormado extends AlunoEstado {

    private static AlunoEstadoFormado instancia = new AlunoEstadoFormado();

    private AlunoEstadoFormado() {}

    public static AlunoEstadoFormado getInstancia() {
        return instancia;
    }



}
