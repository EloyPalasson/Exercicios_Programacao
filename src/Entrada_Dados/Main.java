package Entrada_Dados;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*

        SOMA DE DOIS NÚMEROS

        int a, b;
        *
        System.out.println("Digite o primeiro número:");
        a = sc.nextInt();
        System.out.println("Digite o segundo núemro:");
        b = sc.nextInt();
        *
        System.out.println("SOMA = " + (a + b));

        sc.close();

         */


        /*

        CALCULO DA ÁREA

        double pi = 3.14159;
        double raio, area;

        System.out.println("Digite o valor do raio de um círculo: ");
        raio = sc.nextDouble();
        area = pi * (Math.pow(raio, 2.0));
        System.out.printf("A = %.4f", area);

        sc.close();

         */

        /*

        CÁLCULO DA DIFERENÇA

        int A, B, C, D, diferenca;

        System.out.println("Digite os 4 números em sequeência: ");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        diferenca = ((A * B) - (C * D));

        System.out.println("DIFERENÇA = " + diferenca);

        sc.close();

         */

        /*

        CÁLCULO DE SALÁRIO

        int numero, horas_trabalhadas;
        double valor_hora, salario;

        System.out.println("Digite suas informações: ");
        System.out.println("Número do funcionário: ");
        numero = sc.nextInt();
        System.out.println("Quantidade de horas trabalhadas: ");
        horas_trabalhadas = sc.nextInt();
        System.out.println("Valor da hora trabalhada: ");
        valor_hora = sc.nextDouble();

        salario = (valor_hora * horas_trabalhadas);

        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", numero, salario);

        sc.close();

        */
        /*

        CÁLCULO DO VALOR DOS PRODUTOS

        int codigo_produto1, codigo_produto2, quantidade_produto1, quantidade_produto2;
        double preco_produto1,preco_produto2, total;

        System.out.println("Digite os dados do primeiro produto");
        System.out.println("Código, Quantidade e Preço: ");
        codigo_produto1 = sc.nextInt();
        quantidade_produto1 = sc.nextInt();
        preco_produto1 = sc.nextDouble();

        System.out.println("Digite os dados do segundo produto");
        System.out.println("Código, Quantidade e Preço: ");
        codigo_produto2 = sc.nextInt();
        quantidade_produto2 = sc.nextInt();
        preco_produto2 = sc.nextDouble();

        total = (preco_produto1 * quantidade_produto1) + (preco_produto2 * quantidade_produto2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);
        sc.close();

        */

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
        double pi = 3.14159;
        System.out.println("Entre com os 3 números");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangulo = (A * C) / 2;
        circulo = pi * (Math.pow(C, 2.00));
        trapezio = ((A + B) * C) / 2;
        quadrado = Math.pow(B, 2.00);
        retangulo = A * B;


        System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%n" +
                "QUADRADO: %.3f%nRETANGULO: %.3f%n", triangulo, circulo, trapezio, quadrado, retangulo);
    }
}

