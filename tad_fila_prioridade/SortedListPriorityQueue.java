package tad_fila_prioridade;
import java.util.Comparator;

import exceptions.EmptyPriorityQueueException;
import exceptions.InvalidKeyException;
import tad_lista_nodos.Position;
import tad_lista_nodos.NodePositionList;
import tad_lista_nodos.PositionList;


public class SortedListPriorityQueue<K, V> implements PriorityQueue<K, V> {
	protected PositionList<Entry<K, V>> entries;
	protected Comparator<K> compa;
	protected Position<Entry<K, V>> actionPos; // variable used by subclasses

	protected static class MyEntry<K, V> implements Entry<K, V> {
		protected K k; // key
		protected V v; // value
		public MyEntry(K key, V value) {
			k = key;
			v = value;
		}
		public K getKey() { return k; }
		public V getValue() { return v; }
		public String toString() { return "(" + k + "," + v + ")"; }
	}
	public SortedListPriorityQueue() {
		entries = new NodePositionList<Entry<K, V>>();
		compa = new DefaultComparator<K>();
	}
	
	public SortedListPriorityQueue(Comparator<K> comp) {
		entries = new NodePositionList<Entry<K, V>>();
		compa = comp;
	}

	public SortedListPriorityQueue(PositionList<Entry<K, V>> list, Comparator<K> comp) {
		entries = list;
		compa = comp;
	}

	public void setComparator(Comparator<K> comp) throws IllegalStateException {
		if (!isEmpty()) throw new IllegalStateException("Priority queue is not empty");
		compa = comp;
	}

	public int size() { return entries.size(); }

	public boolean isEmpty() { return entries.isEmpty(); }

	public Entry<K, V> min() throws EmptyPriorityQueueException {
		if (entries.isEmpty()) throw new EmptyPriorityQueueException("priority queue is empty");
		else return entries.first().element();
	}

	public Entry<K, V> insert(K k, V v) throws InvalidKeyException {
		checkKey(k); // auxiliary key-checking method (could throw exception)
		Entry<K, V> entry = new MyEntry<K, V>(k, v);
		insertEntry(entry); // auxiliary insertion method
		return entry;
	}
	
	protected void insertEntry(Entry<K, V> e) {
			if (entries.isEmpty()) {
				entries.addFirst(e); // insere na lista vazia
				actionPos = entries.first(); // posição de inserção
			} else if (compa.compare(e.getKey(), entries.last().element().getKey()) > 0) {
				entries.addLast(e); // insere no final da lista
				actionPos = entries.last(); // posição de inserção
			} else {
				Position<Entry<K, V>> curr = entries.first();
				while (compa.compare(e.getKey(), curr.element().getKey()) > 0) {
					curr = entries.next(curr); // avança para encontrar a posição de inserção
				}
				entries.addBefore(curr, e);
				actionPos = entries.prev(curr); // posição de inserção
			}
		}
		
	public Entry<K, V> removeMin() throws EmptyPriorityQueueException {
			if (entries.isEmpty()) throw new EmptyPriorityQueueException("priority queue is empty");
			else return entries.remove(entries.first());
	}
		
	protected boolean checkKey(K key) throws InvalidKeyException {
		boolean result;
		try { // verifica se a chave pode ser comparada
			result = (compa.compare(key, key) == 0);
		} catch (ClassCastException e) {
			throw new InvalidKeyException("key cannot be compared");
		}
		return result;
	}
	
	public String toString() {
		return entries.toString();
	}
}
