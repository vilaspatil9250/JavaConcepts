package javaConcepts;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		
		String products [] []= {
				{"Mobile", "Samsung", "S-10", "In Stock"},
				{"Laptop", "Dell", "D-20", "In Stock"},
				{"Camera", "Canon", "DSLR", "Out of Stock"},
				{"Watch", "Boat", "Wave call", "In Stock"},
		};
		
		System.out.println(products[1][1]);

		System.out.println("===================================");
		
		for(int i=0; i<=3; i++) {
			for(int j=0; j<=3; j++) {
				System.out.print(products[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("===================================");
	}

}
