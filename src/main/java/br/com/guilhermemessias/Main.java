package br.com.guilhermemessias;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Menu menu = new Menu();
        menu.displayMenu(library);
    }
}