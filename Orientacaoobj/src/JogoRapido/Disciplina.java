package JogoRapido;

import java.util.Scanner;

public class Disciplina {
    public static void main(String[] args) {

        Scanner scanner = new Scanner("System.in");

        Professor p = new Professor();

        System.out.print("Digite o nome do Professor: ");
        p.nome = scanner.nextLine();
        Laboratorio l = new Laboratorio();
        l.local = scanner.nextLine();

        System.out.println("Nome do professor é: " + p.nome);
        System.out.println("Local da aula é: " + l.local);
    }
}
