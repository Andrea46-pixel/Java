public class GrowingArrayQueue extends FixedArrayQueue{
	
	public void enqueue(Object obj){
		if(back == v.length){
			v = resize(v, 2*v.length);
		}
		super.enqueue(obj);
	}

	protected Object[] resize(Object[] obj, int dim){
		Object[] obj2 = new Object[dim];
		System.arraycopy(obj, 0, obj2, 0, obj.length);
		return obj2;
	}
	
}
