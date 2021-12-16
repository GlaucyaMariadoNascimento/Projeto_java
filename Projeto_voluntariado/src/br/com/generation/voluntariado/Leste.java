package br.com.generation.voluntariado;

import java.util.Scanner;

public class Leste {
	
    void leste(){
    	
	  Scanner entrada = new Scanner(System.in);
	  int regLeste;
	  System.out.println("Escolha uma das institui��es para saber mais: \n[1] Grupo da Sopa\n[2] Lar da Reden��o\n[3] Casa do Cristo Redentor\n[4] Miss�es Quilombo");
	  regLeste=entrada.nextInt();
	  if (regLeste==1) {
		
        System.out.println("Raz�o Social: Grupo da Sopa\r\n"
     			+ "Descri��o: Preparo e distribui��o de refei��es, atendimento e orienta��o para moradores de rua \n"
     			+ "na cidade de S�o Paulo. Formado por um grupo de amigos que prepara 320 refei��es todas as quintas\n"
     			+ "das 17 �s 21h e depois deste hor�rio sai para a entrega nas regi�es do Br�s, Centro, Ipiranga e Jabaquara.\n"
     			+ "Aos s�bados s�o 120 refei��es preparadas das 9 �s 12h e depois sai para entrega at� as 14h na regi�o do Br�s \n"
     			+ "e Glic�rio. Al�m das refei��es tamb�m s�o levadas roupas, kits de higiene, cobertores, etc.\r\n"
     			+ "�rea de Atua��o: Outros/Assist�ncia\r\n"
     			+ "Rua Borges de Figueiredo, 82\r\n"
     			+ "Mooca\r\n"
     			+ "CEP 03110-010\r\n"                    			
     			+ "(11) 994465312 ou (11) 96332-4165\r\n"
     			+ "contato@grupodasopa.org ou norivalnogueira@gmail.com\r\n"
     			+ "www.grupodasopa.org\r\n"
     			+ "/grupo.dasopa\r\n");
     	}
        else if(regLeste==2) {
     	    System.out.println("Raz�o Social: Lar da Reden��o\r\n"
     			+ "Descri��o:Oferecer moradia e tratamento adequado a crian�as especiais portadoras de defici�ncia f�sica mental e m�ltipla,\n"
     			+ "em condi��o de abandono e maus tratos, desenvolvendo ao m�ximo suas potencialidades enquanto houver prognostico reabilitacional.\n"
     			+ "Promover a interven��o precoce para quando poss�vel, facilitar sua autonomia e inclus�o social. \r\n"
     			+ "�rea de Atua��o: Assist�ncia a pessoas com defici�ncia\r\n"
     			+ "R.Cassandoca 535\r\n"
     			+ "Mooca\r\n"
     			+ "CEP 03169-010\r\n"                    			
     			+ "(11) 2605 4879\r\n"
     			+ "lardaredencao@lardaredencao.org.br\r\n"
     			+ "www.lardaredencao.org.br\r\n");
        }
        else if(regLeste==3) {
     	    System.out.println("Raz�o Social: Casa do Cristo Redentor\r\n"
     			+ "Descri��o: Tem o objetivo de acolher, educar e promover o bem-estar f�sico e social de crian�as, adolescentes \n"
     			+ "e fam�lias em situa��o de vulnerabilidade social. \r\n"
     			+ "�rea de Atua��o: Assist�ncia a crian�as\r\n"
     			+ "R.Agrimensor Sugaya 986\r\n"
     			+ "Itaquera\r\n"
     			+ "CEP 08260-030\r\n"
     			+ "(11) 6521 6222\r\n"
     			+ "ccr@casadocristoredentor.org.br\r\n"
     			+ "www.casadocristoredentor.org.br\r\n");
        }
        else if(regLeste==4) {
     	    System.out.println("Raz�o Social: Sociedade Cultural Miss�es Quilombo\r\n"
     			+ "Descri��o: Tem o objetivo de levar � consci�ncia negra e � negritude crist�, debate racial com a sociedade.\n"
     			+ "Promover a discuss�o b�blico-teol�gica sobre o racismo. Debater os preconceitos ainda encontrados na igreja, \n"
     			+ "na teologia e na educa��o religiosa\r\n"
     			+ "�rea de Atua��o: Direitos Humanos e Cidadania\r\n"
     			+ "R.Jo�o Bodin 296 Quadra M Casa 01\r\n"
     			+ "Jardim Aurora\r\n"
     			+ "CEP 08431-060\r\n"                    			
     			+ "(11) 6135 3867\r\n"
     			+ "hernaniquilombo@yahoo.com.br\r\n"
     			+ "www.mquilombo.com.br\r\n");
       }
       else {
 		   System.out.println("Voc� digitou um n�mero inv�lido");
 	   }
	   entrada.close();
   }
}
