package org.example;
import java.lang.Math;
public class Calculator {
    public double soma(double n1, double n2) {
        return n1 + n2;
    }
    public double subtracao(double n1, double n2){
        return n1 - n2;
    }
    public double multiplicacao(double n1, double n2){
        return n1*n2;
    }
    public double divisao(double n1, double n2) {
        if(n2==0){
            throw new ArithmeticException("Não pode dividir por 0 animal <3");
        }
        return n1 / n2;
    }
    public double Raiz(double n1, double n2){
        
    }
    public double potencia (double n1, double n2){
        return Math.pow(n1,n2);
    }
}
