public class App {
    public static void main(String[] args) {
        // Criando o objeto Aluno
        Aluno maria = new Aluno("Maria", 17, "A123");

        // Criando o objeto Livro
        Livro domCasmurro = new Livro("Dom Casmurro", "Machado de Assis", 1899);

        // Exibindo as informações iniciais
        System.out.println("Informações iniciais:");
        System.out.println(maria);
        System.out.println(domCasmurro);

        // Alterando as informações do aluno e do livro
        maria.setIdade(18); // Alterando a idade da Maria
        domCasmurro.setTitulo("Memórias Póstumas de Brás Cubas"); // Alterando o título do livro

        // Exibindo as informações após as alterações
        System.out.println("\nInformações após as alterações:");
        System.out.println(maria);
        System.out.println(domCasmurro);
    }
}

