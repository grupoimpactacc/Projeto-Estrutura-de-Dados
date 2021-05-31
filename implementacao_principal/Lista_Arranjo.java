package implementacao_principal;
import tad_lista_arranjo.*;
import java.util.Scanner;

public class Lista_Arranjo {
	
	public static void exibeMenu() {
		String menu[] = new String[3];
		
		menu[0] = "0. Defini��o de Lista Arranjo";
		menu[1] = "1. Testar Lista Arranjo na pr�tica";
		menu[2] = "2. Voltar ao Menu Principal";
		
		for(int i=0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}		
		
		Scanner entrada = new Scanner(System.in);
		int ent;
		
		System.out.println("----------------------");
		System.out.println("Entre com o n�mero da op��o desejada: ");
		ent = entrada.nextInt();
		
		if(ent == 0) {
			exibeDefinicao();
		}
		
		else if(ent == 1) {
			
		}
		
		else if(ent == 2) {
			Principal.exibeMenuPrincipal();
		}
	}
	
	public static void exibeDefinicao() {
		System.out.println("==================================== Lista Arranjo ====================================" 
							+ "\n*** PRESSIONE '0' E DEPOIS 'ENTER' A QUALQUER MOMENTO PARA RETORNAR AO MENU ANTERIOR ***"
							+ "\n" + "\n- Defini��o" + "\nUma lista arranjo (ou vetor) � uma cole��o S de N elementos\r\n"
							+ "armazenados em uma certa ordem linear, de maneira que � poss�vel\r\n"
							+ "se referir aos elementos de S como 1�, 2�, 3� e assim por diante." + "\n" 
							+ "\n- Inser��o" + "\nTexto..." + "\n" 
							+ "\n- Remo��o" + "\nTexto..." + "\n" 
							+ "\n- Visualiza��o" + "\nTexto..." + "\n");
		
		Scanner entrada = new Scanner(System.in);
		int ent;
		
		ent = entrada.nextInt();
		if(ent == 0) {
			exibeMenu();
		}
		else {
			System.out.println("Op��o Inv�lida!!!");
			exibeDefinicao();
		}
	}
	
	
}
