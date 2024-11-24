
public class Array {

	private int arr[];
	private int size;
	
	public Array(int size) {
		this.size = size;
		arr = new int[size];
		System.out.println("Array of size " + size + " got created.");
	}
	
	public void insert(int pos, int element) {
		arr[pos] = element;
	}
	
	public void delete(int pos) {
		arr[pos] = 0;
	}
	
	public void display() {
		System.out.print("Array elemets are: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	public int get(int index) {
		if (index >= 0 && index < arr.length) {
			return arr[index];
		} else {
			return 0;
		}
	}
}
