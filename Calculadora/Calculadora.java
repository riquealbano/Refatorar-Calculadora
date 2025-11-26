/**
 * <p>Esta classe fornece operacoes matematicas basicas como soma, subtracao,
 * multiplicacao e divisao, alem de um metodo principal que seleciona a operacao
 * desejada com base em um operador informado pelo usuario.</p>
 * <p>Esse projeto e utilizado para demonstrar:</p>
 * <ul>
 * <li>Uso basico de Javadoc</li>
 * <li>Tecnicas de revisao estatica (caixa branca)</li>
 * <li>Tecnicas de revisao (caixa preta)</li>
 * <li>Utilizacao de refatoracao em codigo Java</li>
 * <li>Utilizacao com Javadoc</li>
 * </ul>
 * <p>Visando a refatoracao, os metodos desta classe sao <strong>strong>cursos</strong>strong> de refatoracao
 * sem efeitos colaterais, permitindo maior legibilidade e facilitando testes unitarios.</p>
 *
 * @author Henrique Serafim Albano
 * @version 1.0
 */

package Calculadora;

public class Calculadora {

    /**
     * Soma dois numeros inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da soma de {@code a} e {@code B}
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai dois numeros inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da subtração de {@code a} e {@code B}
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois numeros inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da multiplicação de {@code a} e {@code B}
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dois numeros inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da divisão de {@code a} e {@code B}
     * 
     * @throws IllegalArgumentException se o primeiro ou o segundo operando for igual a 0
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisao por zero nao e permitida");
        }
        return a / b;
    }
    
    /**
     * <p>Executa a operacao matematica solicitada com base no operador informado.</p>
     * 
     * <p>Operadores aceitos:</p>
     * <ul>
     *  <li> "+" - Soma</li>
     *  <li> "-" - Subtracao</li>
     *  <li> "*" - Multiplicacao</li>
     *  <li> "/" - Divisao</li>
     * </ul>
     * <p>Qualquer operador invalido resulta em excecao.</p>
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @param operador simbolo da operacao desejada
     * @return o resultado da operacao correspondente ao operador informado
     * 
     * @throws IllegalArgumentException se o operador nao for um simbolo valido
     */
    public int calcular (int a, int b, String operador){
        return switch(operador){
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operador inválido " + operador);
        };
    }
}
