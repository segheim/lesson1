package by.pht.stringg;

public class Main {

	public static void main(String[] args) {		
	
		String stroka = "This method returns the character located";
		char zamena;
		String k;
		
		String[] mas = stroka.split(" "); {		
		
		for (int i = 0; i < mas.length; i++) {
			zamena = mas[i].charAt(2);
			mas[i] = mas[i].replace(zamena, 'a');										
			//System.out.print(mas[i] + " ");
			
			k = mas[i] + " ";
			System.out.print(k);
			}
		}
	}
}
