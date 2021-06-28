package DSImplementation;

public class StackImpl {
	int size;
	int Arr[];
	int top;

	StackImpl(int size) {
		this.size = size;
		this.top = -1;
		this.Arr = new int[size];
	}

	public boolean isEmpty() {
		return top == -1;

		// System.out.println("Stack is empty");

	}

	public boolean isFull() {
		return size - 1 == top;

		// System.out.println("Stack is full");
	}

	public int peek() {
		if (!isEmpty()) {
			return Arr[top];
		} else {
			System.out.println("Stack is empty");
		}
		return -1;

	}
	//timeComplexity:O (1)

	public void push(int Element) {
//check if the stack if full
		if (!isFull()) {

			top++;
			Arr[top] = Element;

			System.out.println("The pushed element is " + Element);
		}

	}
	public int pop() {
		if(!isEmpty()) {
			int returnedTop=top;
			top--;
			System.out.println("The popped element is " + Arr[returnedTop]);
			return returnedTop;
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}
		
		
	}
	public static void main(String[] args) {
		
		StackImpl si= new StackImpl(10);
		si.pop();
		si.push(20);
		si.push(30);
		si.push(40);
		si.pop();
		System.out.println(si.peek());
		

	}

}
