public class LinkedList implements Container{
	
	private ListNode head, tail;
	public LinkedList(){
		makeEmpty();
	}

	//FATTO
	public void addFirst(Object e){
		ListNode n = new ListNode();
		head.setElement(e);
		n.setNext(head);
		head = n;
	}
	
	//FATTO
	public void addLast(Object e){
		ListNode n = new ListNode();
		n.setElement(e);
		tail.setNext(n);
		tail = n;
	}
	
	//FATTO
	//rimuove il primo elemento e lo rimuove
	public Object removeFirst(){
		Object obj = getFirst();
		head = head.getNext();
		head.setElement(null);
		return obj;
		
	}
	
	//FATTO
	public Object removeLast(){
		Object obj = getLast();
		ListNode temp = head;
		while(temp.getNext() != tail){
			temp = temp.getNext();
		}
		tail = temp;
		tail.setNext(null);
		return obj;	
	}

	//FATTO
	//ritorna l'elemento del primo nodo	
	public Object getFirst(){
		if(isEmpty()){
			throw new EmptyLinkedListException();				//FARE L'ECCEZIONE
		}
		return head.getNext().getElement();
	}
	
	//FATTO
	//ritorna l'elemento dell'ultimo nodo
	public Object getLast(){
		if(isEmpty()){
			throw new EmptyLinkedListException();
		}
		return tail.getElement();
	}
	
	//FATTO
	public void makeEmpty(){
		head = new ListNode();
		tail = new ListNode();
	}
	//FATTO
	public boolean isEmpty(){
		return (head == tail);
	}

	//====================================================================
	private class ListNode{
		private Object element;
		private ListNode next;

		public ListNode(Object e, ListNode n){
			setElement(e);			
			setNext(n);
		}

		public ListNode(){
			element = null;
			next = null;
		}

		public Object getElement(){
			return element;
		}
		public ListNode getNext(){
			return next;
		}
		public void setElement(Object e){
			element = e;
		}
		public void setNext(ListNode n){
			next = n;
		}
	}
}
