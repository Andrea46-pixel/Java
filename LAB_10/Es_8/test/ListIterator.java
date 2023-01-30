public interface ListIterator{
	
	//Funzionamento del costruttore: quando viene costruito, l'iteratore si trova nella prima posizione, cioè dopo il
	//nodo header

	//se l'iteratore si trova alla fine della lista concatenata, lancia NoSuchElementException, altrimenti restituisce
	//l'oggetto che si trova nel nodo posto DOPO la posizione attuale e sposta l'iteratore di una posizione in avanti lungo 	//la catena 
	Object next();

	//verifica se è possibile invocare next() senza che venga lanciata un'eccezione
	boolean hasNext();

	//inserisce x prima della posizione attuale, senza modificare la posizione dell'iteratore
	void add(Object x);

	//Lancia IllegalStateException se invocato due volte consecutive, altrimenti elimina l'ultimo oggetto esaminato da 
	//next() o inserito da add() senza modificare la posizione dell'iteratore
	void remove();

}
