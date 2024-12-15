package atividade01;

/*
1 - Crie uma expressão lambda que multiplique dois números inteiros.
A expressão deve ser implementada dentro de uma interface funcional com o método multiplicacao(int a, int b).
 */

public class Principal {
    public static void main(String[] args) {
       Multiplicar multiplicar = (a, b) -> (a*b);

       System.out.print(multiplicar.multiplicacao(7,8));
    }
}
