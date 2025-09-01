
public class Aluno {
    // Atributos privados da classe
    private String nome;
    private int idade;
    private String matricula;

    // Construtor para inicializar os atributos
    public Aluno(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    // Métodos Getters e Setters para acessar e modificar os atributos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Método toString() para retornar uma representação em string do objeto
    @Override
    public String toString() {
        return "Aluno{" +
               "nome='" + nome + '\'' +
               ", idade=" + idade +
               ", matricula='" + matricula + '\'' +
               '}';
    }
}
