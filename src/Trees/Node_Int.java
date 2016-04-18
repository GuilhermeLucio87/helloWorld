package Trees;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Node_Int  {

	Integer item;
	Node_Int parent;
	Node_Int firstChild;
	Node_Int Next;

public		Node_Int(Integer Item) {
	
	this.item = item;
	this.parent = null;
	this.firstChild = null;
	Next = null;

}

public List <Node_Int>  Lista_Filhos () {
	List <Node_Int> lista_children = new LinkedList<Node_Int>();
	Node_Int trab;
	if (this.firstChild != null)
		lista_children.add(this.firstChild);
	    trab = this.firstChild ;
	    while (trab.Next != null) {
	    	lista_children.add(trab.Next);
	    	trab = trab.Next;
	    	
	    }return lista_children;
}



public void Imprime_Filhos () {
	
	List <Node_Int> lista_children = new LinkedList<Node_Int>();
	
	lista_children = this.Lista_Filhos();
	
	if(lista_children != null) {
		Iterator<Node_Int> il = lista_children.iterator();
		while (il.hasNext()) {
			System.out.print(" " + il.next ().item);
			
			
		}
	}
	else 
		System.out.print("Este nó não tem filho....");
		
	}
}