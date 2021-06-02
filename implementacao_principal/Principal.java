
/*
 * GRUPO 3
 * Bruno de Proença Campos RA: 1903364
	Guilherme Ribeiro RA: 1902596
	Kauan Malvino RA: 1902880
	Leonardo Vallada Viana RA: 1902965
	Lucas Fileno RA: 1902881
 */

package implementacao_principal;
import java.util.Scanner;
import tad_arvore_binaria.*;
import tad_arvore_generica.*;
import tad_dicionario.*;
import tad_fila.*;
import tad_fila_prioridade.*;
import tad_lista_arranjo.*;
import tad_lista_nodos.*;
import tad_mapa.*;
import tad_pilha.*;
//import tad_mapa_ordenado_abb.*;
//import tad_mapa_ordenado_avl.*;


public class Principal {
	// Inicilização da lista de TADs
	public static String listaTad[] = new String[13];
	
	public static void main(String[] args) {
		// Inicialização dos valores da lista
		listaTad[0] = "0. TAD-Lista Arranjo";
		listaTad[1] = "1. TAD-Pilha";
		listaTad[2] = "2. TAD-Fila";
		listaTad[3] = "3. TAD-Lista de Nodos";
		listaTad[4] = "4. TAD-Árvore Genérica";
		listaTad[5] = "5. TAD-Árvore Binária";
		listaTad[6] = "6. TAD-Fila de Prioridade";
		listaTad[7] = "7. TAD-Mapa";
		listaTad[8] = "8. TAD-Dicionário";
		listaTad[9] = "9. TAD-Mapa Ordenado - ABB";
		listaTad[10] = "10. TAD-Mapa Ordenado - AVL";
		listaTad[11] = "11. TAD-Grafos";
		listaTad[12] = "-1. Sair";
		
		exibeMenuPrincipal();
	}
	//Exibe o Menu Principal
	public static void exibeMenuPrincipal() {
		//Exibe atraves de um FOR, indice por indice
		for(int i=0; i < listaTad.length; i++) {
			System.out.println(listaTad[i]);
		}
		//Variavel entrada do tipo Scanner, para receber as entradas do usuario
		Scanner entrada = new Scanner(System.in);
		int ent = 0;
		
		System.out.println("----------------------");
		System.out.println("Entre com o número da opção desejada: ");
		ent = entrada.nextInt();
		//Exibe o Menu de cada TAD de acordo com o valor de entrada do usuário
		if(ent == 0) {
			Lista_Arranjo.exibeMenu();
		}
		
		else if(ent == 1) {
			Pilha.exibeMenu();
		}
		
		else if(ent == 2) {
			Fila.exibeMenu();
		}
		
		else if(ent == 3) {
			Lista_Nodos.exibeMenu();
		}
		
		else if(ent == 4) {
			Arvore_Generica.exibeMenu();
		}
		
		else if(ent == 5) {
			Arvore_Binaria.exibeMenu();
		}
		
		else if(ent == 6) {
			Fila_Prioridade.exibeMenu();
		}
		
		else if(ent == 7) {
			Mapa.exibeMenu();
		}
		
		else if(ent == 8) {
			Dicionario.exibeMenu();
		}
		
		else if(ent == 9) {
			Mapa_Ordenado_ABB.exibeMenu();
		}
		
		else if(ent == 10) {
			Mapa_Ordenado_AVL.exibeMenu();
		}
		
		else if(ent == 11) {
			Grafos.exibeMenu();
		}	
		
		else if(ent == -1) {
			System.exit(ent);
		}
		
		else {
			System.out.println("Opção Inválida!!!");
			System.out.println("----------------------");
			exibeMenuPrincipal();
		}
	}
}
