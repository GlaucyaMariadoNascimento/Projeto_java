package br.com.generation.voluntariado;

import java.util.Scanner;

public class Codigo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int teste, teste2, teste3;

        System.out.println("Voc� gostaria de encontrar uma institui��o para se voluntariar? \n1: Sim \n2: N�o ");
        teste=entrada.nextInt();

        if(teste==1) {
            System.out.println("Escolha uma regi�o do estado de S�o Paulo:"
                    + " \n[1] Capital\n[2] Litoral\n[3] Interior\n[4] ABC");


            teste2=entrada.nextInt();
            if(teste2==1) {
                System.out.println("Escolha uma regi�o da capital de S�o Paulo: "
                        + "\n[1] Norte \n[2] Sul \n[3] Leste \n[4] Oeste");
                teste3=entrada.nextInt();
                if(teste3==1) {
                    System.out.println("essas s�o as institui��es do Norte");
                }
                else if(teste3==2) {
                    System.out.println("essas s�o as institui��es do sul");
                }
                else if(teste3==3) {
                    System.out.println("essas s�o as institui��es do leste");
                }
                else if(teste3==1) {
                    System.out.println("essas s�o as institui��es do oeste");
                }
                else {
                    System.out.println("Voc� digitou um numero invalido");
                }
            }


            else if(teste2==2) {
                System.out.println("essas s�o a op��o do Litoral");
            }
            else if(teste2==3) {
                System.out.println("essas s�o a op��o do Interior");
            }
            else if(teste2==4) {
                System.out.println("essas s�o a op��o do ABC");
            }
            else {
                System.out.println("Voc� digitou um numero invalido");
            }
        }
        else {
            System.out.println("Voc� digitou um numero invalido");
        }
        entrada.close();

	}

}
