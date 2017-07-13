public class Example {
	
	public static void main(String[] args) {
		
		int boyut=11;
		
		
		for (int i = boyut; i > 0; i--) {
			
			for (int j = 0; j < (int) (Math.abs(i-((boyut+1)/2))); j++) {
				System.out.print(" ");
			}
			
			for (int p = boyut; p >(int) (Math.abs(2*(i-((boyut+1)/2)))); p--) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}

}
