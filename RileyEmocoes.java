import java.util.Scanner;

public class RileyEmocoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alegria = 0;
        int tristeza = 0;

        System.out.print("Riley fez novas amizades? (sim = 1 / nao = 0): ");
        int fezAmizades = sc.nextInt();

        if (fezAmizades == 1) {
            System.out.print("Quantas amizades Riley fez? ");
            int qtdAmizades = sc.nextInt();
            alegria += qtdAmizades * 10;
        } else {
            tristeza += 30;
        }
        
        System.out.println("Digite as notas das tres provas (A1, A2, A3): ");
        double A1 = sc.nextDouble();
        double A2 = sc.nextDouble();
        double A3 = sc.nextDouble();

        double media = (A1 + A2 + A3) / 3.0;

        if (media >= 7.0) {
            alegria += 50;
        } else {
            tristeza += 50;
        }

        System.out.print("Quantos dos 10 exercicios de programação Riley fez? ");
        int feitos = sc.nextInt();

        alegria += feitos * 10;
        tristeza += (10 - feitos) * 10;

        System.out.println("Pontuaçao final: ");
        System.out.println("Alegria: " + alegria + " pontos");
        System.out.println("Tristeza: " + tristeza + " pontos");

        if (alegria > tristeza) {
            System.out.println("A mudança para a nova cidade foi uma experiencia incrível para a Riley.");
        } else {
            System.out.println("A mudança para a nova cidade foi uma experiencia desagradável para a Riley.");
        }

        sc.close();
    }
}
