import java.util.*;

public class ColaCine extends LinkedList{
	public void push(Object ticket) {
		this.addFirst(ticket);
	}
	
	public Object pop() {
		return this.removeLast();
	}
}
