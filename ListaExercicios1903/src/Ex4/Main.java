package Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Livro l = new Livro();

        System.out.println("Digite o titulo do livro: ");
        l.titulo = scanner.nextLine();

        System.out.println("Digite o autor do livro: ");
        l.autor = scanner.nextLine();

        System.out.println("Digite o ano de publicação do livro: ");
        l.anoPublicacao = scanner.nextInt();

        System.out.println("Livro: " +l.titulo +" " +l.autor +" " + l.anoPublicacao);
    }
}
