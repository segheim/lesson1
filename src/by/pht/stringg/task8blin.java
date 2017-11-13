package by.pht.stringg;

public class task8blin {

	public static void main(String[] args) {
		
		
		String stroka = "This method (returns) the (character) located";
				
		String[] mas = stroka.split(" ");
			for(int i = 0; i<mas.length; i++) {
				if(mas[i].charAt(0) == '(') {
					mas[i] = "";
			}
				String k = mas[i] + " ";
				System.out.print(k);
		}
						
	}
	
	
	
	
	
					
}
