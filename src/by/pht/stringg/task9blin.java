package by.pht.stringg;

public class task9blin {

	public static void main(String[] args) {		
		
		String stroka = "This method this returns the character this located";
		int j = 0;
		
		String[] mas = stroka.split(" "); {		
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i].equalsIgnoreCase("this") == true) {
				j++;
			}						
		}
		System.out.print(j);
		}
		
	}

}
