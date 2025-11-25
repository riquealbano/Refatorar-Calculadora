package Calculadora;

public class Calculadora {

    public int r = 0;

    public int calc(int a, int b, String op){

        if(op.equals("+")){
            r = a + b;
        } else if(op.equals("-")){
            r = a - b;
        } else if(op.equals("*")){
            r = a * b;
        } else if(op.equals("/")){
            if(b != 0) {
                r = a / b;
            } else {
                System.out.println("Erro: Número 0 é indivisivo");
                r = 0;
            }
        } else {
            System.out.println("Operação Inválida");
            r = 0;
        }
        System.out.println("Resultado = " + r);
        return r;
    }
}
