public class Livro {

    // Atributos privados
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    // --- Construtor ---
    /**
     * Construtor para criar um novo Livro.
     * Por padrão, o atributo 'disponivel' é setado como 'true'.
     *
     * @param titulo O título do livro.
     * @param autor O autor do livro.
     * @param anoPublicacao O ano em que o livro foi publicado.
     */
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        // Atributo 'disponivel' é true por padrão, conforme solicitado
        this.disponivel = true;
    }

    // --- Getters e Setters ---

    // Getter para 'titulo'
    public String getTitulo() {
        return titulo;
    }

    // Setter para 'titulo'
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getter para 'autor'
    public String getAutor() {
        return autor;
    }

    // Setter para 'autor'
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Getter para 'anoPublicacao'
    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    // Setter para 'anoPublicacao'
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    // Getter para 'disponivel'
    // Por convenção, para booleanos, o getter geralmente é nomeado como 'isAtributo'
    public boolean isDisponivel() {
        return disponivel;
    }

    // Setter para 'disponivel'
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    // --- Método de Exemplo (Opcional, mas útil para testes) ---
    /**
     * Retorna uma representação em String do objeto Livro.
     */
    @Override
    public String toString() {
        return "Livro{" +
               "titulo='" + titulo + '\'' +
               ", autor='" + autor + '\'' +
               ", anoPublicacao=" + anoPublicacao +
               ", disponivel=" + disponivel +
               '}';
    }
}