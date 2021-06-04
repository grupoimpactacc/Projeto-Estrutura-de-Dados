package tad_pilha;

import exceptions.EmptyStackException;

public interface Stack<E> {
	// Retorna o número de elementos na pilha.
	public int size();
	// Retorna True se a pilha é vazia, False em caso contrário.
	public boolean isEmpty();
	// Retorna o elemento que está no topo da pilha.
	public E top() throws EmptyStackException;
	// Elemento a ser inserido.
	public void push(E element);
	// Elemento removido.
	public E pop() throws EmptyStackException;
}