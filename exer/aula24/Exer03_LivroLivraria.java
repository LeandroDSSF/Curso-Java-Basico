package exer.aula24;

public class Exer03_LivroLivraria {
    public static void main(String[] args) {

        LivroLivraria livroLivraria = new LivroLivraria();

        livroLivraria.nome = "João";
        livroLivraria.precoLivro = 45.65;

        System.out.println("Nome do livro usando o Extends" + livroLivraria.nome);
        System.out.println("Preço do livro " + livroLivraria.precoLivro);
    }

}
