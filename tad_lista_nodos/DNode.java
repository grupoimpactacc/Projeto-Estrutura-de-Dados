package tad_lista_nodos;

import exceptions.InvalidPositionException;

public class DNode<E> implements Position<E> {
	private DNode<E> prev, next;
	private E element;
	
	public DNode(DNode<E> newPrev, DNode<E> newNext, E elem) {
		prev = newPrev;
		next = newNext;
		element = elem;
	}
	
	public E element() throws InvalidPositionException{
		if ((prev == null) && (next == null))
			throw new InvalidPositionException("Posi��o n�o est� na lista");
		return element;
	}
	
	public DNode<E> getNext() { return next;}
	public DNode<E> getPrev() {return prev;}
	
	public void setNext(DNode<E> newNext) {next = newNext;}
	public void setPrev(DNode<E> newPrev) {prev = newPrev;}
	public void setElement(E newElement) {element = newElement;}
	
}
