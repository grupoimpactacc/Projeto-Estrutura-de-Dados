package implementacao_principal;

import java.util.Scanner;

public class Fila {
	
	public static void exibeMenu() {
		String menu[] = new String[3];
		
		menu[0] = "0. Defini��o de Fila";
		menu[1] = "1. Testar Fila na pr�tica";
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
		
		else if(ent == 2) {
			Principal.exibeMenuPrincipal();
		}
	}
	
	public static void exibeDefinicao() {
		System.out.println("======================================== Fila =========================================" 
				+ "\n*** PRESSIONE '0' E DEPOIS 'ENTER' A QUALQUER MOMENTO PARA RETORNAR AO MENU ANTERIOR ***"
				+ "\n" + "\n- Defini��o" + "\nTexto..." + "\n" 
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
