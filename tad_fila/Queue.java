package tad_fila;

import exceptions.EmptyQueueException;

public interface Queue<E> {
	//Retorna o número de elementos na fila.
	public int size();
	//Retorna se a fila está vazia.
	public boolean isEmpty();
	//Inspeciona o elemento à frente da fila.
	public E front() throws EmptyQueueException;
	//Insere elemento no final da fila.
	public void enqueue(E element);
	//Remove o elemento à frente da fila.
	public E dequeue() throws EmptyQueueException;
}
