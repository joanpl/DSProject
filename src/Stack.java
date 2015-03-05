import java.util.LinkedList;


public class Stack<E> implements IStack<E> {
	
	private LinkedList<E> stack;
	
	private int size;
	
	
	public Stack() {
		stack = new LinkedList<E>();
		size = 0;
	}
	
	/* (non-Javadoc)
	 * @see IStack#push(E)
	 */
	@Override
	public void push(E element){ 
		stack.add(element);
		size++;
	}
	
	/* (non-Javadoc)
	 * @see IStack#pop()
	 */
	@Override
	public E pop() { 
		if(size < 1) {
			throw new IndexOutOfBoundsException("The stack is already empty");
		}
		E element = stack.pop();
		size--;
		return element;
		
	}
	
	/* (non-Javadoc)
	 * @see IStack#find(E)
	 */
	@Override
	public int find(E element) {
		return stack.indexOf(element);
	}

	

	@Override
	public E peek() {
		
		return stack.peek();
	}

	@Override
	public int size() {		
		return size;
	};
	
	
	
	

}
