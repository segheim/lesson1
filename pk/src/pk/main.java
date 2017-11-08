package pk;

public class main {

	public static void main(String[] args) {
		
		
		processor p = new processor("i3");
		ram rr = new ram(12);
		monitor m = new monitor("Siemens");
		winchester w = new winchester(1000);
		
		computer compik = new computer(p, rr, m, w);
		
		compik.printwin();
		
		compik.offcomp();
		
		compik.oncomp();
		
		compik.viryscomp();
		

	}

}
