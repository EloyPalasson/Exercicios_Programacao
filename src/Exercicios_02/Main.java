package Exercicios_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Negativo ou Positivo");
        int num = scan.nextInt();

        if (num < 0){
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÃO NEGATIVO");
        }
        //scan.close();


        System.out.println("Par ou Impar");
        int n = scan.nextInt();

        if (n % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
        //scan.close();


    }
}
