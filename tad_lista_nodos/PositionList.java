package tad_lista_nodos;
import java.util.Iterator;

import exceptions.BoundaryViolationException;
import exceptions.InvalidPositionException;

public interface PositionList<E> extends Iterable<E> {
	public int size();
	public boolean isEmpty();
	public Position<E> first();
	public Position<E> last();
	public Position<E> next(Position<E> p) throws InvalidPositionException, BoundaryViolationException;
	public Position<E> prev(Position<E> p) throws InvalidPositionException, BoundaryViolationException;
	// Insere um elemento no in�cio da lista, retornando uma posi��o nova.
	public void addFirst(E e);
	// Insere um elemento na �ltima posi��o, retornando uma posi��o nova.
	public void addLast(E e);
	// Insere um elemento ap�s um dado elemento da lista.
	public void addAfter(Position<E> p, E e) throws InvalidPositionException;
	// Insere um elemento antes de um dado elemento da lista.
	public void addBefore(Position<E> p, E e) throws InvalidPositionException;
	// Remove um nodo da lista, retornando o elemento l� armazenado.
	public E remove(Position<E> p) throws InvalidPositionException;
	public E set(Position<E> p, E e) throws InvalidPositionException;
	public Iterator<E> iterator();
	public void makeFirst(Position<E> p) throws InvalidPositionException;
}
