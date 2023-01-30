public class PilaSicura implements Stack{
	
	private Object[] p;
	private int pSize;	
	
	public PilaSicura(){
		p = new Object[1];
		makeEmpty();
	}
	//inserisce un elemento in cima alla pila
	public void push(Object obj){
		if(!(obj instanceof String)){
			throw new IllegalArgumentException();
		}
		if(pSize == p.length){
			p = resize(p, 2*p.length);
		}
		p[pSize] = obj;
		pSize++;
	}
	private Object[] resize(Object[] o, int dim){
		Object[] x = new Object[dim];
		System.arraycopy(o, 0, x, 0, o.length);
		return x;
	}
	//elimina l'elemento in cima alla pila e ne restituisce il valore
	public Object pop(){
		Object old = p[pSize-1];
		pSize--;
		return old;
	}

	//restituisce il valore in cima alla pila senza rimuoverlo
	public Object top(){
		return p[pSize-1];
	}

	public boolean isEmpty(){
		return (pSize == 0);
	}
	public void makeEmpty(){
		pSize = 0;
	}

}
