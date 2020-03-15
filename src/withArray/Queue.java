package withArray;

public class Queue {

	int capacity = 5;
	int  queue[] = new int[capacity];
	int front;
	int rear;
	
	public void enQueue(int data) {

		// check queue is full or not 
        if (capacity == rear) { 
            System.out.printf("\nQueue is full\n"); 
            return;
        } 
        // insert element at the rear 
        else {
            queue[rear] = data; 
            rear++;
        }
	}
	
	public void deQueue() {
		/*
		 * int data; data = queue[front]; front++; size--;
		 */
		
		// if queue is empty 
        if (front == rear) { 
            System.out.printf("\nQueue is empty\n"); 
            return; 
        } 
  
        // shift all the elements from index 2 till rear 
        // to the right by one 
        else { 
            for (int i = 0; i <= rear - 1; i++) { 
                queue[i] = queue[i + 1]; 
            } 
  
            // store 0 at rear indicating there's no element 
			/*
			 * if (rear < capacity) queue[rear] = 0; //make original position empty
			 */  
            // decrement rear 
            rear--; 
        } 
        return;
	}
	
	int peek() {
		return queue[front];
	}
	
	public void show() {
		System.out.print("Elements "+" ");
		/*
		 * for(int i = 0; i< size; i++) { System.out.print(queue[front+i]+" "); }
		 */
		
		for (int i = front; i < rear; i++) { 
            System.out.printf(" %d <-- ", queue[i]); 
        }
		System.out.println();
		for(int n: queue) {
			System.out.println(n +" ");
		}
	}

	public static void main(String[] args) {
		Queue arraYQueue = new Queue();
		
		arraYQueue.enQueue(5);
		arraYQueue.enQueue(10);
		/*
		 * arraYQueue.enQueue(10); arraYQueue.enQueue(10); arraYQueue.enQueue(10);
		 */
		
		 arraYQueue.deQueue();
		//arraYQueue.enQueue(10);
		 System.out.println("Front: "+ arraYQueue.peek());
		arraYQueue.show();
	}
}
