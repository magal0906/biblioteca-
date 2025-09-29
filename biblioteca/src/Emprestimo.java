public class Emprestimo {

    // Atributos privados
    private Aluno aluno; // Assume que a classe Aluno existe
    private Livro livro;
    private String dataEmprestimo;
    private String dataDevolucao;

    // --- Construtor ---
    /**
     * Construtor para criar um novo Empréstimo.
     *
     * @param aluno O Aluno que está realizando o empréstimo.
     * @param livro O Livro que está sendo emprestado.
     * @param dataEmprestimo A data em que o empréstimo foi realizado.
     */
    public Emprestimo(Aluno aluno, Livro livro, String dataEmprestimo) {
        this.aluno = aluno;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        // A dataDevolucao é inicialmente nula (ou pode ser uma String vazia)
        // pois o livro ainda não foi devolvido.
        this.dataDevolucao = null; 

        // BOA PRÁTICA: Se o livro foi emprestado, ele não está mais 'disponivel'.
        // Se a classe Livro for a que criamos, isso funciona.
        if (livro != null) {
            livro.setDisponivel(false);
        }
    }

    // --- Getters e Setters ---

    // Getter para 'aluno'
    public Aluno getAluno() {
        return aluno;
    }

    // Setter para 'aluno'
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    // Getter para 'livro'
    public Livro getLivro() {
        return livro;
    }

    // Setter para 'livro'
    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    // Getter para 'dataEmprestimo'
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    // Setter para 'dataEmprestimo'
    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    // Getter para 'dataDevolucao'
    public String getDataDevolucao() {
        return dataDevolucao;
    }

    // Setter para 'dataDevolucao'
    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
        
        // BOA PRÁTICA: Quando a data de devolução é setada (o livro é devolvido),
        // o livro deve voltar a estar 'disponivel'.
        if (this.livro != null) {
            this.livro.setDisponivel(true);
        }
    }

    // --- Método toString() ---
    /**
     * Retorna uma representação em String do Empréstimo, 
     * mostrando quem pegou qual livro e quando.
     */
    @Override
    public String toString() {
        String infoAluno = (aluno != null) ? aluno.getNome() : "Aluno Desconhecido";
        String infoLivro = (livro != null) ? livro.getTitulo() : "Livro Desconhecido";
        
        return "REGISTRO DE EMPRÉSTIMO:\n" +
               "  -> Livro: '" + infoLivro + "'\n" +
               "  -> Aluno: " + infoAluno + "\n" +
               "  -> Data do Empréstimo: " + dataEmprestimo + "\n" +
               "  -> Devolução: " + (dataDevolucao != null ? dataDevolucao : "PENDENTE");
    }
}
