public class IndexQueue<T> implements QueueI<T> {

	private IndexedListI<T> list;

	public IndexQueue() {
		list = new SingleLinkedList<T>();
	}

	@Override
	public void enqueue(T newEntry) {
		list.add(newEntry);
	}

	@Override
	public T dequeue() {
		T result = list.remove(0);
		return result;
	}

	@Override
	public T getFront() {
		return list.get(0);
	}

	@Override
	public boolean isEmpty() {

		return list.isEmpty();
	}

	@Override
	public void clear() {
		list.clear();

	}

}
