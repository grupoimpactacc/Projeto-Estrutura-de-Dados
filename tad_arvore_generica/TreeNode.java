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
	// Retorna o elemento armazenado nesta posição.
	public E element() { return element; }
	// Define o elemento a ser armazenado nesta posição
	public void setElement(E o) { element = o; }
	// Retorna o elemento armazenado nesta posição
	public E getElement() { return element; }
	// Retorna os filhos desta posição
	public PositionList<Position<E>> getChildren() { return children; }
	// Define os filhos desta posição
	public void setChildren(PositionList<Position<E>> c) { children = c; }
	// Retorna o pai desta posição
	public TreePosition<E> getParent() { return parent; }
	// Define o pai desta posição
	public void setParent(TreePosition<E> v) { parent = v; }
}
