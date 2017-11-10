package by.htp.prokat;

public class RentStation {
	
	private RentUnit units[];
	private int unitcount = 0;
	
	public RentStation (int number) {
		units = new RentUnit[number];
	}
	
	public void addUnit(RentUnit unit) {
		if(unit != null && unitcount < units.length){
			units[unitcount] = unit;
			unitcount++;
		}
		else
		{
			System.out.println("Full Equipments!");
		}
		//units[0] = unit;
	}
	
	public void printcatalog(){
		
		for (int i = 0; i<units.length; i++) {
			
			if(units[i] != null){				
				System.out.println(units[i]);
			}
			
			
		
		}
	}
	
}
