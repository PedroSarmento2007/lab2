package lab2;

public class Descanso {
    private int horasDescanso;
    private int numeroSemanas;

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
