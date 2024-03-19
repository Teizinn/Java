package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Computador c1 = new Computador();
        Computador c2 = new Computador();

        System.out.println("Digite a marca do primeiro computador: ");
        c1.marca = scanner.nextLine();

        System.out.println("Digite o modelo do primeiro computador: ");
        c1.modelo = scanner.nextLine();

        System.out.println("Digite o tipo do primeiro computador: (notebook, netbook, desktop, etc)");
        c1.tipo = scanner.nextLine();

        System.out.println("Digite o preço do primeiro computador: ");
        c1.preco = scanner.nextDouble();

        c2.marca = "dell";
        c2.modelo = "g15";
        c2.tipo = "notebook";
        c2.preco = 2499.99;

        System.out.println("Computador 1: " +c1.marca +" " +c1.modelo +" " +c1.tipo +" " +c1.preco);
        System.out.println("Computador 2: " +c2.marca +" " +c2.modelo +" " +c2.tipo +" " +c2.preco);

        scanner.close();
    }
}
