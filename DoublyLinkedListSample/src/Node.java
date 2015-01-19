package DoublyLinkedListSample;

class Node {

	public Object objectData;             // data item
   	public Node next;              // next link in list
   	public Node previous;          // previous link in list
	// -------------------------------------------------------------
   	public Node(Object obj) {          // constructor
    	objectData = obj;
    }
	// -------------------------------------------------------------
   	public void displayNode() {         // display this node
    	System.out.print(objectData + " ");
    }
}
