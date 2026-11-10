package br.com.guilhermemessias;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

        Menu menu = new Menu();
        menu.displayMenu(library);
    }
}