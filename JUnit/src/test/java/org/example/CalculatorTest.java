package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void doisMaisDoisIgualaQuatro() {
        var bruno = new Calculator();
        assertEquals(4, bruno.soma(2, 2));
    }
    @Test
    void doiseMeioMaisDoiseMeioIgualaCinco() {
        var bruno = new Calculator();
        assertEquals(5, bruno.soma(2.5, 2.5));
    }
    @Test
    void doisMaisMenosCincoIgualaMenos3() {
        var bruno = new Calculator();
        assertEquals(-3, bruno.soma(2, -5));
    }
    @Test
    void dezMaisDoiseMeioIgualaDozeeMeio() {
        var bruno = new Calculator();
        assertEquals(12.5, bruno.soma(10, 2.5));
    }
    @Test
    void doisMenosTresIgualaUm() {
        var bruno = new Calculator();
        assertEquals(-1, bruno.subtracao(2, 3));
    }
    @Test
    void doisMenosDoiseMeioIgualaMeio() {
        var bruno = new Calculator();
        assertEquals(-0.5, bruno.subtracao(2, 2.5));
    }
    @Test
    void cincoeDoisMenosDoiseDoisIgualaTres() {
        var bruno = new Calculator();
        assertEquals(3, bruno.subtracao(5.2, 2.2));
    }
    @Test
    void menosTresMenosMenosDoisIgualaCinco() {
        var bruno = new Calculator();
        assertEquals(5, bruno.subtracao(3, -2));
    }
    @Test
    void quatroDivididoPorDoisIgualaDois(){
        var bruno = new Calculator();
        assertEquals(2, bruno.divisao(4, 2));
    }
    @Test
    void cincoDivididoPorDoisIgualaDoiseMeio(){
        var bruno = new Calculator();
        assertEquals(2.5, bruno.divisao(5, 2));
    }
    @Test
    void menosNoveDivididoPorTresIgualaMenosTres(){
        var bruno = new Calculator();
        assertEquals(-3, bruno.divisao(-9, 3));
    }
    @Test
    void dezDivididoPorTresIgualaDizimadeTres(){
        var bruno = new Calculator();
        assertEquals((double)10/3, bruno.divisao(10, 3));
    }
    @Test
    void dezDivididoPorZeroIgualaException(){
        var bruno = new Calculator();
        assertThrows(ArithmeticException.class,() -> bruno.divisao(10, 0));
    }
    @Test
    void doisVezesSeisIgualaDoze(){
        var bruno = new Calculator();
        assertEquals(12, bruno.multiplicacao(2, 6));
    }
    @Test
    void tresVezesMenosTresIgualaMenosNove(){
        var bruno = new Calculator();
        assertEquals(-9, bruno.multiplicacao(3, -3));
    }
    @Test
    void tresVezesTresVirgulaTresIgualaNovaViruglaNove(){
        var bruno = new Calculator();
        assertEquals(3*3.3, bruno.multiplicacao(3, 3.3));
    }
}
