package nested_for_loop;

public class NestedForLoop {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
