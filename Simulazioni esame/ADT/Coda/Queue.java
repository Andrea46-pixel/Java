public interface Queue{
	//inserisce un elemento in coda
	void enqueue(Object obj);
	//estrae il primo elemento dalla coda
	Object dequeue();
	//restituisce il primo elemento dalla coda senza rimuoverlo
	Object getFront();
}
