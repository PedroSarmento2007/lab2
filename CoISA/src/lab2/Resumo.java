package lab2;

/**
 * Registra o resumo de estudo de um aluno. O resumo tem um tema e um
 * conteúdo.
 *
 * @author Pedro Sarmento
 */
public class Resumo {
    /**
     * Tema dos resumo.
     */
    private String tema;

    /**
     * Conteúdo dos resumo.
     */
    private String conteudo;


    /**
     * Constrói resumos com tema e conteudo.
     *
     * @param tema Tema do resumo
     * @param conteudo Tema do resumo
     */
    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    /**
     * Retorna o tema do resumo.
     *
     * @return uma string com o tema do resumo
     */
    public String getTema() {
        return this.tema;
    }

    /**
     * Retorna o conteudo do resumo.
     *
     * @return uma string com o conteúdo do resumo
     */
    public String getConteudo() {
        return this.conteudo;
    }

    /**
     * Retorna o toString do resumo.
     *
     * @return uma string com o tema e conteúdo do resumo no formato "TEMA: CONTEÚDO"
     */
    @Override
    public String toString() {
        return this.tema + ": " + this.conteudo;
    }
}
