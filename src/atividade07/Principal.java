package atividade07;

public class Principal {
    public static void main(String[] args) {
        Divisor divisor = (a,b)->{
            if (b == 0) throw new ArithmeticException("Divisor cannot be zero");
            return (a/b);
        };

        try{
            System.out.println(divisor.dividir(14,7));
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
