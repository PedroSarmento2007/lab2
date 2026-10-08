package lab2;

/**
 * Registra os resumos de estudo de um aluno. Cada resumo tem um tema e um
 * conteúdo. O registro tem capacidade fixa: quando está cheio, um novo resumo
 * substitui os mais antigos.
 *
 * @author Pedro Sarmento
 */
public class RegistroResumos {
    /**
     * Capacidade máxima de resumos do registro.
     */
    private int numeroDeResumos;

    /**
     * Array de objetos de Resumo.
     */
    private Resumo[] resumos;

    /**
     * Quantidade de resumos atual.
     */

    private int quantidadeAtual;

    /**
     * Índice do próximo resumo a ser cadastrado.
     */
    private int proximoIndice;


    /**
     * Constrói um registro de resumos vazio, com a capacidade informada.
     *
     * @param numeroDeResumos a quantidade máxima de resumos do registro
     */
    public RegistroResumos(int numeroDeResumos) {
        this.numeroDeResumos = numeroDeResumos;
        this.resumos = new Resumo[numeroDeResumos];
    }

    /**
     * Adiciona um resumo ao registro. Se já existir um resumo com o mesmo
     * tema, nada é feito. Se o registro estiver cheio, o novo resumo substitui
     * os mais antigos, a partir da primeira posição.
     *
     * @param tema o tema do resumo
     * @param conteudo o conteúdo do resumo
     */
    public void adiciona (String tema, String conteudo) {
        if (!temResumo(tema)) {
            this.resumos[this.proximoIndice] = new Resumo(tema, conteudo);
            this.proximoIndice++;
            if (this.quantidadeAtual < this.numeroDeResumos) {
                this.quantidadeAtual++;
            }
        }
        if (this.proximoIndice > this.numeroDeResumos - 1) {
            this.proximoIndice = 0;
        }
    }

    /**
     * Retorna os resumos cadastrados, cada um no formato "TEMA: CONTEUDO".
     *
     * @return um array com a representação textual de cada resumo cadastrado
     */
    public String[] pegaResumos() {
        String[] out = new String[conta()];
        for (int i = 0; i < conta(); i++) {
            out[i] = this.resumos[i].toString();
        }
        return out;
    }

    /**
     * Retorna a quantidade de resumos cadastrados no momento.
     *
     * @return a quantidade de resumos cadastrados
     */
    public int conta() {
        return quantidadeAtual;
    }

    /**
     * Verifica se existe um resumo cadastrado com o tema informado.
     *
     * @param tema o tema procurado
     * @return true se existe um resumo com esse tema, false caso contrário
     */
    public boolean temResumo(String tema) {
        for (int i = 0; i < conta(); i++) {
            if (this.resumos[i].getTema().equals(tema)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Retorna um texto com a quantidade de resumos cadastrados e a lista dos
     * temas, separados por " | ".
     *
     * @return o texto com a quantidade de resumos e os temas cadastrados
     */
    public String imprimeResumos() {
        String out = "- ";
        for (int i = 0; i < conta(); i++) {
            if (i == 0) {
                out += this.resumos[i].getTema();
            }
            else {
                out += " | " + this.resumos[i].getTema();
            }
        }
        return "- " + conta() + " resumo(s) cadastrado(s)\n" + out;
    }

}
