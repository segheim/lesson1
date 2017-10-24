package l1;

import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter integer  0 to 9: ");
		int a = sc.nextInt();
		if ( a%2 == 0 ) {
			System.out.println("Number even!");
		}	
		if ( a%2 == 1) {
			System.out.println("Nember odd!");				
		}
	}

}
