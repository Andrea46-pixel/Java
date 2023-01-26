public class FixedArrayStack implements Stack{
	protected Object[] v;
	protected int vsize;

	public FixedArrayStack(){
		v = new Object[100];
		makeEmpty();
	}

	public void push(Object obj){
		if(vsize == v.length){
			throw new FullStackException();		
		}
		v[vsize] = obj;
		vsize++;
	}

	public Object pop(){
		Object obj = top();
		vsize--;
		return obj;
	}

	public Object top(){
		if(isEmpty()){
			throw new EmptyStackException();		
		}
		return v[vsize-1];
	}

	public boolean isEmpty(){
		return (vsize == 0);
	}

	public void makeEmpty(){
		vsize = 0;
	}
}
