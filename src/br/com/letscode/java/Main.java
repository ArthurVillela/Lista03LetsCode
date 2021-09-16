package br.com.letscode.java;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //questao01();
	    //questao02();
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
            System.out.printf("Informe o nome da %dº fruta: \n",i+1);
            carrinhoCompras[i] = in.nextLine();
        }
        System.out.println(Arrays.toString(carrinhoCompras));
    }

    public static void questao02() {
        /*
            Escreva um programa que lê uma palavra e a escreve de volta ao contrário.
        */
        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = in.nextLine();




        }

    public static void questao03() {

        /*
            Escreva um programa que lê 5 números. Ao final, escreva primeiros todos os ímpares, depois todos os pares.
        */

        Scanner in = new Scanner(System.in);

        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.printf("Digite o %dº valor: \n",(i+1));
            nums[i] = in.nextInt();

        }
        //  System.out.println(Arrays.toString(nums));
        System.out.println("Numeros impares: ");
        for(int i = 0; i < nums.length; i++){
            if (nums[i]%2!=0){
                System.out.print(nums[i] + ";");
            }
        }

        System.out.println("\nNumeros pares: ");
        for(int i = 0; i < nums.length; i++){
            if (nums[i]%2==0){
                System.out.print(nums[i] + ";");
            }
        }



    }
    }


