package implementacao_principal;

import java.util.Scanner;

import tad_lista_nodos.*;

public class Lista_Nodos {
	//Criacacao da minhaListaNodos
	static NodePositionList<Integer> minhaListaNodos = new NodePositionList<Integer>();
	static Position<Integer> p1;
	static Position<Integer> p2;
	static Position<Integer> p3;
	static Position<Integer> p4;
	static Position<Integer> p5;
	static Position<Integer> aux;
	
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
	//Implementacao da que exibe o Menu do TAD lista nodos
	public static void exibeMenu() {
		//Lista contendo as opcoes do usuario
		String menu[] = new String[3];
		menu[0] = "0. Definição de Lista de Nodos";
		menu[1] = "1. Testar Lista de Nodos na prática";
		menu[2] = "2. Voltar ao Menu Principal";
		//Exibe o Menu
		for(int i=0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}
		main();
	}
	
	public static void exibeDefinicao() {
		System.out.println("==================================== Lista de Nodos ===================================" 
				+ "\n*** PRESSIONE '0' E DEPOIS 'ENTER' A QUALQUER MOMENTO PARA RETORNAR AO MENU ANTERIOR ***"
				+ "\n" + "\n- Definição" + "\nÍndices não são a única maneira de se referir ao lugar onde um elemento aparece em uma sequência.\n" 
				+ "Se existe uma sequência implementada sobre uma LSE ou LDE, então\r\n"
				+ "é mais natural e eficiente usar um nodo em vez de um índice como\r\n"
				+ "forma de identificar onde acessar ou atualizar essa lista." + "\n" 
				+ "\n- Inserção" + "\nPara teste o TAD Lista Nodos se limita a 5 posições, sendo elas: p1, p2, p3, p4 e p5." 
				+ "\n1° Passo: " + "\nMétodo addFirst: Entra com um elemento e ele é inserido no íncio da lista.\n" 
				+ "\n2° Passo: " + "\nMétodo addLast: Entra com um elemento e ele é inserido no fim da lista.\n" 
				+ "\n3° Passo: " + "\nMétodo addAfter: Entra com o elemento e uma posição e o elemento será inserido após a posição declarada.\n" 
				+ "\n4° Passo: " + "\nMétodo addBefore: Entra com o elemento e uma posição e o elemento será inserido antes da posição declarada." + "\n" 
				+ "\n5° Passo: " + "\n- Remoção" + "\nEntra com a posição de remoção desejada." + "\n" 
				+ "\n- Visualização" + "\nPara visualizar basta selecionar a opção indicada e ela pode ser feita a qualquer momento." + "\n");

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
		String menuTeste[] = new String[7];
		menuTeste[0] = "0. Inserir elemento utilizando o método addFirst";
		menuTeste[1] = "1. Inserir elemento utilizando o método addLast";
		menuTeste[2] = "2. Inserir elemento utilizando o método addBefore";
		menuTeste[3] = "3. Inserir elemento utilizando o método addAfter";
		menuTeste[4] = "4. Remover elemento";
		menuTeste[5] = "5. Visualizar";
		menuTeste[6] = "6. Voltar";
		//FOR que exibe o Menu
		for(int i=0; i < menuTeste.length; i++) {
			System.out.println(menuTeste[i]);
		}
		//Variavel entrada do tipo Scanner para receber as entradas do usuario
		Scanner entrada = new Scanner(System.in);
		int ent; //Recebe a opcao do menu
		int entElemento; //Recebe o elemento
		String entPosition;
		ent = entrada.nextInt();
		//Se == 0, o usuario testa o metodo addFirst
		if(ent == 0) {
			try {
				System.out.println("Entre com o elemento: ");
				entElemento = entrada.nextInt();
				minhaListaNodos.addFirst(entElemento);
				p1 = minhaListaNodos.first();	
				p2 = minhaListaNodos.next(p1);
				p3 = minhaListaNodos.next(p2);
				p4 = minhaListaNodos.next(p3);
				p5 = minhaListaNodos.next(p5);
			}
			catch(Exception e) {
			}
			System.out.println("----------------------");
			exibeMenuTeste();
		}
		//Se == 1, o usuario testa o metodo addLast
		else if(ent == 1) {
			try {
				//O usuario entra com o valor do elemento
				System.out.println("Entre com o elemento: ");
				entElemento = entrada.nextInt();
				//o elemento é adcionado ao fim da lista
				minhaListaNodos.addLast(entElemento);
				if(minhaListaNodos.size() > 1 && minhaListaNodos.size() < 3) {
					p2 = minhaListaNodos.last();
				}
				else if(minhaListaNodos.size() > 2 && minhaListaNodos.size() < 4) {
					p3 = minhaListaNodos.last();
				}
				else if(minhaListaNodos.size() > 3 && minhaListaNodos.size() < 5) {
					p4 = minhaListaNodos.last();
				}
				else if(minhaListaNodos.size() > 4 && minhaListaNodos.size() < 6) {
					p5 = minhaListaNodos.last();
				}
			}
			catch(Exception e) {
			}
			System.out.println("----------------------");
			exibeMenuTeste();
		}
		//Se == 2, o usuario testa o metodo addBefore
		else if(ent == 2) {
			try { 
				//usuario entra com a posicao e o elemento a ser inserido
				System.out.println("Entre com a posição: ");
				entPosition = entrada.next();
				System.out.println("Entre com o elemento: ");
				entElemento = entrada.nextInt();
				//verifica posicao inserida pelo usuario
				if(entPosition.equals("p1")) {
					System.out.println("Utilize o método addFirst para adicionar ao início.");			
				}else if(entPosition.equals("p2")) { //verifica posicao inserida pelo usuario
					if(p2.toString() != null) { //Verifica se a posicao é nula ou nao
					minhaListaNodos.addBefore(p2, entElemento); //insere o valor anterior a posicao especificada
					}else {
						System.out.println("Posição atualmente vazia.");
					}	
				}else if(entPosition.equals("p3")) { //verifica posicao inserida pelo usuario
					if(p3.toString() != null) { //Verifica se a posicao é nula ou nao
						minhaListaNodos.addBefore(p3, entElemento); //insere o valor anterior a posicao especificada
						p2 = minhaListaNodos.prev(p3); //Define o prev da posicao
					}else {
						System.out.println("Posição atualmente vazia.");
					}	
				}else if(entPosition.equals("p4")) {//verifica posicao inserida pelo usuario
					if(p4.toString() != null) { //Verifica se a posicao é nula ou nao
						minhaListaNodos.addBefore(p4, entElemento); //insere o valor anterior a posicao especificada
						p3 = minhaListaNodos.prev(p4); //Define o prev da posicao
					}else {
						System.out.println("Posição atualmente vazia.");
					}	
				}else if(entPosition.equals("p5")) {//verifica posicao inserida pelo usuario
					if(p5.toString() != null) { //Verifica se a posicao é nula ou nao
						minhaListaNodos.addBefore(p5, entElemento); //insere o valor anterior a posicao especificada
						p4 = minhaListaNodos.prev(p5); //Define o prev da posicao
					}else {
						System.out.println("Posição atualmente vazia.");
					}	
				}else {
					System.out.println("Posição inválida!");
				}		
			}
			catch(Exception e) {
			}
			System.out.println("----------------------");
			exibeMenuTeste();
		}
		//Se == 3, o usuario testa o metodo addAfter
		else if(ent == 3) {
			try { 
				System.out.println("Entre com a posição: ");
				entPosition = entrada.next();
				System.out.println("Entre com o elemento: ");
				entElemento = entrada.nextInt();
				if(entPosition.equals("p1")) {//verifica posicao inserida pelo usuario
					if(p1 != null) { //Verifica se a posicao é nula ou nao
						minhaListaNodos.addAfter(p1, entElemento); //insere o valor apos a posicao especificada
						p2 = minhaListaNodos.next(p1); //Define o next da posicao
					}else {
						System.out.println("Posição atualmente vazia.");
					}	
				}else if(entPosition.equals("p2")) {//verifica posicao inserida pelo usuario
					if(p2 != null) { //Verifica se a posicao é nula ou nao
						minhaListaNodos.addAfter(p2, entElemento); //insere o valor apos a posicao especificada
						p3 = minhaListaNodos.next(p2); //Define o next da posicao
					}else {
						System.out.println("Posição atualmente vazia.");
					}
				}else if(entPosition.equals("p3")) {//verifica posicao inserida pelo usuario
					if(p3 != null) {//Verifica se a posicao é nula ou nao
						minhaListaNodos.addAfter(p3, entElemento); //insere o valor apos a posicao especificada
						p4 = minhaListaNodos.next(p3); //Define o next da posicao
					}else {
						System.out.println("Posição atualmente vazia.");
					}
				}else if(entPosition.equals("p4")) {//verifica posicao inserida pelo usuario
					if(p4 != null) {//Verifica se a posicao é nula ou nao
						minhaListaNodos.addAfter(p4, entElemento); //insere o valor apos a posicao especificada
						p5 = minhaListaNodos.next(p4); //Define o next da posicao
					}else {
						System.out.println("Posição atualmente vazia.");
					}
				}else if(entPosition.equals("p5")) {//verifica posicao inserida pelo usuario
					System.out.println("Tamanho máximo da lista é 5."); //insere o valor apos a posicao especificada
				}else {
					System.out.println("Posição inválida!");
				}		
			}
			catch(Exception e) {
			}
			System.out.println("----------------------");
			exibeMenuTeste();
		}
		//Se == 4 o usuario podera remover um elemento
		else if(ent == 4) {
			//Verifica se a lista nao esta vazia
			if(minhaListaNodos.isEmpty()) {
				System.out.println("Lista Vazia!");
			}
			else {
				System.out.println("Entre com a posição: ");
				entPosition = entrada.next();
				if(entPosition.equals("p1")) {
					if(p1 != null) { //Verifica se a posicao é nula ou nao
						aux = minhaListaNodos.next(p1);
						minhaListaNodos.remove(p1);
						p1 = aux;
						System.out.println("Elemento removido");
					}else {
						System.out.println("Posição atualmente vazia.");
					}					
				}else if(entPosition.equals("p2")) {
					if(p2 != null) { //Verifica se a posicao é nula ou nao
						aux = minhaListaNodos.next(p2);
						minhaListaNodos.remove(p2);
						p2 = aux;
						System.out.println("Elemento removido");
					}else {
						System.out.println("Posição atualmente vazia.");
					}
				}else if(entPosition.equals("p3")) {
					if(p3 != null) { //Verifica se a posicao é nula ou nao
						aux = minhaListaNodos.next(p3);
						minhaListaNodos.remove(p3);
						p3 = aux;
						System.out.println("Elemento removido");
					}else {
						System.out.println("Posição atualmente vazia.");
					}
				}else if(entPosition.equals("p4")) {
					if(p4 != null) { //Verifica se a posicao é nula ou nao
						aux = minhaListaNodos.next(p4);
						minhaListaNodos.remove(p4);
						p4 = aux;
						System.out.println("Elemento removido");
					}else {
						System.out.println("Posição atualmente vazia.");
					}
				}else if(entPosition.equals("p5")) {
					if(p5 != null) { //Verifica se a posicao é nula ou nao
						minhaListaNodos.remove(p5);
						System.out.println("Elemento removido");
					}else {
						System.out.println("Posição atualmente vazia.");
					}
				}else {
					System.out.println("Posição inválida!");
				}		
			}	
			System.out.println("----------------------");
			exibeMenuTeste();
		}
		//Se == 5 o usuario ira visualizar a lista nodos
		else if(ent == 5) {
			try {
				System.out.println(minhaListaNodos);
				System.out.println("----------------------");
				exibeMenuTeste();
			}
			catch(Exception e) {
			}
			finally {
				exibeMenuTeste();
			}
		}
		//Se == 6 retorna ao menu anterior
		else if(ent == 6) {
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
