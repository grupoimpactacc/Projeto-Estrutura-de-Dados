package implementacao_principal;

import java.util.Scanner;

public class Fila {
	
	public static void exibeMenu() {
		String menu[] = new String[3];
		
		menu[0] = "0. Definição de Fila";
		menu[1] = "1. Testar Fila na prática";
		menu[2] = "2. Voltar ao Menu Principal";
		
		for(int i=0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}		
		
		Scanner entrada = new Scanner(System.in);
		int ent;
		
		System.out.println("----------------------");
		System.out.println("Entre com o número da opção desejada: ");
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
				+ "\n" + "\n- Definição" + "\nTexto..." + "\n" 
				+ "\n- Inserção" + "\nTexto..." + "\n" 
				+ "\n- Remoção" + "\nTexto..." + "\n" 
				+ "\n- Visualização" + "\nTexto..." + "\n");

		Scanner entrada = new Scanner(System.in);
		int ent;
		
		ent = entrada.nextInt();
		if(ent == 0) {
		exibeMenu();
		}
		else {
		System.out.println("Opção Inválida!!!");
		exibeDefinicao();
		}
	}
}
