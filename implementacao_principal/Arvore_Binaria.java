package implementacao_principal;

import java.util.Scanner;

import tad_arvore_binaria.LinkedBinaryTree;

public class Arvore_Binaria {
	
	LinkedBinaryTree<Integer> arvoreBinaria = new LinkedBinaryTree<Integer>();
	
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
		
		menu[0] = "0. Definição de Árvore Binária";
		menu[1] = "1. Testar Árvore Binária na prática";
		menu[2] = "2. Voltar ao Menu Principal";
		
		for(int i=0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}		
		
		main();
	}
	
	public static void exibeDefinicao() {
		System.out.println("==================================== Árvore Binária ===================================" 
				+ "\n*** PRESSIONE '0' E DEPOIS 'ENTER' A QUALQUER MOMENTO PARA RETORNAR AO MENU ANTERIOR ***"
				+ "\n" + "\n- Definição" + "\nUma árvore binária é uma árvore ordenada com as seguintes propriedades:" 
				+ "\n1- Todos os nodos têm no máximo dois filhos. " 
				+ "\n2- Cada nodo filho é rotulado como sendo um filho da direita ou um filho da esquerda. " 
				+ "\n3- O filho da esquerda precede o filho da direita na ordenação dos filhos de um nodo. " 
				+ "\nA subárvore filho da direita é chamada de subárvore direita. " 
				+ "\nA subárvore filho da esquerda é chamada de subárvore esquerda. " 
				+ "\nA árvore binária é própria (ou cheia) se cada nodo tem 0 ou 2 filhos. " + "\n" 
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
		
	}
}
