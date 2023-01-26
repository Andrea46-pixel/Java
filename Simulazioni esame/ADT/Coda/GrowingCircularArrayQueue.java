public class GrowingCircularArrayQueue extends FixedCircularArrayQueue{
	public void enqueue(Object obj){
		v = resize(v, 2*v.length);
		
		//se si ridimensiona l'array e la zona utile della coda si trova attorno alla sua fine, la seconda metà del nuovo
		//array rimane vuota e provoca un malfunzionamento della coda, che si risolve spostandovi la parte della coda che
		//si trova all'inizio dell'array
		if(back < front){
			System.arraycopy(v, 0, v, v.length/2, back);
			back += v.length/2;
		}
		super.enqueue(obj);
	}

	protected Object[] resize(Object[] obj, int dim){
		Object[] obj2 = new Object[dim];
		System.arraycopy(obj, 0, obj2, 0, obj.length);
		return obj2;
	}
}
