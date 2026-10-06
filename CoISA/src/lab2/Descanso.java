package lab2;

/**
 * Rotina de descanso de um aluno. A partir das horas de descanso
 * e do número de semanas informados, retorna  se o aluno está cansado ou descansado.
 * 
 * @author Pedro Sarmento
 */
public class Descanso {
    /**
     * Quantidade mínima de horas de descanso por semana para o aluno ser considerado descansado.
     */
    private static final int HORAS_MINIMAS_POR_SEMANA = 26;

    /**
     * Total de horas de descanso do aluno.
     */
    private int horasDescanso;

    /**
     * Número total de semanas.
     */
    private int numeroSemanas;


    /**
     * Construtor de Descanso sem horas registradas e com uma semana.
     */
    public Descanso() {
        this.horasDescanso = 0;
        this.numeroSemanas = 1;
    }

    /**
     * Define o total de horas de descanso do aluno.
     * 
     * @param valor o total de horas de descanso
     */
    public void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;
    }

    /**
     * Define o número total de semanas. Valores menores ou iguais a
     * zero são ignorados e o número de semanas anterior é mantido.
     * 
     * @param valor o número total de semanas
     */
    public void defineNumeroSemanas(int valor) {
        if(valor > 0){this.numeroSemanas = valor;}
    }

    /**
     * Retorna o status do aluno, se ele está cansado ou descansado.
     * 
     * @return "cansado" se o aluno não atingiu a quantidade mínima de horas de descanso por semana,
     *  "descansado" caso contrário.
     */
    public String getStatusGeral() {
        String out = "cansado";
        if (this.horasDescanso / this.numeroSemanas >= HORAS_MINIMAS_POR_SEMANA) {
            out = "descansado";
        }
        return out;
    }
}
