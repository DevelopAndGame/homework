
public class Kontrol {
	


	public static void main(String[] args) {
		
		int boyut=7;
		
		for (int i = boyut; i > 0; i--) {
			
			for (int j = 0; j < i-1; j++) {
				System.out.print(" ");
			}
			
			for (int j = boyut+1; j > i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
