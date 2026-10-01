package lab2;

public class RegistroResumos {
    private int numeroDeResumos;
    private String[] temas;
    private String[] conteudos;
    private int quantidadeAtual;
    private int proximoIndice;

    public RegistroResumos(int numeroDeResumos) {
        this.temas = new String[numeroDeResumos];
        this.conteudos = new String[numeroDeResumos];
        this.proximoIndice = 0;
        this.quantidadeAtual = 0;
    }
    public void adiciona (String tema, String conteudo) {
        if (!temResumo(tema)) {
            this.temas[this.proximoIndice] = tema;
            this.conteudos[this.proximoIndice] = conteudo;
            this.proximoIndice++;
            this.quantidadeAtual++;
        }
        if (this.proximoIndice > this.numeroDeResumos - 1) {
            this.proximoIndice = 0;
        }
    }
    public String[] pegaResumos() {
        String[] out = new String[conta()];
        for (int i = 0; i < conta(); i++) {
            out[i] = this.temas[i] + ": " + this.conteudos[i];
        }
        return out;
    }
    public int conta() {
        return quantidadeAtual;
    }
    public boolean temResumo(String tema) {
        for (int i = 0; i < conta(); i++) {
            if (this.temas[i].equals(tema)) {
                return true;
            }
        }
        return false;
    }
    public String imprimeResumos() {
        String out = "- ";
        for (int i = 0; i < conta(); i++) {
            if (i == 0) {
                out += this.temas[i];
            }
            else {
                out += " | " + this.temas[i];
            }
        }
        return "- " + conta() + " resumos(s) cadastrado(s)\n" + out;
    }
}
