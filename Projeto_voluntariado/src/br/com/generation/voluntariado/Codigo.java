package br.com.generation.voluntariado;

import java.util.Scanner;

public class Codigo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int teste, teste2, teste3, teste4, teste5;

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
                   
                	System.out.println("Escolha uma das institui��es para saber mais: \n[1] Associa��o Beneficente Parsifal\n[2] C�ritas de Santo Amaro\n[3] Funda��o Bunge\n[4] Assoc.Desportiva para Deficientes");
                	//escolha da Zona sul em SP                 	
                	//
                	teste4=entrada.nextInt();
                	if(teste4==1) {
                		System.out.println("Raz�o Social: Assoc.Beneficente Parsifal\r\n"
                				+ "Descri��o: \r\n"
                				+ "�rea de Atua��o: Assist�ncia a pessoas com defici�ncia\r\n"
                				+ "R.Rob�lia 59\r\n"
                				+ "Jardim Prud�ncia\r\n"
                				+ "CEP 04648-240\r\n"
                				+ "(11) 5547 0201\r\n"
                				+ "aparsifal@terra.com.br\r\n"
                				+ "www.abparsifal.hpg.com.br\r\n"
                				);
                	}
                	else if(teste4==2) {
                		System.out.println("Raz�o Social: C�ritas Diocesana de Santo Amaro\r\n"
                				+ "�rea de Atua��o: Assist�ncia a jovens\r\n"
                				+ "Descri��o: \r\n"
                				+ "Av.Mascote 1171\r\n"
                				+ "Vila Mascote\r\n"
                				+ "CEP 04363-001\r\n"
                				+ "(11) 5564 4829\r\n"
                				+ "admmitra@terra.com.br\r\n");
                	}
                	else if(teste4==3) {
                		System.out.println("Raz�o Social: Funda��o Bunge\r\n"
                				+ "�rea de Atua��o: Educa��o e pesquisa\r\n"
                				+ "Descri��o: \\r\\n"
                				+ "Av.Maria Coelho Aguiar 215 Bloco D - 5� andar\r\n"
                				+ "Jardim S�o Luiz\r\n"
                				+ "CEP 05804-900\r\n"
                				+ "(11) 3741 6832\r\n"
                				+ "fundacao@bunge.com.br\r\n"
                				+ "www.fundacaobunge.org.br\r\n");
                	}
                	else if(teste4==4) {
                		System.out.println("Raz�o Social: ADD- Assoc.Desportiva para Deficientes\r\n"
                				+ "Descri��o: Miss�o Incentivar e promover o desenvolvimento e a inclus�o de pessoas com defici�ncia por meio do esporte e do apoio educacional em �mbito nacional. Princ�pios e Valores A ADD valoriza os talentos e capacidades das pessoas, apoiando-se em princ�pios �ticos e morais. \r\n"
                				+ "�rea de Atua��o: Assist�ncia a pessoas com defici�ncia\r\n"
                				+ "Rua das Pitombeiras, 296\r\n"
                				+ "Vila Parque Jabaquara\r\n"
                				+ "CEP 04321-160\r\n"
                				+ "(11) 50116133\r\n"
                				+ "contato@add.org.br\r\n"
                				+ "www.add.org.br\r\n"
                				+ "addassociacao\r\n"
                				+ "@addaddociacao\r\n");
                	}
                	else {
                		System.out.println("Voc� digitou um numero invalido");
                	}
                	
                }
                else if(teste3==3) {
                	//escolha da Zona leste em SP 
                    //
                	System.out.println("Escolha uma das institui��es para saber mais: \n[1] Grupo da Sopa\n[2] Lar da Reden��o\n[3] Assist�ncia a pessoas com defici�ncia\n[4] Miss�es Quilombo");
                    teste5=entrada.nextInt();
                    if (teste5==1) {
                    	System.out.println("Raz�o Social: Grupo da Sopa\r\n"
                    			+ "Descri��o: Preparo e distribui��o de refei��es, atendimento e orienta��o para moradores de rua na cidade de S�o Paulo. Formado por um grupo de amigos que prepara 320 refei��es todas as quintas das 17 �s 21h e depois deste hor�rio sai para a entrega nas regi�es do Br�s, Centro, Ipiranga e Jabaquara. Aos s�bados s�o 120 refei��es preparadas das 9 �s 12h e depois sai para entrega at� as 14h na regi�o do Br�s e Glic�rio. Al�m das refei��es tamb�m s�o levadas roupas, kits de higiene, cobertores, etc.\r\n"
                    			+ "�rea de Atua��o: Outros/Assist�ncia\r\n"
                    			+ "Rua Borges de Figueiredo, 82\r\n"
                    			+ "Mooca\r\n"
                    			+ "CEP 03110-010\r\n"                    			
                    			+ "(11) 994465312 ou (11) 96332-4165\r\n"
                    			+ "contato@grupodasopa.org ou norivalnogueira@gmail.com\r\n"
                    			+ "www.grupodasopa.org\r\n"
                    			+ "/grupo.dasopa\r\n");
                    	}
                    else if(teste5==2) {
                    	System.out.println("Raz�o Social: Lar da Reden��o\r\n"
                    			+ "�rea de Atua��o: Assist�ncia a pessoas com defici�ncia\r\n"
                    			+ "Descri��o: \r\n"
                    			+ "R.Cassandoca 535\r\n"
                    			+ "Mooca\r\n"
                    			+ "CEP 03169-010\r\n"                    			
                    			+ "(11) 2605 4879\r\n"
                    			+ "lardaredencao@lardaredencao.org.br\r\n"
                    			+ "www.lardaredencao.org.br\r\n");
                    }
                    else if(teste5==3) {
                    	System.out.println("Raz�o Social: Institui��o Paulista Adventista Assist.Social Vila Carmosina\r\n"
                    			+ "�rea de Atua��o: Assist�ncia e servi�os sociais\r\n"
                    			+ "Descri��o: \r\n"
                    			+ "R.Palmitinho 82\r\n"
                    			+ "Itaquera\r\n"
                    			+ "CEP 08210-020\r\n"                    			
                    			+ "(11) 6179 6919\r\n"
                    			+ "vering@ig.com.br\r\n");
                    }
                    else if(teste5==4) {
                    	System.out.println("Raz�o Social: Sociedade Cultural Miss�es Quilombo\r\n"
                    			+ "�rea de Atua��o: Direitos Humanos e Cidadania\r\n"
                    			+ "Descri��o: \r\n"
                    			+ "R.Jo�o Bodin 296 Quadra M Casa 01\r\n"
                    			+ "Jardim Aurora\r\n"
                    			+ "CEP 08431-060\r\n"                    			
                    			+ "(11) 6135 3867\r\n"
                    			+ "hernaniquilombo@yahoo.com.br\r\n"
                    			+ "www.mquilombo.com.br\r\n");
                    }
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
                System.out.println("essas s�o a op��o do Litoral");
                //Escolha do litoral dentro do 2 if                
                //
            }
            else if(teste2==3) {
                System.out.println("essas s�o a op��o do Interior");
                //Escolha do interior dentro do 2 if 
                //
            }
            else if(teste2==4) {
                System.out.println("essas s�o a op��o do ABC");
                //Escolha do litoral dentro do 2 if        
                //
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
