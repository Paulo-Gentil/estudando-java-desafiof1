package com.paulo;

import java.util.Scanner;

public class desafiof1 {
    public static void main(String[] args) {
/* Uma equipe de formula1 deseja calcular o numero minimo de litros que deverá ser colocar no tanque de um de seus
carros para que ele percorrer um determinado numeros de voltas até o primeiro reabastecimento. Escreva um programa que
leia o comprimento da pista (em metros), o numero total de voltas a serem percorridas no grande premio, o numero de
reabastecimentos desejados e o consumo de combustivel do carro (em KM/L).O objetivo é calculular o número mínimo de
litros neccessário até o primeiro reabastecimento*/

        Scanner entrada = new Scanner(System.in);
        int voltas;//número total de voltas.
        int reabastecimentos;//número de reabastecimento.
        double comprimento;//comprimento total da pista em metros.
        double consumo;//consumo de combustível.
        double mininoDeLitros;//número minimo de litros para o primeiro reabastecimento.

        System.out.print("Digite o comprimento total da pista em metros: ");
        comprimento = entrada.nextDouble();
        System.out.print("Digite o número total de voltas: ");
        voltas = entrada.nextInt();
        System.out.print("Digite o consumo de combustível em km/l: ");
        consumo = entrada.nextDouble();
        System.out.print("Digite o número de reabastecimentos: ");
        reabastecimentos = entrada.nextInt();

        /* É necessário converter o valor total da pista de metros para KM,
         *É necessário somar 1 ao número de reabastecimentos, devido ao carro precisar ser abastecido para o incio da corrida.
         */

        mininoDeLitros = (comprimento/1000)*voltas/consumo/(reabastecimentos+1);

        System.out.print("O número mínimo de litros para o 1° reabastecimento é: " + mininoDeLitros);


    }
}

