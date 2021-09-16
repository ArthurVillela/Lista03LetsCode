package br.com.letscode.java;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //questao01();
	    questao02();
	    //questao03();
	    //questao04();
	    //questao05();
	    //questao06();
	    //questao07();
	    //questao08();
    }

    public static void questao01() {
        /*
            Escreva um programa que lê o nome de 5 frutas e armazena num carrinho de compras.
            Ao final da entrada dos 5 itens, exiba a lista completa.
        */

        Scanner in = new Scanner(System.in);
        String[] carrinhoCompras = new String[5];

        for(int i = 0; i < carrinhoCompras.length; i++){
            System.out.printf("Informe o nome da %dº fruta\n",i+1);
            carrinhoCompras[i] = in.nextLine();
        }
        System.out.println(Arrays.toString(carrinhoCompras));
    }

}
