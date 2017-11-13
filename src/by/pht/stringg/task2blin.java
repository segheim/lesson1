package by.pht.stringg;

public class task2blin {

	public static void main(String[] args) {
		
		int quantity = 0;
		String stroka = ",For more information, see the Java documentation on String";
		String str = stroka.trim().toLowerCase();		
					
		char[] masword = str.toCharArray();
			
		for (int i = 0; i<masword.length; i++) {
			System.out.print("  " + masword[i] + "  ");
		}
		System.out.println("\n");
			
		for(quantity = 0; quantity<masword.length; quantity++) {
			int num = Character.codePointAt(masword, quantity);
			if((num-96)> 0) {
			System.out.print("  " + (num - 96) + "  ");
			}else 
				System.out.print("  ");
		}
	}
		
}


