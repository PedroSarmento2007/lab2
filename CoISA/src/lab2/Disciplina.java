package lab2;
import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[4];
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
        return acum / 4.0;
    }
    public boolean aprovado() {
        if (calculaMedia() >= 7) {
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.horasEstudo + " " + calculaMedia() + " " + Arrays.toString(notas);
    }
}
