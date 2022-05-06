package treinamento;

import java.util.stream.IntStream;

public class LambdaJava8 {

    public static void main(String[] args){

        //Parênteses
        IntStream.range(0, 5)
                .filter(n -> n % 2 == 0) //forma mais comum de escrever função lambda
                .forEach(System.out::println);

        IntStream.range(0, 5)
                .filter((int n) -> n % 2 == 0) //Quando vc quer declarar o tipo do parametro, este tem que ser entre parênteses "(int n)"
                .forEach(System.out::println);

        IntStream.range(0, 5)
                .reduce((n1, n2) -> n1 + n2) //Nesse caso, quando tem que passar mais de 1 parâmetro, também deve estar entre parenteses "(n1, n2)"
                .ifPresent(System.out::println);

        Runnable runnable = () -> System.out.println("Teste de função lambda"); //Quando a função lambda não recebe parâmetro, deve-se representar por parenteses vazios "()"
        runnable.run();


        //Chaves
        IntStream.range(0, 5)
                .filter(n -> { //Se quiser usar as chaves "{}" deverá escrever "return" caso a expressão lambda retorne alguma coisa
                    System.out.println("Teste de função lambda usando chaves"); //Usando chaves vc pode escrever mais de uma linha de código
                    return n % 2 == 0;//E só depois retornar
                })
                .forEach(System.out::println);

    }

}
