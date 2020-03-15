package withSinglyLinkedList;

//Java program for linked-list implementation of queue 

//A linked list (LL) node to store a queue entry 
class QNode { 
	int key; 
	QNode next; 

	// constructor to create a new linked list node 
	public QNode(int key) 
	{ 
		this.key = key; 
		this.next = null; 
	} 
} 

//A class to represent a queue 
//The queue, front stores the front node of LL and rear stores the 
//last node of LL 
class Queue { 
	QNode front, rear; 

	public Queue() 
	{ 
		this.front = this.rear = null; 
	} 

	// Method to add an key to the queue. 
	void enqueue(int key) 
	{ 

		// Create a new LL node 
		QNode temp = new QNode(key); 

		// If queue is empty, then new node is front and rear both 
		if (rear == null) { 
			front = temp;
			rear = temp;
			
			return; 
		} 

		// Add the new node at the end of queue and change rear 
		rear.next = temp; 
		rear = temp; 
	} 

	// Method to remove an key from queue. 
	void dequeue() 
	{ 
		// If queue is empty, return NULL. 
		if (this.front == null) 
			return; 

		// Store previous front and move front one node ahead 
		QNode temp = front; 
		front = front.next; 

		// If front becomes NULL, then change rear also as NULL 
		if (this.front == null) 
			this.rear = null; 
	} 

	public void peek() {
		QNode node = front;
		System.out.println("Peek is returning : "+node.key);
	}
	public void display() {
		QNode node = front;
		
		while(node != rear) {
			System.out.println(node.key);
			node = node.next;
		}
		System.out.println(node.key);
	}
}
