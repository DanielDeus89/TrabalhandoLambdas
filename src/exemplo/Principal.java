package exemplo;

public class Principal {
    public static void main(String[] args) {

        Operacao operacao = (a,b) -> a+b;

        System.out.print(operacao.executar(5,4));
    }
}