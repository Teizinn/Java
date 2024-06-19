package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator bruno = new Calculator();
        double resultado = 0;

        System.out.println("Digite o primeiro numero: ");
        double n1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double n2 = scanner.nextDouble();

        System.out.println("Escolha uma das opções: (1-soma, 2-subtração, 3-multiplicação, 4-Divisão");
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                resultado = bruno.soma(n1, n2);
                System.out.println("O resultado da soma é: " + resultado);
                break;
            case 2:
                resultado = bruno.subtracao(n1, n2);
                System.out.println("O resultado da subtração é: " + resultado);
                break;
            case 3:
                resultado = bruno.multiplicacao(n1, n2);
                System.out.println("O resultado da multiplicação é: " + resultado);
                break;
            case 4:
                resultado = bruno.divisao(n1, n2);
                System.out.println("O resultado da divisão é: " + resultado);
                break;
            default:
                System.out.println("Digite um número valido :3");
                break;
        }
    }
}