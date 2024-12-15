package atividade02;
/*
2 - Implemente uma expressão lambda que verifique se um número é primo.
 */
public class Principal {
    public static void main(String[] args) {
        Primo primo = (a) ->{
            if (a <= 1) return 0;
            for (int i = 2; i<= Math.sqrt(a); i++) {
                if (a%i == 0) return 0;
            }
            return 1;
        };

        int numero1 = 7;
        int numero2 = 6;
        int numero3 = 4;

        System.out.println("Numero " + numero1 + " é primor " + (primo.verificarPrimo(numero1) == 1 ? "Sim" : "Nao"));
        System.out.println("Numero " + numero2 + " é primor " + (primo.verificarPrimo(numero2) == 1 ? "Sim" : "Nao"));
        System.out.println("Numero " + numero3 + " é primor " + (primo.verificarPrimo(numero3) == 1 ? "Sim" : "Nao"));
    }
}
