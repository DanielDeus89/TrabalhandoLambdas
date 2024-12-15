
/*
3 - Crie uma função lambda que receba uma string e a converta para letras maiúsculas.
 */

package atividade03;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o nome:  ");
        String nome = sc.nextLine();

        ConversorString conversorString = (texto -> texto.toUpperCase());

        String resultado = conversorString.converte(nome);
        System.out.println(resultado);
    }
}
