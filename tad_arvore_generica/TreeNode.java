package tad_arvore_generica;
import position.Position;
import tad_lista_nodos.PositionList;

public class TreeNode<E> implements TreePosition<E> {
	private E element; 
	private TreePosition<E> parent;
	private PositionList<Position<E>> children; 

	public TreeNode() {}

	public TreeNode(E element, TreePosition<E> parent, PositionList<Position<E>> children) {
		setElement(element);
		setParent(parent);
		setChildren(children);
	}
	// Retorna o elemento armazenado nesta posi��o.
	public E element() { return element; }
	// Define o elemento a ser armazenado nesta posi��o
	public void setElement(E o) { element = o; }
	// Retorna o elemento armazenado nesta posi��o
	public E getElement() { return element; }
	// Retorna os filhos desta posi��o
	public PositionList<Position<E>> getChildren() { return children; }
	// Define os filhos desta posi��o
	public void setChildren(PositionList<Position<E>> c) { children = c; }
	// Retorna o pai desta posi��o
	public TreePosition<E> getParent() { return parent; }
	// Define o pai desta posi��o
	public void setParent(TreePosition<E> v) { parent = v; }
}
