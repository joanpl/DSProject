public interface IStack<E> {

	public void push(E element);

	public E pop();

	public int find(E element);
	
	public E peek();
	
	public int size();
	
	

}