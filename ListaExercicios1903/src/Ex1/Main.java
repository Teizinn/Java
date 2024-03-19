package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        System.out.println("Digite a marca do primeiro carro: ");
        c1.marca = scanner.nextLine();

        System.out.println("Digite o modelo do primeiro carro: ");
        c1.modelo = scanner.nextLine();

        System.out.println("Digite o ano de fabricação do primeiro carro: ");
        c1.anoFabricacao = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite a marca do segundo carro: ");
        c2.marca = scanner.nextLine();

        System.out.println("Digite o modelo do segundo carro: ");
        c2.modelo = scanner.nextLine();

        System.out.println("Digite o ano de fabricação do segundo carro: ");
        c2.anoFabricacao = scanner.nextInt();


        System.out.println("Carro 1: " +c1.marca +" " +c1.modelo +" " +c1.anoFabricacao);
        System.out.println("Carro 2: " +c2.marca +" " +c2.modelo +" " +c2.anoFabricacao);

        scanner.close();
    }
}
