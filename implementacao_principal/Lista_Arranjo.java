package implementacao_principal;
import tad_lista_arranjo.*;
import java.util.Scanner;

public class Lista_Arranjo {
	// Criacao da ArrayIndexList minhaLista do tipo Integer
	static ArrayIndexList<Integer> minhaLista = new ArrayIndexList<Integer>();
	//Classe principal da Lista Arranjo
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
		String menu[] = new String[3];
		menu[0] = "0. Definição de Lista Arranjo";
		menu[1] = "1. Testar Lista Arranjo na prática";
		menu[2] = "2. Voltar ao Menu Principal";
		//Exibe o menu
		for(int i=0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}
		main();
	}
	//Implementacao do metodo que exibe a definicao da TAD em questao
	public static void exibeDefinicao() {
		System.out.println("==================================== Lista Arranjo ====================================" 
							+ "\n*** PRESSIONE '0' E DEPOIS 'ENTER' A QUALQUER MOMENTO PARA RETORNAR AO MENU ANTERIOR ***"
							+ "\n" + "\n- Definição" + "\nUma lista arranjo (ou vetor) é uma coleção S de N elementos\r\n"
							+ "armazenados em uma certa ordem linear, de maneira que é possível\r\n"
							+ "se referir aos elementos de S como 1º, 2º, 3º e assim por diante." + "\n" 
							+ "\n- Inserção" + "\n1- Entre com o índice. OBS: O índice não deve ser maior que o tamanho da lista arranjo atual"
							+ "\n2- Entre com o valor do elemento. OBS: Teste somente com números inteiros\n" 
							+ "\n- Remoção" + "\nEntre com o índice do elemento a ser removido. OBS: O índice não deve ser maior que o tamanho da lista arranjo atual" + "\n" 
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
		int entIndice = 0; //Recebe o indice do ArrayList
		int entElemento; //Recebe o elemento
		ent = entrada.nextInt();
		//Se == 0, o usuario podera inserir um elemento
		if(ent == 0) {
			System.out.println("Entre com o índice: ");
			entIndice = entrada.nextInt();
			//Caso o indice digitado seja menor ou igual ao tamanho da lista arranjo, o teste pode ser concluido
			if(entIndice <= minhaLista.size()) {
				System.out.println("Entre com o elemento: ");
				entElemento = entrada.nextInt();
				minhaLista.add(entIndice, entElemento);
			}
			//Se o indice for maior que o tamanho da lista arranjo, ele retorna ao menu anterior
			else {
				System.out.println("Índice maior que o tamanho da Lista Arranjo atual");
			}
			System.out.println("----------------------");
			exibeMenuTeste();
		}
		//Se == 1 o usuario podera remover um elemento
		else if(ent == 1) {
			//A remocao do elemento e feita atraves da declaracao do indice
			System.out.println("Entre com o índice do elemento a ser removido: ");
			entIndice = entrada.nextInt();
			if(entIndice <= minhaLista.size()) {
				minhaLista.remove(entIndice); //Metodo remove recebe a entrada do usuario
			}
			//Tratamento de erro para caso o usuairo entre com um indice invalido
			else {
				System.out.println("Índice maior que o tamanho da Lista Arranjo atual");
			}
			System.out.println("----------------------");
			exibeMenuTeste();
		}
		//Se == 2 o usuario ira visualizar a lista arranjo
		else if(ent == 2) {
			System.out.println(minhaLista);
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
