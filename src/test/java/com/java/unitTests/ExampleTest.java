package com.java.unitTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class ExampleTest {

    private Example example;

    @BeforeEach
    public void init(){
        this.example = new Example();
    }

    @Test
    void sumar() {
        // Given - teniendo
        int numberA = 3;
        int numberB = 2;

        // When - cuando
        int result = example.sumar(numberA,numberB);

        // Then - entonces
        assertNotNull(result);
        assertEquals(numberA+numberB,result);
        assertInstanceOf(Integer.class,result);

    }

    @Test
    void checkPositivo() {

        // GIVEN
        int numberA = 3;
        // WHEN
        boolean bool = example.checkPositivo(numberA);

        // THEN
        assertTrue(bool);

    }

    @Test
    void checkPositivoError(){
        int numberA = -3;

        assertThrows(IllegalArgumentException.class, ()->{
            example.checkPositivo(numberA);
        });
    }

    @Test
    void contarLetrasA() {

        String string = "Hola como estas";

        int count = example.contarLetrasA(string);

        assertEquals(2, count);
        assertInstanceOf(Integer.class,count);
    }

    @Test
    void contieneElemento() {
        List<String> list = Arrays.asList("Hola","Que","Tal");

        boolean bool = example.contieneElemento(list,"Hola");

        assertTrue(bool);
    }

    @Test
    void revertirCadena() {

        String string = "Hola como estas";

        String reversed = example.revertirCadena(string);

        assertEquals("satse omoc aloH",reversed);
        assertInstanceOf(String.class,reversed);

    }

    @Test
    void factorial() {
        int numberA = 3;

        long result = example.factorial(numberA);
        assertEquals(6,result);
    }

    @Test
    void factorialError(){
        int numberA = -3;

        assertThrows(IllegalArgumentException.class, ()->{
            example.factorial(numberA);
        });
    }

    @Test
    void esPrimo() {
        int numberA = 5;

        boolean bool = example.esPrimo(numberA);
        assertTrue(bool);

    }

    @Test
    void esPrimoErrorMenorQueUno(){
        int numberA = -3;

        assertFalse(example.esPrimo(numberA));
    }

    @Test
    void noEsPrimo(){
        int numberA = 8;
        boolean bool = example.esPrimo(numberA);
        assertFalse(bool);
    }

    @Test
    void mensajeConRetraso() throws InterruptedException {

        String result = this.example.mensajeConRetraso();

        assertNotNull(result);
        assertEquals("Listo después de retraso",result);

    }

    @Test
    void convertirAString() {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        List<String> result = example.convertirAString(list);

        assertNotNull(result);
        assertInstanceOf(List.class,result);

    }

    @Test
    void calcularMedia() {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        double result = this.example.calcularMedia(list);
        assertNotNull(list);

    }

    @Test
    void calcularMediaNull(){
        List<Integer> list = null;

        assertThrows(IllegalArgumentException.class, ()->{
            double result = this.example.calcularMedia(list);
            assertEquals(null,result);
        });
    }

    @Test
    void calcularMediaEmpty(){
        List<Integer> list = Collections.emptyList();

        assertThrows(IllegalArgumentException.class, ()->{
            double result = this.example.calcularMedia(list);

        });
    }

    @Test
    void convertirListaAString() {

        List<String> list = Arrays.asList("1","2","3","4","5");

        String result = this.example.convertirListaAString(list);
        assertNotNull(result);
        assertInstanceOf(String.class,result);


    }
}