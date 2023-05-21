package com.mycompany.aulassaul;

import java.util.Scanner;

public class teste {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero, i;
        int vaNum[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        String vaRom[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        while (true) {

            numero = teclado.nextInt();
            if (numero == 0) {
                break;
            }
            System.out.printf("%-4d", numero);
            i = 0;
            while (numero > 0) {
                if (numero >= vaNum[i]) {
                    System.out.println(vaRom[i]);
                    numero = numero - vaNum[i];
                }
            }

        }
    }
}
