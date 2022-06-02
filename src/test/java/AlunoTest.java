import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    public void deveFormarAlunoMatriculado() {
        Aluno aluno = new Aluno();
        assertTrue(aluno.formar());
        assertEquals(AlunoEstadoFormado.getInstancia(), aluno.getEstado());
    }

    @Test
    public void naoDeveMatriculadoAlunoMatriculado() {
        Aluno aluno = new Aluno();
        assertFalse(aluno.matricular());
    }

    @Test
    public void deveTrancarAlunoMatriculado() {
        Aluno aluno = new Aluno();
        assertTrue(aluno.trancar());
        assertEquals(AlunoEstadoTrancado.getInstancia(), aluno.getEstado());

    }

    @Test
    public void naoDeveFormarAlunoFormado() {
        Aluno aluno = new Aluno();
        aluno.setEstado(AlunoEstadoFormado.getInstancia());
        assertFalse(aluno.formar());
    }

    @Test
    public void naoDeveMatricularAlunoFormado() {
        Aluno aluno = new Aluno();
        aluno.setEstado(AlunoEstadoFormado.getInstancia());
        assertFalse(aluno.matricular());
    }

    @Test
    public void naoDeveTrancarAlunoFormado() {
        Aluno aluno = new Aluno();
        aluno.setEstado(AlunoEstadoFormado.getInstancia());
        assertFalse(aluno.trancar());
    }

    @Test
    public void naoDeveTrancarAlunoTrancado() {
        Aluno aluno = new Aluno();
        aluno.setEstado(AlunoEstadoTrancado.getInstancia());
        assertFalse(aluno.trancar());
    }

    @Test
    public void naoDeveFormarAlunoTrancado() {
        Aluno aluno = new Aluno();
        aluno.setEstado(AlunoEstadoTrancado.getInstancia());
        assertFalse(aluno.formar());
    }

    @Test
    public void deveMatricularAlunoTrancado() {
        Aluno aluno = new Aluno();
        aluno.setEstado(AlunoEstadoTrancado.getInstancia());
        assertTrue(aluno.matricular());
        assertEquals(AlunoEstadoMatriculado.getInstancia(), aluno.getEstado());

    }

    @Test
    public void deveRetornarExcecaoEstadoInvalido() {
        try {
            Aluno aluno = new Aluno();
            aluno.setEstado(null);
            aluno.matricular();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Estado inválido", e.getMessage());
        }
    }

}