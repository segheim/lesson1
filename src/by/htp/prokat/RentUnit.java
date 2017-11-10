package by.htp.prokat;

public class RentUnit{
	
	private int cost;
	private Equipment equipmentItem;
	
	public RentUnit(int cost, Equipment equipmentItem){
		this.cost = cost;
		this.equipmentItem = equipmentItem;
	}

	@Override
	public String toString() {
		return "RentUnit [cost=" + cost + ", equipmentItem=" + equipmentItem
				+ "]";
	}
	
	

}
