package org.example;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner firstValue = new Scanner(System.in);
        Scanner secondValue = new Scanner(System.in);
        int primeiroDado = firstValue.nextInt();
        int segundoDado = secondValue.nextInt();
        OperacoesAritmeticas(primeiroDado, segundoDado);
        OperadoresAtribuicao(primeiroDado, segundoDado);
        OperadoresIncDec(primeiroDado, segundoDado);
        OperadoresRelacionais(primeiroDado, segundoDado);
        OperadoresLogicos(primeiroDado, segundoDado);
    }

    private static void OperadoresLogicos(int primeiroArg, int segundoArg) {
        int num1 = primeiroArg;
        int num2 = segundoArg;
        boolean condicao1 = (num1 >= 1 && num1 <= 10) || (num2 >= 1 && num2 <= 10);
        boolean condicao2 = !(num1 < num2);
        System.out.println("OperadoresLogicos: " + condicao1);
        System.out.println("OperadoresLogicos: " + condicao2);
    }

    private static void OperadoresRelacionais(int primeiroArg, int segundoArg) {
        // Em declaração de variáveis booleanas é uma boa prática comecar com "is", exemplos: isMaior, isMenor, etc
        int num1 = primeiroArg;
        int num2 = segundoArg;
        boolean isMaior = num1 > num2;
        boolean isMenor = num1 < num2;
        boolean isMaiorIgual = num1 >= num2;
        boolean isMenorIgual = num1 <= num2;
        boolean isIgual = num1 == num2;
        boolean isDiferente = num1 != num2;
        System.out.println("OperadoresRelacionais: " + isMaior);
        System.out.println("OperadoresRelacionais: " + isMenor);
        System.out.println("OperadoresRelacionais: " + isMaiorIgual);
        System.out.println("OperadoresRelacionais: " + isMenorIgual);
        System.out.println("OperadoresRelacionais: " + isIgual);
        System.out.println("OperadoresRelacionais: " + isDiferente);
    }

    private static void OperadoresIncDec(int primeiroArg, int segundoArg) {
        int num1 = primeiroArg;
        int num2 = segundoArg;
        System.out.println(num1++);
        System.out.println(num1--);
    }

    private static void OperadoresAtribuicao(int primeiroArg, int segundoArg) {
        int num1 = primeiroArg;
        int num2 = segundoArg;
        System.out.println(num1+=num2);
        System.out.println(num1-=num2);
        System.out.println(num1*=num2);
        System.out.println(num1/=num2);
    }

    public static void OperacoesAritmeticas(int primeiroArg, int segundoArg) {

        int num1 = primeiroArg;
        int num2 = segundoArg;

        int num3 = num1 + num2;
        int num4 = num1 - num2;
        int num5 = num1 / num2;
        int num6 = num1 * num2;
        int num7 = (num1 + num2)/num4;
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
    }
}
