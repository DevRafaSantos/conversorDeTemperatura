package secao9;

/*
    Objetivo: Criar um conversor de Celsius para Fahrenheit e de Fahrenheit para Celsius

    Etapas do projeto

    1 - Obter o usuário se ele quer converter Celsius ou Fahrenheit
    2 - Criar duas funções, uma para cada conversão
    3 - Obter a temperatura em cada uma das funções escolhidas
    4 - Exibir uma mensagem com a temperatura, Ex: De x C para y F.
 
 */

import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Saber o que o usuário quer converter
        System.out.println("Escolha o tipo da conversão:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        
        int escolha = scanner.nextInt();

        if(escolha == 1) {
            System.out.println("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsiusParaFahrenheit(celsius);
            System.out.printf("%.2f°C = %.2f°F%n", celsius, fahrenheit);
        } else if (escolha == 2) {
            System.out.println("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = fahrenheitParaCelsius(fahrenheit);
            System.out.printf("%.2f°F = %.2f°C%n", fahrenheit, celsius);
        } else {
            System.out.println("Opção inválida!");
        }
        
        scanner.close();
        
    }

    // Funções:
    // Converte Celsius para Fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {

        return (celsius * 9/5) + 32;
    }

    // Converte Fahrenheit para Celsius
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

}
