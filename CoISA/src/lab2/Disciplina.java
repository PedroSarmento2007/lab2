package lab2;
import java.util.Arrays;

public class Disciplina {
    private static final int MEDIA_DE_APROVACAO = 7;
    private static final int QUANT_NOTAS = 4;
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[QUANT_NOTAS];
    }
    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }
    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota-1] = valorNota;
    }
    public double calculaMedia() {
        double acum = 0;
        for (double num : notas) {
            acum += num;
        }
        return acum / QUANT_NOTAS;
    }
    public boolean aprovado() {
        return calculaMedia() >= MEDIA_DE_APROVACAO;
    }
    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.horasEstudo + " " + calculaMedia() + " " + Arrays.toString(notas);
    }
}
