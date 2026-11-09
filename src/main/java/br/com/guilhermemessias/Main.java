package br.com.guilhermemessias;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Library library = new Library();

        Author machado = new Author("Machado de Assis", LocalDate.of(1839, 6, 21));
        Author clarice = new Author("Clarice Lispector", LocalDate.of(1920, 12, 10));
        Author george = new Author("George Orwell", LocalDate.of(1903, 6, 25));

        List<Author> authors = new ArrayList<>();
        authors.add(machado);
        authors.add(clarice);
        authors.add(george);
        library.setAuthors(authors);

        Book domCasmurro = new Book("Dom Casmurro", machado, true);
        Book memoriasPostumas = new Book("Memórias Póstumas de Brás Cubas", machado, false);
        Book horaDaEstrela = new Book("A Hora da Estrela", clarice, true);
        Book livro1984 = new Book("1984", george, true);
        Book revolucaoDosBichos = new Book("A Revolução dos Bichos", george, false);

        List<Book> books = new ArrayList<>();
        books.add(domCasmurro);
        books.add(memoriasPostumas);
        books.add(horaDaEstrela);
        books.add(livro1984);
        books.add(revolucaoDosBichos);
        library.setBooks(books);

        int option;

        do {
            System.out.println("Deseja visualizar os livros disponíveis?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");

            option = scanner.nextInt();

            if (option == 1) {
                System.out.println("Livros disponíveis:");

                for (Book book : library.getBooks()) {
                    if (book.isAvailable()) {
                        System.out.printf(
                                "Título: %s, Autor: %s%n",
                                book.getTitle(),
                                book.getAuthor().getName()
                        );
                    }
                }
            } else if (option == 2) {
                System.out.println("Saindo do sistema...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (option != 2);

        scanner.close();
    }
}