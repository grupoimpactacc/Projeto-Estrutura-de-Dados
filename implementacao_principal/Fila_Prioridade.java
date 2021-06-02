package implementacao_principal;

import java.util.Scanner;

import tad_fila_prioridade.SortedListPriorityQueue;
import tad_fila_prioridade.PriorityQueue;
import tad_fila_prioridade.Entry;

public class Fila_Prioridade {
	
	static SortedListPriorityQueue<Integer,String> filaPrioridade = new SortedListPriorityQueue<Integer,String>();
	static Entry<Integer,String> aux;
	
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
			filaPrioridade.insert(1, "A");
			filaPrioridade.insert(2, "B");
			filaPrioridade.insert(3, "C");
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
		
		menu[0] = "0. Definição de Fila de Prioridade";
		menu[1] = "1. Testar Fila de Prioridade na prática";
		menu[2] = "2. Voltar ao Menu Principal";
		
		for(int i=0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}	
		
		main();
	}
	
	public static void exibeDefinicao() {
		System.out.println("================================== Fila de Prioridade =================================" 
				+ "\n*** PRESSIONE '0' E DEPOIS 'ENTER' A QUALQUER MOMENTO PARA RETORNAR AO MENU ANTERIOR ***"
				+ "\n" + "\n- Definição" + "\nA Fila de Prioridades armazena uma coleção de elementos priorizados que suporta a inserção de elementos arbitrários, mas a remoção de\r\n"
				+ "elementos ocorre em ordem de prioridade." 
				+ "\nA fila de prioridade armazena elementos de acordo com suas prioridades e não tem noção de “posição”." + "\n" 
				+ "\n- Inserção" + "\nEntre com o valor da chave (Integer) e então entre com o valor (String) do elemento." + "\n" 
				+ "\n- Remoção" + "\nAo escolher a opção de remoção, o elemento de chave mínima será removido automaticamente." + "\n" 
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
	
	public static void exibeMenuTeste() {
		//Inicilizacao dos indices do menu de teste
		String menuTeste[] = new String[4];
		menuTeste[0] = "0. Inserir par chave-valor";
		menuTeste[1] = "1. Remover par chave-valor";
		menuTeste[2] = "2. Visualizar";
		menuTeste[3] = "3. Voltar";
		//FOR que exibe o Menu
		for(int i=0; i < menuTeste.length; i++) {
			System.out.println(menuTeste[i]);
		}
		//Variavel entrada do tipo Scanner para receber as entradas do usuario
		Scanner entrada = new Scanner(System.in);
		int ent; //Recebe a opcao do menu
		int entChave; //Recebe o indice do ArrayList
		String entValor; //Recebe o elemento
		
		ent = entrada.nextInt();
		//Se ent == 0 libera opcao de inserção do par-chave valor
		if(ent == 0) {
			try {
				//recebe a chave
				System.out.println("Entre com a chave (Integer): ");
				entChave = entrada.nextInt();
				//recebe o valor
				System.out.println("Entre com o valor (String): ");
				entValor = entrada.next();
				//insere par chave-valor
				filaPrioridade.insert(entChave, entValor);
				System.out.println("----------------------");
				exibeMenuTeste();
			}
			catch(Exception e) {
			}	
			finally {
				System.out.println("Opção inválida");
				System.out.println("----------------------");
				exibeMenuTeste();
			}
		//Se ent == 1 libera opcao de remoção do par-chave valor
		}else if(ent == 1) {
			try {
				//armenza em aux para futuro retorno
				aux = filaPrioridade.removeMin();
				System.out.println("Par chave-valor removido: " + aux); //retorna o par removido
				System.out.println("----------------------");
				exibeMenuTeste();
			}
			catch(Exception e) {
			}
			finally {
				System.out.println("Opção inválida");
				System.out.println("----------------------");
				exibeMenuTeste();
			}
		//Se ent == 2 é possivel visualizar o tad fila prioridade
		}else if(ent == 2) {
			System.out.println(filaPrioridade);
			System.out.println("----------------------");
			exibeMenuTeste();
		//Se == 3 volta ao menu anterior
		}else if(ent == 3) {
			System.out.println("----------------------");
			exibeMenuTeste();
		}else {
			System.out.println("Opção inválida.");
			exibeMenuTeste();
		}
	}
}
