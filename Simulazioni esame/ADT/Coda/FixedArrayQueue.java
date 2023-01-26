public class FixedArrayQueue implements Queue{
	protected Object[] v;
	protected int front, back;	

	public FixedArrayQueue(){
		v = new Object[100];
		makeEmpty();
	}

	public Object dequeue(){
		Object obj2 = getFront();
		front++;
		return obj2;
	}

	public void enqueue(Object obj){
		if(front == v.length){
			throw new FullQueueException();	
		}
		v[back] = obj;
		back++;
	}

	public Object getFront(){
		if(isEmpty()){
			throw new EmptyQueueException();
		}
		return v[front];
	}

	public void makeEmpty(){
		front = 0;
		back = 0;
	}
	
	public boolean isEmpty(){
		return (front == back);
	}
}
