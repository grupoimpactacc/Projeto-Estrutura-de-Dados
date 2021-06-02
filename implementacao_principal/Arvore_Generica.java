package implementacao_principal;

import java.util.Scanner;

import position.Position;
import tad_arvore_generica.LinkedTree;

public class Arvore_Generica {
	
	static LinkedTree<Integer> arvore = new LinkedTree<Integer>();
	static Position<Integer> pos;
	
	public static void main() {
		//Variavel entrada do tipo Scanner para receber a entrada do usuario
		Scanner entrada = new Scanner(System.in);
		int ent;
		System.out.println("Entre com o número da opção desejada: ");
		ent = entrada.nextInt();
		//Se == 0 exibe a Definicao da TAD em questao
		if(ent == 0) {
			System.out.println("----------------------");
			exibeDefinicao();
		}
		//Se == 1 exibe um menu de teste para o usuario
		else if(ent == 1) {
			System.out.println("----------------------");
			exibeMenuTeste();
		}
		//Se == 2 retorna ao menu Principal
		else if(ent == 2) {
			System.out.println("----------------------");
			Principal.main(null);
		}
		else {
			System.out.println("Opção inválida!");
			System.out.println("----------------------");
			exibeMenu();
		}
	}
	
	public static void exibeMenu() {
		String menu[] = new String[3];
		
		menu[0] = "0. Definição de Árvore Genérica";
		menu[1] = "1. Testar Árvore Genérica na prática";
		menu[2] = "2. Voltar ao Menu Principal";
		
		for(int i=0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}	
		
		main();
	}
	
	public static void exibeDefinicao() {
		System.out.println("=================================== Árvore Genérica ===================================" 
				+ "\n*** PRESSIONE '0' E DEPOIS 'ENTER' A QUALQUER MOMENTO PARA RETORNAR AO MENU ANTERIOR ***"
				+ "\n" + "\n- Definição" + "\nO TAD árvore armazena elementos em posições como as de uma lista, que são definidas em relação às posições de seus vizinhos." 
				+ "\nAs posições de uma árvore são seus nodos, e o posicionamento pela vizinhança satisfaz as relações pai-filho, que definem uma árvoreválida." 
				+ "\nAssim, os termos posição e nodo são usados com o mesmo sentido no caso de árvores." + "\n" 
				+ "\n- Inserção" + "\nTexto..." + "\n" 
				+ "\n- Remoção" + "\nTexto..." + "\n" 
				+ "\n- Visualização" + "\nTexto..." + "\n");

		Scanner entrada = new Scanner(System.in);
		int ent;
		ent = entrada.nextInt();
		//Se a entrada do usuario == 0, retorna para o menu anterior
		if(ent == 0) {
			System.out.println("----------------------");
			exibeMenu();
		}
		//Tratamento de erro caso o usuario digite um valor diferente de 0
		else {
			System.out.println("Digite '0' depois pressione ENTER para retornar ao menu anterior!");
			exibeDefinicao();
		}
	}
	
	public static void exibeMenuTeste() {
		//Inicilizacao dos indices do menu de teste
		String menuTeste[] = new String[4];
		menuTeste[0] = "0. Inserir elemento";
		menuTeste[1] = "1. Remover elemento";
		menuTeste[2] = "2. Visualizar";
		menuTeste[3] = "3. Voltar";
		//FOR que exibe o Menu
		for(int i=0; i < menuTeste.length; i++) {
			System.out.println(menuTeste[i]);
		}
		//Variavel entrada do tipo Scanner para receber as entradas do usuario
		Scanner entrada = new Scanner(System.in);
		int ent; //Recebe a opcao do menu
		
		ent = entrada.nextInt();
		
		if(ent == 0) {
			
		}
	}
}
