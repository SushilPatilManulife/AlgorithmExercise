package LinkedList;

public class Link {
	int data;
	Link next;
	public Link(int data) {
		super();
		this.data = data;
	}
	public void displayLink() {
		System.out.print("["+data+"]");
	}
}
