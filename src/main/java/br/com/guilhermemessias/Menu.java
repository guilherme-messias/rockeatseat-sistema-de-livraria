package br.com.guilhermemessias;

import java.util.Scanner;

public class Menu {
    public static void displayMenu(Library library) {
        Scanner scanner = new Scanner(System.in);
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
