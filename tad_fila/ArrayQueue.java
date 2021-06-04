package tad_fila;

import exceptions.EmptyQueueException;
import exceptions.FullQueueException;

public class ArrayQueue<E> implements Queue<E> {
	protected int capacity;
	public static final int CAPACITY = 1000;
	protected E Q[];
	protected int f, r = 0;
	
	public ArrayQueue() {
		this(CAPACITY);
	}
	
	@SuppressWarnings("unchecked")
	public ArrayQueue(int cap) {
		capacity = cap;
		Q = (E[]) new Object[capacity];
	}
	
	public boolean isEmpty() {
		return (f == r);
	}
	
	public int size() {
		return (capacity - f + r) % capacity;
	}
	
	public E front() throws EmptyQueueException{
		if (isEmpty()) throw new EmptyQueueException("Fila vazia");
		return Q[f];
	}
	
	public void enqueue (E element) throws FullQueueException {
		if (size()==(capacity - 1)) throw new FullQueueException("Fila cheia");
		Q[r] = element;
		r = (r + 1) % capacity;
	}
	
	public E dequeue() throws EmptyQueueException{
		E temp;
		if (isEmpty()) throw new EmptyQueueException("Fila vazia");
		temp = Q[f];
		Q[f] = null;
		f = (f + 1) % capacity;
		return temp;
	}
	
	public String toString() {
		String s;
		int tf = f;
		
		s = "[";
		if (size() > 0) {
			s += Q[tf];
			tf = (tf + 1) % capacity;
		}
		if (size() > 1) {
			while (tf != r) {
				s += ", " + Q[tf];
				tf = (tf + 1) % capacity;
			}
		}
		return s + "]";
	}
}
