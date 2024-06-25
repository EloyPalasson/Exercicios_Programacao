package Exercicios_01;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("SOMA DE DOIS NÚMEROS");

        int a, b;

        System.out.println("Digite o primeiro número:");
        a = sc.nextInt();
        System.out.println("Digite o segundo núemro:");
        b = sc.nextInt();

        System.out.println("SOMA = " + (a + b));

        //sc.close();

        System.out.println("CALCULO DA ÁREA");

        double pi = 3.14159;
        double raio, area;

        System.out.println("Digite o valor do raio de um círculo: ");
        raio = sc.nextDouble();
        area = pi * (Math.pow(raio, 2.0));
        System.out.printf("A = %.4f%n", area);

        //sc.close();

        System.out.println("CÁLCULO DA DIFERENÇA");

        int A, B, C, D, diferenca;

        System.out.println("Digite os 4 números em sequência: ");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        diferenca = ((A * B) - (C * D));

        System.out.println("DIFERENÇA = " + diferenca);

        //sc.close();

        System.out.println("CÁLCULO DE SALÁRIO");

        int n, horas;
        double valor, salario;

        System.out.println("Digite suas informações: ");
        System.out.println("Número do funcionário: ");
        n = sc.nextInt();
        System.out.println("Quantidade de horas trabalhadas: ");
        horas = sc.nextInt();
        System.out.println("Valor da hora trabalhada: ");
        valor = sc.nextDouble();

        salario = (valor * horas);

        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", n, salario);

        //sc.close();

        System.out.println("CÁLCULO DO VALOR DOS PRODUTOS");

        int cod1, cod2, qtd1, qtd2;
        double preco1,preco2, total;

        System.out.println("Digite os dados do primeiro produto");
        System.out.println("Código, Quantidade e Preço: ");
        cod1 = sc.nextInt();
        qtd1 = sc.nextInt();
        preco1 = sc.nextDouble();

        System.out.println("Digite os dados do segundo produto");
        System.out.println("Código, Quantidade e Preço: ");
        cod2 = sc.nextInt();
        qtd2 = sc.nextInt();
        preco2 = sc.nextDouble();

        total = (preco1 * qtd1) + (preco2 * qtd2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        //sc.close();

        System.out.println("CÁLCULOS MATEMÁTICOS");

        double F, G, H, triangulo, circulo, trapezio, quadrado, retangulo;
        double pI = 3.14159;
        System.out.println("Entre com os 3 números");
        F = sc.nextDouble();
        G = sc.nextDouble();
        H = sc.nextDouble();

        triangulo = (F * H) / 2;
        circulo = pI * (Math.pow(H, 2.00));
        trapezio = ((F + G) * H) / 2;
        quadrado = Math.pow(G, 2.00);
        retangulo = F * G;

        System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%n" +
                "QUADRADO: %.3f%nRETANGULO: %.3f%n%n", triangulo, circulo, trapezio, quadrado, retangulo);

        sc.close();

        System.out.println("FORMATAÇÃO DA SAÍDA DE DADOS");

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        Double price1 = 2100.0;
        Double price2 = 650.50;
        Double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n%n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender %s%n%n", age, code, gender);
        System.out.printf("Measue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three deciaml places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);

    }
}
