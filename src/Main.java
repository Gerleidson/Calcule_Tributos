/**
 * Este programa calcula os tributos a partir da remuneração e semeadura inseridas pelo usuário.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double remuneracao = Double.valueOf(0);
        Double semeadura = Double.valueOf(0);

        // Solicita a remuneração ao usuário
        System.out.println("Calcule seus tributos!");
        System.out.println("");
        System.out.printf("Digite sua remuneração: ");
        remuneracao = sc.nextDouble();

        // Calcula os valores dos tributos
        Double primicia = Math.ceil(remuneracao / 30);
        Double dizimo = Math.ceil((remuneracao - primicia) / 10);
        Double socorro = Math.ceil((remuneracao * 2) / 100);
        Double gratidao = Math.ceil(remuneracao / 1000);
        Double israel = Math.ceil(remuneracao / 100);

        // Exibe os valores dos tributos
        System.out.println("Primicia: " + primicia);
        System.out.println("Dizimo: " + dizimo);
        System.out.println("Oferta de socorro: " + socorro);
        System.out.println("Oferta de gratidão: " + gratidao);

        // Solicita a semeadura ao usuário
        System.out.printf("Digite sua semeadura: ");
        semeadura = sc.nextDouble();
        System.out.println("Oferta de Israel: " + israel);

        // Calcula o total de contribuição (soma dos tributos e semeadura)
        Double contribuicao = primicia + dizimo + socorro + gratidao + semeadura + israel;

        // Exibe o total de contribuição
        System.out.println("TOTAL DE CONTRIBUIÇÃO: " + contribuicao);

    }
}
