package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circulo circulo = new Circulo();

        System.out.println("Digite o raio do círculo:");
        double raio = scanner.nextDouble();

        circulo.setRaio(raio);

        double area = circulo.calcularArea();
        System.out.printf("A área do círculo é: %.2f\n", area);

        scanner.close();
    }
}
