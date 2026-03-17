package Parte_1000_1999.P1001;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();

        System.out.println("X = " + (A+B));
        leitor.close();
    }
}

