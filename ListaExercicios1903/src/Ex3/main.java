package Ex3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.println("Digite o nome da pessoa: ");
        p.nome = scanner.nextLine();

        System.out.println("Digite a idade da pessoa: ");
        p.idade = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o gênero da pessoa: ");
        p.genero = scanner.nextLine();

        System.out.println("Pessoa: " +p.nome +" " +p.idade +" " +p.genero);

        scanner.close();
    }
}
