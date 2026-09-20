package javaConcepts;

public class LoopNested {

	public static void main(String[] args) {

		for (int a=0; a<=5; a++) {
			for(int b=0; b<=5; b++) {
				System.out.print(a+""+b+" ");
			}
			System.out.println();
		}
		
		System.out.println("============================");
		
		int c = 0;
		
		while(c<=9) {
			int d = 0;
			while(d<=9) {
				System.out.print(c+""+d+" ");
				d++;
			}
			System.out.println();
			c++;
		}

		System.out.println("============================");
		
		for(int x=0; x<=5;x++) {
			for(int y=0; y<=5;y++) {
				for(int z=0; z<=5; z++) {
					System.out.print(x+""+y+z+" ");
				}
				System.out.println();
			}
		}
		
		System.out.println("============================");
		
		int e = 0;
		while(e<=9) {
			int f=0;
			while(f<=9) {
				int g=0;
				while(g<=9) {
					System.out.print(e+""+f+g+" ");
					g++;
				}
				f++;
				System.out.println();
			}
			e++;
		}
		
		
		
		
		
	}

}
