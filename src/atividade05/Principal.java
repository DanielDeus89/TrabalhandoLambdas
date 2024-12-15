package atividade05;

import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numeros.replaceAll(num -> num * 2);
        System.out.println(numeros);
    }
}
