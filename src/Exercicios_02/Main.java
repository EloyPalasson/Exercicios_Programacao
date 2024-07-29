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

        System.out.println("Múltiplos ou não?");

        System.out.println("Digite o primeiro número");
        int A = scan.nextInt();
        System.out.println("Digite o segundo número");
        int B = scan.nextInt();

        if (A % B == 0 || B % A == 0){
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }

        scan.close();
    }
}
