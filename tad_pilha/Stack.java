package tad_pilha;

import exceptions.EmptyStackException;

public interface Stack<E> {
	// Retorna o n�mero de elementos na pilha.
	public int size();
	// Retorna True se a pilha � vazia, False em caso contr�rio.
	public boolean isEmpty();
	// Retorna o elemento que est� no topo da pilha.
	public E top() throws EmptyStackException;
	// Elemento a ser inserido.
	public void push(E element);
	// Elemento removido.
	public E pop() throws EmptyStackException;
}