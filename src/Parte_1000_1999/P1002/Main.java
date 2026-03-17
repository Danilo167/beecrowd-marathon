package Parte_1000_1999.P1002;

import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        final double pi = 3.14159; double area; double raio = leitor.nextDouble();

        area = pi * potencia(raio, 2);

        System.out.printf("A=%.4f\n", area);

        leitor.close();

    }

    public static double potencia(double base, int expoente) {
        if (expoente == 0) return 1;
        return base * potencia(base, expoente - 1);
    }
}



