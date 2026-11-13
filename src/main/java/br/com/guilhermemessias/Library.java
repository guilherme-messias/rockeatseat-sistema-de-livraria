package br.com.guilhermemessias;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Author> authors = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

    public Library() {
        Author machado = new Author("Machado de Assis", LocalDate.of(1839, 6, 21));
        Author clarice = new Author("Clarice Lispector", LocalDate.of(1920, 12, 10));
        Author george = new Author("George Orwell", LocalDate.of(1903, 6, 25));

        List<Author> authors = new ArrayList<>();
        authors.add(machado);
        authors.add(clarice);
        authors.add(george);
        this.setAuthors(authors);

        Book domCasmurro = new Book("Dom Casmurro", machado, true);
        Book memoriasPostumas = new Book("Memórias Póstumas de Brás Cubas", machado, true);
        Book horaDaEstrela = new Book("A Hora da Estrela", clarice, true);
        Book livro1984 = new Book("1984", george, true);
        Book revolucaoDosBichos = new Book("A Revolução dos Bichos", george, true);

        List<Book> books = new ArrayList<>();
        books.add(domCasmurro);
        books.add(memoriasPostumas);
        books.add(horaDaEstrela);
        books.add(livro1984);
        books.add(revolucaoDosBichos);
        this.setBooks(books);
    }

    public List<Book> getBooks() {
        return books;
    }

    private void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    private void setLoans(List<Loan> loans) {
        this.loans = loans;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    private void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
