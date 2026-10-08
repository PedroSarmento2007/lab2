package lab2;
import java.util.Arrays;

/**
 * Representa uma disciplina cursada por um aluno. Guarda as horas de estudo
 * e as quatro notas da disciplina, calcula a média e indica se o aluno foi
 * aprovado.
 *
 * @author Pedro Sarmento
 */
public class Disciplina {

    /**
     * Média mínima para o aluno ser aprovado na disciplina.
     */
    private static final int MEDIA_DE_APROVACAO = 7;

    /**
     * Quantidade de notas da disciplina.
     */
    private static final int QUANT_NOTAS_PADRAO = 4;

    /**
     * Nome da disciplina.
     */
    private String nomeDisciplina;

    /**
     * Total de horas de estudo dedicadas à disciplina.
     */
    private int horasEstudo;

    /**
     * Notas da disciplina em array.
     */
    private double[] notas;

    /**
     * Pesos das notas em array.
     */
    private int[] pesos;

    /**
     * Constrói uma disciplina a partir do nome, sem horas de estudo e com
     * todas as notas iguais a zero.
     *
     * @param nomeDisciplina o nome da disciplina
     */
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[QUANT_NOTAS_PADRAO];
        this.pesos= new int[]{1, 1, 1, 1};
    }

    /**
     * Constrói uma disciplina a partir do nome, sem horas de estudo e quantidade de
     * notas dada pelo usuário.
     *
     * @param nomeDisciplina o nome da disciplina
     */
    public Disciplina(String nomeDisciplina,int quantNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[quantNotas];
        this.pesos = new int[quantNotas];
        for (int i = 0; i < quantNotas; i++) {
            this.pesos[i] = 1;
        }
    }

    /**
     * Constrói uma disciplina a partir do nome, sem horas de estudo, quantidade de
     * notas dada pelo usuário e pesos.
     *
     * @param nomeDisciplina o nome da disciplina
     */
    public Disciplina(String nomeDisciplina,int quantNotas, int[] pesos) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[quantNotas];
        if (pesos != null) {
            this.pesos = pesos.clone();
        }
    }

    /**
     * Soma as horas informadas ao total de horas de estudo da disciplina.
     *
     * @param horas as horas de estudo a adicionar
     */
    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    /**
     * Cadastra a nota informada na posição correspondente do array de notas.
     *
     * @param nota o número da nota (1 a 4)
     * @param valorNota o valor da nota
     */
    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota-1] = valorNota;
    }

    /**
     * Calcula a média aritmética ou penderada das notas.
     *
     * @return a média das notas
     */
    public double calculaMedia() {
        double acum = 0;
        double divisor = 0;
        for (int i = 0; i < notas.length; i++) {
            acum += notas[i] * pesos[i];
            divisor += this.pesos[i];
        }
        return acum / divisor;
    }

    /**
     * Verifica se o aluno foi aprovado, ou seja, se a média das notas é maior
     * ou igual a nota mínima de aprovação.
     *
     * @return true se o aluno foi aprovado, false caso contrário
     */
    public boolean aprovado() {
        return calculaMedia() >= MEDIA_DE_APROVACAO;
    }

    /**
     * Retorna a representação textual da disciplina, no formato
     * "NOME HORAS MEDIA [NOTAS]".
     *
     * @return a representação textual da disciplina
     */
    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.horasEstudo + " " + calculaMedia() + " " + Arrays.toString(notas);
    }
}
