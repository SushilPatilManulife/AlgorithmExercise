package LinkedList;

public class LinkedList {
	Link newLink, first, next=null, prev=null;
	private static int count=0;
	public LinkedList() {
		super();
		this.first = null;
	}

	public void insertData(int data) {
		newLink = new Link(data);
		newLink.next = first;
		first = newLink;
		count++;
	}
	
	public void reverse(Link first){
		Link current=first;
		while(current!=null) {
			next=current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		first = prev;
		display(first);
	}
	public void display(Link node) {
		Link curr = node;
		while(curr!=null) {
			curr.displayLink();
			curr = curr.next;
		}
	}
	public void displayMidElement(Link node) {
		Link curr = node;
		for(int i=0; i<(count/2); i++) {
			curr = curr.next;
		}
		curr.displayLink();
	}
	
}
