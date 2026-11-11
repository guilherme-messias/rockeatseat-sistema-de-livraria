package br.com.guilhermemessias;

import java.util.Scanner;
import java.util.UUID;

public class Menu {
    public static void displayMenu(Library library) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Deseja visualizar os livros disponíveis?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");

            option = scanner.nextInt();

            switch (option) {

                case 1: {
                    System.out.println("Livros disponíveis:");

                    for (Book book : library.getBooks()) {
                        if (book.isAvailable()) {
                            System.out.printf(
                                    "Id: %s, Título: %s, Autor: %s%n",
                                    book.getId(),
                                    book.getTitle(),
                                    book.getAuthor().getName()
                            );
                        }
                    }
                    displayLoanMenu(library, scanner);
                    break;
                }

                case 2: {
                    System.out.println("Saindo do sistema...");
                    break;
                }

                default: {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            }
        } while (option != 2);

        scanner.close();
    }

    private static void displayLoanMenu(Library library, Scanner scanner) {
        int option;

        do {
            System.out.println("Menu de Empréstimos:");
            System.out.println("1 - Realizar Empréstimo");
            System.out.println("2 - Devolver Livro");
            System.out.println("3 - Listar Livros Emprestados");
            System.out.println("4 - Voltar ao Menu Principal");

            option = scanner.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("Realizar Empréstimo:");
                    System.out.println("Informe o id do livro que deseja emprestar:");

                    String bookIdInput = scanner.next();
                    UUID bookId = UUID.fromString(bookIdInput);

                    for (Book book : library.getBooks()) {
                        if (book.getId().equals(bookId)) {
                            if (book.isAvailable()) {
                                System.out.println("Informe o nome do cliente:");
                                String clientName = scanner.next();

                                Loan loan = new Loan();
                                loan.setBook(book);
                                loan.setClientName(clientName);
                                loan.setLoanDate(java.time.Instant.now());
                                library.getLoans().add(loan);

                                book.setAvailable(false);
                                System.out.println("Empréstimo realizado com sucesso!");
                            } else {
                                System.out.println("Livro indisponível para empréstimo.");
                            }
                            break;
                        }
                    }


                    break;
                }
                case 2: {
                    System.out.println("Devolver Empréstimo:");
                    System.out.println("Informe o id do livro que deseja devolver:");

                    String bookIdInput = scanner.next();
                    UUID bookId = UUID.fromString(bookIdInput);

                    for (Loan loan : library.getLoans()) {
                        if (loan.getBook().getId().equals(bookId)) {
                            loan.setReturnDate(java.time.Instant.now());
                            loan.getBook().setAvailable(true);
                            library.getLoans().remove(loan);
                            System.out.println("Livro devolvido com sucesso!");
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("Livros emprestados:");

                    for (Loan loan : library.getLoans()) {
                        System.out.printf(
                                "Id: %s, Título: %s, Autor: %s%n",
                                loan.getBook().getId(),
                                loan.getBook().getTitle(),
                                loan.getBook().getAuthor().getName()
                        );
                    }
                    break;
                }
                case 4: {
                    System.out.println("Voltando ao menu principal...");
                    break;
                }
                default: {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            }

        } while (option != 4);

    }
}