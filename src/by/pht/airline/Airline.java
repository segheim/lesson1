package by.pht.airline;

public class Airline {
	
	private Aircraft[] airbuss;
	private int allp;
	private int i = 0;
		
	public Airline(int number) {	
		airbuss = new Aircraft[number];	
	}
	
		public void addAircraft(Aircraft s) {
			if ( s != null && i<airbuss.length ) {
				airbuss[i] = s; 
				i++;
				
			} else {
				System.out.println("Full airbus!");
			}
		}
		
		public void ListAircraft() {
			for (i = 0; i<airbuss.length; i++) {
				
				if (airbuss[i] != null) {				
					System.out.println(airbuss[i]);
				}
			}
		}
	
	
		/*public void allPass() {		
			for (i=0; i<airbuss.length; i++) {
				allp += p;
			
		}
		
	}
*/
	

}
