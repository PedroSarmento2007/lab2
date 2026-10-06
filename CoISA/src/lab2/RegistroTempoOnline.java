package lab2;

/**
 * Registra o tempo online que um aluno dedica a uma disciplina remota
 *  e permite verificar se a meta de tempo esperado foi atingida.
 * 
 * @author Pedro Sarmento
 */
public class RegistroTempoOnline {
    /**
     * Tempo online esperado, em horas, quando nenhum valor é informado.
     */
    private static final int TEMPO_ONLINE_DEFAULT = 120;

    /**
     * Nome da disciplina.
     */

    private String nomeDisciplina;
    /**
     * Tempo online, em horas, que o aluno já dedicou à disciplina.
     */

    private int tempoOnlineUsado;

    /**
     * Tempo online, em horas, que se espera que o aluno dedique à disciplina.
     */
    private int tempoOnlineEsperado;

    /**
     * Constrói um registro de tempo online para a disciplina, com o tempo
     * esperado padrão.
     *
     * @param nomeDisciplina o nome da disciplina
     */
    public RegistroTempoOnline (String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = TEMPO_ONLINE_DEFAULT;

    }

    /**
     * Constrói um registro de tempo online para a disciplina, com o tempo
     * esperado informado.
     *
     * @param nomeDisciplina o nome da disciplina
     * @param tempoOnlineEsperado o tempo online esperado.
     */
    public RegistroTempoOnline (String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    /**
     * Soma o tempo informado ao tempo online já dedicado à disciplina.
     *
     * @param tempo o tempo a adicionar, em horas
     */
    public void adicionaTempoOnline(int tempo) {
        this.tempoOnlineUsado += tempo;
    }

    /**
     * Verifica se o tempo online dedicado é maior ou igual ao tempo esperado.
     *
     * @return true se a meta foi atingida, false caso contrário
     */
    public boolean atingiuMetaTempoOnline() {
        return this.tempoOnlineUsado >= this.tempoOnlineEsperado;
    }

    /**
     * Retorna a representação textual do registro, no formato
     * "DISCIPLINA TEMPO_USADO/TEMPO_ESPERADO".
     *
     * @return a representação textual do registro
     */
    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.tempoOnlineUsado + "/" + this.tempoOnlineEsperado;
    }
}
