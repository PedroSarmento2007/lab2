package lab2;

public class Descanso {
    private static final int HORAS_MINIMAS_POR_SEMANA = 26;
    private int horasDescanso;
    private int numeroSemanas;

    public Descanso() {
        this.horasDescanso = 0;
        this.numeroSemanas = 1;
    }

    public void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;
    }

    public void defineNumeroSemanas(int valor) {
        if(valor > 0){this.numeroSemanas = valor;}
    }
    public String getStatusGeral() {
        String out = "cansado";
        if (this.horasDescanso / this.numeroSemanas >= HORAS_MINIMAS_POR_SEMANA) {
            out = "descansado";
        }
        return out;
    }
}
