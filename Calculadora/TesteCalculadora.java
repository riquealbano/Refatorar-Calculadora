package Calculadora;

public class TesteCalculadora {

    /**
     * Testes na main.
     *
     * Inicia ambiente de testes dos métodos da classe "Calculadora"
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        /**
         * Inicia 4 métodos para as 4 funções básicas matemáticas
         */
        System.out.println(calc.calcular(2,10, "+"));
        System.out.println(calc.calcular(10,2, "-"));
        System.out.println(calc.calcular(2,10, "*"));
        System.out.println(calc.calcular(10,2, "/"));
        
        /**
         * Caso ocorra uma divisão e qualquer um dos dois parâmetros
         * for igual a 0
         * 
         * Enviará uma mensagem de erro
         */
        try{
            System.out.println(calc.calcular(2,0, "/")); //exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        /**
         * Quando o operador não for válido
         * 
         * Exibe mensagem de erro
         */
        try{
            System.out.println(calc.calcular(2,10, "x"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }   
}
