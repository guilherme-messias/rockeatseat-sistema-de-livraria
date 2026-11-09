package br.com.guilhermemessias;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        System.out.printf(
                "Sistema de livraria iniciado. Livros: %d, autores: %d, empréstimos: %d%n",
                library.getBooks().size(),
                library.getAuthors().size(),
                library.getLoans().size()
        );
    }
}