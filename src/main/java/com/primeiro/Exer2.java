package com.primeiro;

import java.util.Scanner;

public class Exer2 {
    private void saudacao(String nome) {
        System.out.printf("É um desprazer te conhecer, %s!", nome);
    }

    public static void main(String[] args) {
        String nome;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome para sauda-lo: ");

        nome = sc.nextLine();

        Exer2 saudar = new Exer2();

        saudar.saudacao(nome);

        sc.close();
    }
}
