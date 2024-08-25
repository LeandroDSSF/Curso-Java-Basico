package exer.aula24;

import java.util.Date;

public class Exer04_LivroDeBiblioteca {
    public static void main(String[] args) {
        LivroDeBiblioteca livroBiblioteca = new LivroDeBiblioteca();

        livroBiblioteca.autor = "Maria V1";
        livroBiblioteca.dataEntrega = new Date();
        livroBiblioteca.emmprestadoA = "Pedro";

        System.out.println("Livro de Biblioteca Extends Livro " + livroBiblioteca.autor);
        System.out.println("Livro de Biblioteca Data " + livroBiblioteca.dataEntrega);
        System.out.println("Livro de Biblioteca Emprestado " + livroBiblioteca.emmprestadoA);
    }

}
