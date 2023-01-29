public class ArrayDeque implements Deque{

	protected Object[] p;
	protected int first;
	protected int last;
	protected int size;

	public ArrayDeque(){
		p = new Object[1];
		makeEmpty();
	}
	
	//FATTO
	public boolean isEmpty(){
		return (size == 0);
	}
	public int getSize(){
		return size;
	}
	//FATTO
	public void makeEmpty(){
		first = 0;
		last = 0;
		size = 0;
	}
	//FATTO
	public int increment(int index){
		return (index + 1)%p.length;
	}
	//FATTO
	public int decrement(int index){
		if(index == 0){
			return p.length -1;
		}
		return (index-1);
	}
	/**
      inserisce l'elemento specificato all'inizio alla doppia coda
      @param element l'elemento da inserire
	*/
	//FATTO
	public void addFirst(Object element){
		if(size == p.length){
			p = resize(p, 2*p.length);					//FARE RESIZE
		}

		if(size == 0){
			p[0] = element;
			first = p.length -1;
			last = 1;
		}
		else{
			p[first] = element;
			first = decrement(first);
		}
		size++;
	}
   	//FATTO
	private Object[] resize(Object[] q, int dim){
		/*Object[] x = new Object[dim];
		System.arraycopy(q, 0, x, 0, q.length);
		return x;*/
		Object[] newV = new Object[dim];
		// copio tutti gli elementi mettendoli in newV a
		// partire dalla sua prima posizione
		// questo semplifica il calcolo dei nuovi indici
		for (int i = 0; i < size; i++)
		{	first = increment(first);     
			newV[i] = p[first];
		}
		first = newV.length - 1;
		last = size;
		return newV;
	}
	
	/**
      inserisce l'elemento specificato alla fine alla doppia coda
      @param element l'elemento da inserire
	*/
	//FATTO
	public void addLast(Object element){
		if(size == p.length){
			p = resize(p, 2*p.length);
		}
		
		if(size == 0){
			p[0] = element;
			first = p.length - 1;
			last = 1;
		}
		else{
			p[last] = element;
			last = increment(last);
		}
		size++;
	}

	/**
      ispeziona, ma non estrae, il primo elemento della doppia coda
      @return il primo elemento della doppia coda
      @throws EmptyDequeException se la coda doppia e' vuota
	*/
	//FATTO
	public Object getFirst() throws EmptyDequeException{
		if(isEmpty()){
			throw new EmptyDequeException();
		}
		return p[increment(first)];
	}

	/**
      ispeziona, ma non estrae, l'ultimo elemento della doppia coda
      @return l'ultimo elemento della doppia coda
      @throws EmptyDequeException se la coda doppia e' vuota
	*/
	//FATTO
	public Object getLast() throws EmptyDequeException{
		if(isEmpty()){
			throw new EmptyDequeException();
		}
		return p[decrement(last)];
	}

	/**
      ispeziona ed estrae il primo elemento della doppia coda
      @return il primo elemento della doppia coda
      @throws EmptyDequeException se la coda doppia e' vuota
	*/
	public Object removeFirst() throws EmptyDequeException{
		Object obj = getFirst();
		first = increment(first);
		size--;
		return obj;
	}
   
	/**
      ispeziona ed estrae l'ultimo elemento della doppia coda
      @return il primo elemento della doppia coda
      @throws EmptyDequeException se la coda doppia e' vuota
	*/
	public Object removeLast() throws EmptyDequeException{
		Object obj = getLast();
		last = decrement(last);
		size--;
		return obj;
	}
	//FATTO
	public String toString(){
		String s = "[";
		for(int i = 0; i < p.length; i++){
			s = s + " " + p[i];
		}
		return s + "]";


		/*String s = "[";
	   int j = increment(first);
	   for(int i=0; i<p.length; i++){
	      s+=p[j]+" ";
	      j = increment(j);
	   }
	   s+="]";
	   return s;*/
	}

}

class EmptyDequeException extends RuntimeException{}
