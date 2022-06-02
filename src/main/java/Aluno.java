public class Aluno {
    private AlunoEstado estado;

    public Aluno() {
        this.estado = AlunoEstadoMatriculado.getInstancia();
    }

    public AlunoEstado getEstado() {
        return estado;
    }

    public void setEstado(AlunoEstado estado) {
        if (estado == null) {
            throw new IllegalArgumentException("Estado inválido");
        }
        this.estado = estado;
    }

    public boolean matricular() {
        return this.estado.matricular(this);
    }

    public boolean formar() {
        return this.estado.formar(this);
    }

    public boolean trancar() {
        return this.estado.trancar(this);
    }
}
