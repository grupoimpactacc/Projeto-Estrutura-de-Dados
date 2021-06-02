package implementacao_principal;
import tad_fila.*;


import java.util.Scanner;

public class Fila {
	
	// Criacao da ArrayIndexList minhaLista do tipo Integer
	static ArrayQueue<Integer> minhaFila = new ArrayQueue<Integer>();
	
	public static void main() {
		//Variavel entrada do tipo Scanner para receber a entrada do usuario
		Scanner entrada = new Scanner(System.in);
		int ent;
		System.out.println("Entre com o n�mero da op��o desejada: ");
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
			System.out.println("Op��o inv�lida!");
			System.out.println("----------------------");
			exibeMenu();
		}
	}
	
	public static void exibeMenu() {
		String menu[] = new String[3];		
		menu[0] = "0. Defini��o de Fila";
		menu[1] = "1. Testar Fila na pr�tica";
		menu[2] = "2. Voltar ao Menu Principal";
		
		for(int i=0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}		
		main();
	}
	
	public static void exibeDefinicao() {
		System.out.println("======================================== Fila =========================================" 
				+ "\n*** PRESSIONE '0' E DEPOIS 'ENTER' A QUALQUER MOMENTO PARA RETORNAR AO MENU ANTERIOR ***"
				+ "\n" + "\n- Defini��o" + "\nDefine uma cole��o que mant�m objetos em uma sequ�ncia\n" 
				+ "O acesso aos elementos e sua remo��o s�o restritos ao primeiro elemento da sequ�ncia, que � chamado de in�cio da fila.\n" 
				+ "A inser��o de elementos � restrita ao fim da sequ�ncia, que � chamada de fim da fila.\n" 
				+ "Essa restri��o garante a regra FIFO." + "\n" 
				+ "\n- Inser��o" + "\nEntre com o valor do elemento (Tipo Integer) e o TAD Fila o insere sempre no final da Fila." + "\n" 
				+ "\n- Remo��o" + "\nSelecione a op��o de teste Remover, e o TAD Fila remove sempre o elemento a frente na Fila." + "\n" 
				+ "\n- Visualiza��o" + "\nPara visualizar basta selecionar a op��o indicada." + "\n");

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
				minhaFila.enqueue(entElemento); //Insere o o elemento ao final da Fila
			}
			catch(Exception e) {
			}
			System.out.println("----------------------");
			exibeMenuTeste();
		}
		//Se == 1 o usuario podera remover um elemento
		else if(ent == 1) {
			//Verifica se a fila nao esta vazia
			if(minhaFila.isEmpty()) {
				System.out.println("Fila Vazia!");
			}
			else {
				minhaFila.dequeue();
				System.out.println("Elemento � frente da Fila removido");
			}	
			System.out.println("----------------------");
			exibeMenuTeste();
		}
		//Se == 2 o usuario ira visualizar a lista arranjo
		else if(ent == 2) {
			System.out.println(minhaFila);
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
