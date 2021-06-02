package implementacao_principal;

import java.util.Scanner;

import tad_pilha.*;

public class Pilha {
	
	// Criacao da ArrayStack minhaPilha do tipo Integer
	static ArrayStack<Integer> minhaPilha = new ArrayStack<Integer>();
	
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
	//Implementacao da exibicao do menu da TAD em questao
	public static void exibeMenu() {
		//Criacao de uma lista contendo as opcoes do usuario
		String menu[] = new String[3];
		menu[0] = "0. Definição de Pilha";
		menu[1] = "1. Testar Pilha na prática";
		menu[2] = "2. Voltar ao Menu Principal";
		//Exibe o menu
		for(int i=0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}
		main();
	}
	//Implementacao do metodo que exibe a definicao da TAD em questao
	public static void exibeDefinicao() {
		System.out.println("======================================== Pilha ========================================" 
				+ "\n*** PRESSIONE '0' E DEPOIS 'ENTER' A QUALQUER MOMENTO PARA RETORNAR AO MENU ANTERIOR ***"
				+ "\n" + "\n- Definição" + "\nColeção de objetos que são inseridos e retirados de acordo com o\r\n"
				+ "princípio de que o último que entra é o primeiro que sai (LIFO).\n" + "O nome “pilha” deriva-se da metáfora de uma pilha de pratos.\n"
				+ "Quando um novo prato se faz necessário, retira-se o prato do topo da\r\n"
				+ "pilha (pop) e quando se acrescenta um prato, este é colocado sobre\r\n"
				+ "os já empilhados (push), passando a ser o novo topo. " + "\n" 
				+ "\n- Inserção" + "\nEntre com o valor do elemento a ser inserido. OBS: Teste somente com números inteiros" + "\n" 
				+ "\n- Remoção" + "\nSelecione a opção de remoção, o TAD Pilha remove sempre o último elemento que foi inserido." + "\n" 
				+ "\n- Visualização" + "\nPara visualizar basta selecionar a opção indicada." + "\n");

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
	
	//Implementacao do metodo que exibe o menu de teste
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
		int entElemento; //Recebe o elemento
		ent = entrada.nextInt();
		//Se == 0, o usuario podera inserir um elemento
		if(ent == 0) {
			try {
				System.out.println("Entre com o elemento: ");
				entElemento = entrada.nextInt();
				minhaPilha.push(entElemento);
			}
			catch(Exception e) {
			}
			System.out.println("----------------------");
			exibeMenuTeste();
		}
		//Se == 1 o usuario podera remover um elemento
		else if(ent == 1) {
			//Verifica se a pilha nao esta vazia
			if(minhaPilha.isEmpty()) {
				System.out.println("Pilha Vazia!");
			}
			else {
				minhaPilha.pop();
				System.out.println("Elemento do topo da Pilha removido");
			}	
			System.out.println("----------------------");
			exibeMenuTeste();
		}
		//Se == 2 o usuario ira visualizar a lista arranjo
		else if(ent == 2) {
			System.out.println(minhaPilha);
			System.out.println("----------------------");
			exibeMenuTeste();
		}
		//Se == 3 retorna ao menu anterior
		else if(ent == 3) {
			System.out.println("----------------------");
			exibeMenu();
		}
		//Se houve opcao invalida, retorna ao menu de teste
		else {
			System.out.println("----------------------");
			exibeMenuTeste();
		}
	}
}
