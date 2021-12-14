package br.com.generation.voluntariado;

import java.util.Scanner;

public class Codigo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int teste, teste2, teste3, teste4, teste5, teste6;

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
                   
                	System.out.println("Escolha uma das institui��es para saber mais: \n[1] Associa��o Beneficente Parsifal\n[2] Salva Vidas Mirim\n[3] Funda��o Bunge\n[4] Assoc.Desportiva para Deficientes");
                	//escolha da Zona sul em SP                 	
                	//
                	teste4=entrada.nextInt();
                	if(teste4==1) {
                		System.out.println("Raz�o Social: Assoc.Beneficente Parsifal\r\n"
                				+ "Descri��o: A Parsifal, institui��o de Pedagogia Curativa e Terapia Social, foi fundada em 1991 e tem como objetivo promover o desenvolvimento pessoal e o conv�vio social de crian�as, jovens e adultos com defici�ncias e dist�rbios ps�quicos. \r\n"
                				+ "�rea de Atua��o: Assist�ncia a pessoas com defici�ncia\r\n"
                				+ "R.Rob�lia 59\r\n"
                				+ "Jardim Prud�ncia\r\n"
                				+ "CEP 04648-240\r\n"
                				+ "(11) 5547 0201\r\n"
                				+ "aparsifal@terra.com.br\r\n"
                				+ "https://parsifal.org.br\r\n"
                				);
                	}
                	else if(teste4==2) {
                		System.out.println("Raz�o Social: GRAACC - Grupo de Apoio a Adolescentes e � Crian�a com C�ncer\r\n"                		
                				+ "�rea de Atua��o: Assist�ncia a crian�as"
                				+ "Descri��o: Garantir a crian�as e adolescentes com c�ncer, dentro do mais avan�ado padr�o cient�fico, o direito de alcan�ar todas as chances de cura com qualidade de vida. \r\n"
                				+ "R.Botucatu 743\r\n"
                				+ "Vila Clementino\r\n"
                				+ "CEP 04023-062 \r\n"
                				+ "(11) 5080 8400\r\n"
                				+ "graacc@graacc.org.br\r\n"
                				+ "www.graacc.org.br\r\n");
                	}
                	else if(teste4==3) {
                		System.out.println("Raz�o Social: Funda��o Bunge\r\n"
                				+ "�rea de Atua��o: Educa��o e pesquisa\r\n"
                				+ "Descri��o: Contribuir para o desenvolvimento sustent�vel por meio de a��es que valorizem o avan�o da ci�ncia, a educa��o e a conserva��o dos recursos naturais.\r\n"
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
                	System.out.println("Escolha uma das institui��es para saber mais: \n[1] Grupo da Sopa\n[2] Casa do Cristo Redentor\n[3] Assist�ncia a pessoas com defici�ncia\n[4] Miss�es Quilombo");
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
                    			+ "Descri��o:Oferecer moradia e tratamento adequado a crian�as especiais portadoras de defici�ncia f�sica mental e m�ltipla, em condi��o de abandono e maus tratos, desenvolvendo ao m�ximo suas potencialidades enquanto houver prognostico reabilitacional. Promover a interven��o precoce para quando poss�vel, facilitar sua autonomia e inclus�o social. \r\n"
                    			+ "R.Cassandoca 535\r\n"
                    			+ "Mooca\r\n"
                    			+ "CEP 03169-010\r\n"                    			
                    			+ "(11) 2605 4879\r\n"
                    			+ "lardaredencao@lardaredencao.org.br\r\n"
                    			+ "www.lardaredencao.org.br\r\n");
                    }
                    else if(teste5==3) {
                    	System.out.println("Raz�o Social: Casa do Cristo Redentor\r\n"
                    			+ "�rea de Atua��o: Assist�ncia a crian�as\r\n"
                    			+ "Descri��o: Tem o objetivo de acolher, educar e promover o bem-estar f�sico e social de crian�as, adolescentes e fam�lias em situa��o de vulnerabilidade social. \r\n"
                    			+ "R.Agrimensor Sugaya 986\r\n"
                    			+ "Itaquera\r\n"
                    			+ "CEP 08260-030\r\n"
                    			+ "(11) 6521 6222\r\n"
                    			+ "ccr@casadocristoredentor.org.br\r\n"
                    			+ "www.casadocristoredentor.org.br\r\n");
                    }
                    else if(teste5==4) {
                    	System.out.println("Raz�o Social: Sociedade Cultural Miss�es Quilombo\r\n"
                    			+ "�rea de Atua��o: Direitos Humanos e Cidadania\r\n"
                    			+ "Descri��o: Tem o objetivo de levar � consci�ncia negra e � negritude crist�, debate racial com a sociedade. 	Promover a discuss�o b�blico-teol�gica sobre o racismo. Debater os preconceitos ainda encontrados na igreja, na teologia e na educa��o religiosa\r\n"
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
            	  //Escolha do litoral dentro do 2 if                
                //
            	System.out.println("[1]Entrega por Santos \n[2]Lar vicentino \n[3]Ecofaxina \n[4]Brinquedos do Bem \n[5]Supereco \n[6]Associa��o viva e deixe viver contadores de hist�rias");
            	teste6=entrada.nextInt();
            	if(teste6==1) {
            		System.out.println("Raz�o social: Entrega por Santos\r\n"
            				+ "Descri��o: O projeto Entrega por Santos � uma mobiliza��o solid�ria, sem fins lucrativos ou v�nculos pol�ticos, que busca resgatar sorrisos daqueles que vivem nas ruas de Santos e S�o Vicente. Conhe�a mais sobre o projeto e seja um voluntario!\r\n"
            				+ "http://www.instagram.com/entregaporsantos\r\n"
            				+ "Email entregaporsantos@gmail.com\r\n"
            				+ "https://pt-br.facebook.com/entregaporsantos/");
            	}
            	else if(teste6==2) {
            		System.out.println("Raz�o social : Lar vicentino \r\n"
            				+ "Descri��o: O lar procura pessoas para conversar com os idosos residentes. Se voc� tem paci�ncia e esp�rito jovem, � bem-vindo! \r\n"
            				+ "Tel (13) 3466-3331. \r\n"
            				+ "O endere�o � Rua Carij�s, 139, em S�o Vicente.\r\n"
            				+ "Conhe�a mais sobre o projeto e seja um voluntario!\r\n"
            				+ "https://www.facebook.com/larvicentinos");
            	}
            	else if(teste6==3) {
            		System.out.println("Raz�o social : Ecofaxina\r\n"
            				+ "Descri��o: O Instituto EcoFaxina atua desde 2008 com foco no desenvolvimento e apoio a pol�ticas p�blicas, pesquisas, programas e a��es voltadas � prote��o do Meio Ambiente e ao Desenvolvimento Sustent�vel. Seus esfor�os est�o focados na expans�o da consci�ncia ambiental.\r\n"
            				+ "Rua Nabuco de Ara�jo, 71, Boqueir�o\r\n"
            				+ "Santos (SP) - CEP: 11025-010\r\n"
            				+ "https://www.instagram.com/ecofaxina/\r\n"
            				+ "https://www.institutoecofaxina.org.br/voluntariado-beta");
            	}
            	else if(teste6==4) {
            		System.out.println("Raz�o social: Brinquedos do bem \r\n"
            				+ "Descri��o:  O grupo tem como objetivo levar brinquedos para as crian�as internadas nos hospitais da cidade. O mais legal � que, al�m de espalhar sorrisos, ainda h� um ensinamento: repassar os brinquedos:\r\n"
            				+ "Tel para contato (13) 99719-3069 (13) 99110-9398\r\n"
            				+ "Conhe�a mais sobre o projeto e seja um voluntario!\r\n"
            				+ "https://www.facebook.com/Brinquedos-do-Bem-1474359839529099/");
            	}
            	else if(teste6==5) {
            		System.out.println("Raz�o social: Supereco \r\n"
            				+ "Descri��o: Voc� tem algum talento e um prop�sito de vida? Quer viver uma experi�ncia �nica e especial? Gosta das causas ambientais e sociais? Quer ensinar algo e aprender, compartilhando saberes com a comunidade?  Pode doar seu tempo para fazer a diferen�a?\r\n"
            				+ "Conhe�a mais sobre o projeto e seja um voluntario!\r\n"
            				+ "Rua Maria Cristiano, 72 - S�o Francisco\r\n"
            				+ "S�o Sebasti�o - SP\r\n"
            				+ "CEP 11629-263\r\n"
            				+ "Email: administrativo@supereco.org.br\r\n"
            				+ "https://www.supereco.org.br/voluntariado-1");
            	}
            	else if(teste6==6) {
            		System.out.println("Raz�o social: Associa��o viva e deixe viver contadores de hist�rias\r\n"
            				+ "Descri��o: Levar a leitura, a brincadeira, as hist�rias para onde quer que vamos � o primeiro passo para transformar o atendimento cl�nico e interna��o hospitalar de crian�as e adolescentes que passam por momentos dif�ceis em um momento mais alegre, saud�vel, agrad�vel e terap�utico.\r\n"
            				+ "https://www.instagram.com/vivavdv/\r\n"
            				+ "https://www.vivaedeixeviver.org.br/seja-um-voluntario/");
            	}
            	else {
            		System.out.println("Voc� digitou um numero invalido");
            	}
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
