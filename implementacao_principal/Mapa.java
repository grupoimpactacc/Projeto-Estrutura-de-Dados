package implementacao_principal;

import java.util.Scanner;

import tad_fila_prioridade.Entry;
import tad_mapa.HashTableMap;

public class Mapa {
	
	static HashTableMap<Integer, String> mapa = new HashTableMap<Integer, String>();
	static String aux;
	
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
		menu[0] = "0. Definição de Mapa";
		menu[1] = "1. Testar Mapa na prática";
		menu[2] = "2. Voltar ao Menu Principal";
		
		for(int i=0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}
		main();
	}
	
	public static void exibeDefinicao() {
		System.out.println("======================================== Mapa =========================================" 
				+ "\n*** PRESSIONE '0' E DEPOIS 'ENTER' A QUALQUER MOMENTO PARA RETORNAR AO MENU ANTERIOR ***"
				+ "\n" + "\n- Definição" + "\nMapas permitem armazenar elementos que podem ser localizados rapidamente usando chaves." 
				+ "\nUm mapa armazena um par chave-valor (k,v), chamado de entradas, onde k é a chave e v é o valor correspondente. "
				+ "\nO TAD mapa requer que cada chave seja única." 
				+ "\nNum mapa que armazena um registro de estudantes (como o nome do estudante, endereço e suas notas), a chave pode ser o RA." 
				+ "\nA chave pode ser vista como um “endereço” para um objeto." + "\n" 
				+ "\n- Inserção" + "\nEntre com a chave (Integer) após, entre com o valor (String) e então o par chave-valor será alocado, ou subscreverá uma posição caso já esteja ocupada" + "\n" 
				+ "\n- Remoção" + "\nEntre com a chave e o par chave-valor correspondente será removido." + "\n" 
				+ "\n- Visualização" + "\nSelecionar a opção de visualização desejada, visuliza Chaves ou Valores do mapa." + "\n");

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
		String menuTeste[] = new String[5];
		menuTeste[0] = "0. Inserir par chave-valor";
		menuTeste[1] = "1. Remover par chave-valor";
		menuTeste[2] = "2. Visualizar todas as chaves do mapa";
		menuTeste[3] = "3. Visualizar todos os valores do mapa";
		menuTeste[4] = "4. Voltar";
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
				//verifica se ja existe a chave
				if(mapa.get(entChave) != null) {
					aux = mapa.get(entChave); //se existe a armazena em aux
				}
				//insere par chave-valor
				mapa.put(entChave, entValor);
				System.out.println("Par chave-valor anterior: " + aux);
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
		}
		//Se == 1 libera opcao de remocao
		else if(ent == 1) {
			try {
				//recebe a chave
				System.out.println("Entre com a chave (Integer): ");
				entChave = entrada.nextInt();
				//se nao for nula, remove o par correspondente a chave
				if(mapa.get(entChave) != null) {
					mapa.remove(entChave);
				//sendo nula, apresenta mensagem de posicao vazia
				}else {
					System.out.println("Posição vazia.");
				}
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
		}
		//se == 2 visualiza todas as chaves do mapa
		else if(ent == 2) {	
			//printa todas as chaves do mapa
			System.out.println(mapa.keySet());
			System.out.println("----------------------");
			exibeMenuTeste();
		}
		//se == 3 visualiza todos os valores do mapa
		else if(ent == 3) {
			//printa todos os valores do mapa
			System.out.println(mapa.values());
			System.out.println("----------------------");
			exibeMenuTeste();
		}
		//se == 4 retorna ao menu anterior
		else if(ent == 4) {
			System.out.println("----------------------");
			exibeMenuTeste();
		}else {
			System.out.println("Opção inválida.");
			exibeMenuTeste();
		}	
	}
}
