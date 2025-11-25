package Calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.calc(5, 20, "+");
        calc.calc(5, 20, "-");
        calc.calc(5, 20, "*");
        calc.calc(20, 5, "/");
        calc.calc(5, 0, "/");
        calc.calc(1, 1, "x");
    }
}
