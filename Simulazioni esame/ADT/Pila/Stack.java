public interface Stack extends Container{
	//inserisce un elemento in cima alla pila
	void push(Object obj);

	//elimina l'elemento in cima alla pila e ne restituisce il valore
	Object pop();

	//restituisce il valore in cima alla pila senza rimuoverlo
	Object top();
}
