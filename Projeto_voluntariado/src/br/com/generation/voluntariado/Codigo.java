package br.com.generation.voluntariado;

import java.util.Scanner;

public class Codigo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int teste, teste2, teste3;
        Teste_sul a1 = new Teste_sul();
        Leste a2 = new Leste();
        Litoral a3 = new Litoral();
        Abc a4 = new Abc();
        System.out.println("Voc� gostaria de encontrar uma institui��o para se voluntariar? \n1: Sim \n2: N�o ");
        teste=entrada.nextInt();
        //come�o dos la�os para saber se a pessoa quer ou n�o se voluntariar
        //
        if(teste==1) {
            System.out.println("Escolha uma regi�o do estado de S�o Paulo:"
                    + " \n[1] Capital\n[2] Litoral\n[3] Interior\n[4] ABC");
            //escolha das regi�es
            //
            teste2=entrada.nextInt();
            if(teste2==1) {
            	// escolha da capital
                //
            	System.out.println("Escolha uma regi�o da capital de S�o Paulo: "
                        + "\n[1] Zona Norte \n[2] Zona Sul \n[3] Zona Leste \n[4] Zona Oeste");
                teste3=entrada.nextInt();
                if(teste3==1) {
                	//escolha da Zona norte em SP                	
                    //
                	System.out.println("Essas s�o as institui��es:  do Norte");
                }
                else if(teste3==2) {
                   
                	
                	//escolha da Zona sul em SP                 	
                	//
                a1.sul();
                	
                	
                }
                else if(teste3==3) {
                	//escolha da Zona leste em SP 
                    //
                    a2.leste();
                    
                }
                else if(teste3==1) {
                	//escolha da Zona norte em SP                 	
                    //
                	System.out.println("essas s�o as institui��es do oeste");
                }
                else {
                    System.out.println("Voc� digitou um numero invalido");
                }
            }


            else if(teste2==2) {
            	  //Escolha do litoral dentro do 2 if                
                //
            	a3.litoral();
            }
            else if(teste2==3) {
                System.out.println("essas s�o a op��o do Interior");
                //Escolha do interior dentro do 2 if 
                //
                
            }
            else if(teste2==4) {
                //Escolha do litoral dentro do 2 if        
                //
                a4.abc();
            }
            else {
                System.out.println("Voc� digitou um numero invalido");
            }
        }
        else if(teste==2) {
        	System.out.println("Muito obrigado por visitar nosso projeto");
        }
        else {
            System.out.println("Voc� digitou um numero invalido");
        }
        
        entrada.close();

	}

}
