package br.com.generation.voluntariado;

import java.util.Scanner;

public class Abc {

	void abc() {
		//System.out.println("essas s�o a op��o do ABC"); >> para colocar institui��es direto
        //Escolha do abc dentro do 2 if        
        //
        System.out.println("Escolha uma cidade do ABC Paulista: "
                + "\n[1] Santo Andr� \n[2] S�o Bernardo do Campo");
        Scanner entrada = new Scanner (System.in);
        int abc1, abc2,abc3;
        abc1=entrada.nextInt();
        if(abc1==1) {
        	//escolha de Santo Andr�                	
            //
        	System.out.println("Escolha uma das institui��es para saber mais: \n[1] Am�lia Rodrigues\n[2] Projeto J.E.D.A\n[3] Casa do Caminho Ananias\n[4] AVSSA");
        	
        	abc2=entrada.nextInt();
        	if(abc2==1) {
        		System.out.println("Raz�o Social: Institui��o Assistencial e Educacional Am�lia Rodrigues\r\n"
        				+ "Descri��o: A Institui��o Am�lia Rodrigues tem como objetivo proporcionar o desenvolvimento integral de crian�as e oferecer condi��es de trabalho �s m�es, visando melhoria na renda familiar. \r\n"
        				+ "�rea de Atua��o: Educa��o\r\n"
        				+ "R. Tamarutaca, 190\r\n"
        				+ "Vila Guiomar\r\n"
        				+ "CEP 09071-130\r\n"
        				+ "ameliarodrigues@ameliarodrigues.org.br\r\n"
        				+ "www.ameliarodrigues.org.br\r\n"
        				);
        	}
        	else if(abc2==2) {
        		System.out.println("Raz�o Social: Assoc.Civil Projeto Juventude Esperan�a do Amanh�\r\n"                		
        				+ "�rea de Atua��o: Educa��o"
        				+ "Descri��o: O JEDA atua na defesa dos direitos de crian�as, adolescentes e suas fam�lias, executando a��es que previnem a ocorr�ncia de situa��es de risco social e fortalecendo a conviv�ncia familiar e comunit�ria. \r\n"
        				+ "R. Dr. Eduardo Monteiro, 946\r\n"
        				+ "Jd. Bela Vista\r\n"
        				+ "CEP 09041-300 \r\n"
        				+ "projetojeda@aol.com\r\n"
        				+ "http://www.projetojeda.org.br/index.html\r\n");
        	}
        	else if(abc2==3) {
        		System.out.println("Raz�o Social: Institui��o Assistencial Casa do Caminho Ananias\r\n"
        				+ "�rea de Atua��o: Assist�ncia a idosos e adultos\r\n"
        				+ "Descri��o: A Casa do Caminho Ananias oferece acolhimento de idosas acamadas e o fortalecimento de v�nculos para crian�as, adolescentes e fam�lias em situa��o de vulnerabilidade social e econ�mica.\r\n"
        				+ "Rua Andorinhas, n� 09\r\n"
        				+ "Jardim do Sol\r\n"
        				+ "CEP 09071-120\r\n"
        				+ "https://www.casadocaminhoananias.org.br/\r\n");
        	}
        	else if(abc2==4) {
        		System.out.println("Raz�o Social: Associa��o dos Volunt�rios da Sa�de de Santo Andr� - AVSSA\r\n"
        				+ "Descri��o: A Associa��o busca humanizar o atendimento da rede p�blica de sa�de de Santo Andr� atrav�s de a��es de apoio e acolhimento. \r\n"
        				+ "�rea de Atua��o: Sa�de\r\n"
        				+ "Av. Jo�o Ramalho, 305\r\n"
        				+ "Vila Assun��o\r\n"
        				+ "CEP 09041-030\r\n"
        				+ "mariaemilia@avssa.org.br\r\n"
        				+ "www.avssa.org.br\r\n");
        	}
        	else {
        		System.out.println("Voc� digitou um n�mero inv�lido");
        	}
        	
        }
        
        else if(abc1==2) {
           //escolha de S�o Bernardo do Campo                	
        	//
        	System.out.println("Escolha uma das institui��es para saber mais: \n[1] Casa dos Velhinhos Dona Adelaide\n[2] IAIP - Irm�o Palminha\n[3] AGDS\n[4] Casa de Estar S�o Luiz\n[5] Instituto Mam�e Clory");
        	
        	abc3=entrada.nextInt();
        	if(abc3==1) {
        		System.out.println("Raz�o Social: Casa dos Velhinhos Dona Adelaide\r\n"
        				+ "Descri��o: A institui��o promove a qualidade de vida e inclus�o social da pessoa idosa em situa��o de vulnerabilidade atrav�s de moradia e atividades sociais. \r\n"
        				+ "�rea de Atua��o: Assist�ncia a idosos e adultos\r\n"
        				+ "Rua Pr�ncipe Humberto, 250\r\n"
        				+ "Campestre\r\n"
        				+ "CEP 09725-200\r\n"
        				+ "contato@velhinhosadelaide.org.br\r\n"
        				+ "http://velhinhosadelaide.org.br/\r\n"
        				);
        	}
        	else if(abc3==2) {
        		System.out.println("Raz�o Social: Institui��o Assistencial Irm�o Palminha\r\n"                		
        				+ "�rea de Atua��o: Assist�ncia a crian�as"
        				+ "Descri��o: A IAIP realiza atendimento socioassistencial para fam�lias em situa��o de vulnerabilidade, exclus�o e risco social pois acredita que o n�cleo familiar, independente de sua organiza��o, � o primeiro espa�o de refer�ncia, prote��o e socializa��o do indiv�duo. \r\n"
        				+ "Rua Benedito Conrado Filho, 65\r\n"
        				+ "Jardim Beatriz\r\n"
        				+ "CEP 09895-110\r\n"
        				+ "palminha@palminha.org.br\r\n"
        				+ "www.iaip.org.br\r\n");
        	}
        	else if(abc3==3) {
        		System.out.println("Raz�o Social: Assoc.Global para o Desenvolvimento Sustentado\r\n"
        				+ "�rea de Atua��o: Ambientalismo\r\n"
        				+ "Descri��o: A Associa��o desenvolve e implanta projetos e programas de educa��o ambiental, gest�o e recupera��o de �reas a serem preservadas nos diversos biomas brasileiros e representa a sociedade junto aos f�runs oficiais em temas relacionados � educa��o e ao meio ambiente.\r\n"
        				+ "Av.Vivaldi, 1421\r\n"
        				+ "Rudge Ramos\r\n"
        				+ "CEP 09617-000\r\n"
        				+ "agds@agds.org.br\r\n"
        				+ "www.agds.org.br\r\n");
        	}
        	else if(abc3==4) {
        		System.out.println("Raz�o Social: Associa��o S�o Luiz\r\n"
        				+ "Descri��o: A entidade promove o acolhimento e a preserva��o dos v�nculos familiares, sociais e comunit�rios atrav�s do exerc�cio da cidadania. Oferece atendimento e acompanhamento m�dico, odontol�gico e psicol�gico, atividades pedag�gicas e recreativas e tratamento especializado para crian�as com necessidades especiais. \r\n"
        				+ "�rea de Atua��o: Assist�ncia a crian�as\r\n"
        				+ "R. Miguel Arco e Flecha, 41\r\n"
        				+ "Vila Euclides\r\n"
        				+ "CEP 09725-500\r\n"
        				+ "https://associacaosaoluiz.org.br/\r\n");
        	}
        	else if(abc3==5) {
        		System.out.println("Raz�o Social: Lar da Mam�e Clory\r\n"
        				+ "Descri��o: O Lar da Mam�e Clory atua com o objetivo de amparar e assistir crian�as e adolescentes e mant�m diversas atividades como creche, apoio educacional, cultural e esportivo, n�cleo de educa��o ambiental e n�cleo de atendimento � fam�lia. \r\n"
        				+ "�rea de Atua��o: Assist�ncia e servi�os sociais\r\n"
        				+ "R. Francisco Visentainer, 438\r\n"
        				+ "Assun��o\r\n"
        				+ "CEP 09861-630\r\n"
        				+ "diretoria@mamaeclory.org.br\r\n"
        				+ "www.mamaeclory.org.br\r\n");
        	}
        	else {
        		System.out.println("Voc� digitou um n�mero inv�lido");
        	}
        	
     
       }
        entrada.close();
	}
}
