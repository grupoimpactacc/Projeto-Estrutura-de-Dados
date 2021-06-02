package implementacao_principal;

import java.util.Scanner;

import tad_dicionario.HashTableMultiMap;
import tad_fila_prioridade.Entry;

public class Dicionario {
	
	static HashTableMultiMap<Integer, String> dicionario = new HashTableMultiMap<Integer, String>();
	static java.util.Map.Entry<Integer, String> aux;
	static Iterable<java.util.Map.Entry<Integer, String>> auxx;
	
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
	//implementacao que exibe o menu do TAD
	public static void exibeMenu() {
		//lista que contem as opcoes
		String menu[] = new String[3];	
		menu[0] = "0. Definição de Dicionário";
		menu[1] = "1. Testar Dicionário na prática";
		menu[2] = "2. Voltar ao Menu Principal";
		//exibe o menu
		for(int i=0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}
		main();
	}
	//implementacao da definicao
	public static void exibeDefinicao() {
		System.out.println("===================================== Dicionário ======================================" 
				+ "\n*** PRESSIONE '0' E DEPOIS 'ENTER' A QUALQUER MOMENTO PARA RETORNAR AO MENU ANTERIOR ***"
				+ "\n" + "\n- Definição" + "\nComo mapas, dicionários armazenam pares chave-valor (k,v)\r\n"
				+ "(entradas), onde as chaves e valores podem ser de qualquer tipo."
				+ "\nMapas devem ter chaves únicas, dicionários podem ter múltiplas\r\n"
				+ "entradas com a mesma chave, parecidos com dicionários de idiomas,\r\n"
				+ "que têm múltiplas definições para uma mesma palavra. " + "\n" 
				+ "\n- Inserção" + "\nEntre com a chave e então entre com o valor." + "\n" 
				+ "\n- Remoção" + "\nEntre com o valor da chave e o par chave-valor correspondente será removido." + "\n" 
				+ "\n- Visualização" + "\nPara visualizar entre com a chave e o par chave-valor do dicionário será apresentado." + "\n");
		
		//Variavel entrada do tipo Scanner para receber as entradas do usuario
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
	//implementacao do menu de teste
	public static void exibeMenuTeste() {
		//Inicilizacao dos indices do menu de teste
		String menuTeste[] = new String[4];
		menuTeste[0] = "0. Inserir par chave-valor";
		menuTeste[1] = "1. Remover par chave-valor";
		menuTeste[2] = "2. Visualizar elementos do dicionário";
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
				dicionario.put(entChave, entValor);
				System.out.println("----------------------");
				exibeMenuTeste();
			}
			catch(Exception e) {
			}
			finally {
				System.out.println("----------------------");
				exibeMenuTeste();
			}
		}
		//Se ent == 1 libera opcao de remocao
		else if(ent == 1) {
			try {
				//recebe a chave
				System.out.println("Entre com a chave (Integer): ");
				entChave = entrada.nextInt();
				//se nao for nula, remove o par correspondente a chave
				if(dicionario.get(entChave) != null) {
					aux = dicionario.get(entChave);
					dicionario.remove(aux);
				//sendo nula, apresenta mensagem de posicao vazia
				}
				else {
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
		//Se == 2 e possivel visualizar
		else if(ent == 2) {
			try {
				//variavel que ira receber e entrada do usuario
				int entKey;
				//recebe a chave
				System.out.println("Entre com uma chave (Integer) existente: ");
				entKey = entrada.nextInt();
				//verifica se a chave existe
				if(dicionario.get(entKey) != null) {
					auxx = dicionario.getAll(entKey); //armazena em aux os conjuntos que possuem a chave declarada
					System.out.println(auxx); //exibe conjuntos
				}
				else {
					System.out.println("Chave inexistente.");
				}
			}
			catch(Exception e) {
			}
			finally {
				System.out.println("----------------------");
				exibeMenuTeste();
			}
			System.out.println("----------------------");
			exibeMenuTeste();
		}
		//retorna ao menu anterior
		else if(ent == 3) {
			System.out.println("----------------------");
			exibeMenuTeste();
		}
		//posicao invalida caso o usuario entre com uma opcao inexistente
		else {
			System.out.println("Posição inválida.");
			System.out.println("----------------------");
			exibeMenuTeste();
		}
	}
}
