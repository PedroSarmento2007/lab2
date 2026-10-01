package lab2;

public class Descanso {
    private int horasDescanso;
    private int numeroSemanas;

    public Descanso() {
        this.numeroSemanas = 1;
    }

    public void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;
    }

    public void defineNumeroSemanas(int valor) {
        this.numeroSemanas = valor;
    }
    public String getStatusGeral() {
        String out = "cansado";
        if (this.horasDescanso / this.numeroSemanas >= 26) {
            out = "descansado";
        }
        return out;
    }
}
