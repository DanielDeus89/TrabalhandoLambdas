package atividade04;

import javax.swing.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String name = sc.nextLine();

        Palindromo palindromo = Str -> name.contentEquals(new StringBuilder(Str).reverse());

        System.out.println(palindromo.verificarPalindromo(name));
    }
}
