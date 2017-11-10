package by.htp.prokat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RentStation a = new RentStation(10);
		
		Equipment eq1 = new Bike(Category.SUMMER, "јист");
		RentUnit unit1 = new RentUnit(120, eq1);
		
		Equipment eq2 = new Bike(Category.SUMMER, "Giant");
		RentUnit unit2 = new RentUnit(150, eq2);
		
		Equipment eq3 = new Bike(Category.SUMMER, "ява");
		RentUnit unit3 = new RentUnit(180, eq3);
		
		Equipment eq4 = new Roller(Category.SUMMER, "Fora");
		RentUnit unit4 = new RentUnit(30, eq4);
		
		Equipment eq5 = new Roller(Category.SUMMER, "Rollerblade");
		RentUnit unit5 = new RentUnit(50, eq5);
		
		Equipment eq6 = new Snowbord(Category.WINTER, "Lobster");
		RentUnit unit6 = new RentUnit(180, eq6);
		
		Equipment eq7 = new Snowbord(Category.WINTER, "Burton");
		RentUnit unit7 = new RentUnit(210, eq7);
		
		Equipment eq8 = new Skiing(Category.WINTER, "Atomic");
		RentUnit unit8 = new RentUnit(150, eq8);
		
		Equipment eq9 = new Skiing(Category.WINTER, "Fischer");
		RentUnit unit9 = new RentUnit(200, eq9);
		
		Equipment eq10 = new Skiing(Category.WINTER, "Rossignol");
		RentUnit unit10 = new RentUnit(190, eq10);
		
		a.addUnit(unit1);
		a.addUnit(unit2);
		a.addUnit(unit3);
		a.addUnit(unit4);
		a.addUnit(unit5);
		a.addUnit(unit6);
		a.addUnit(unit7);
		a.addUnit(unit8);
		a.addUnit(unit9);
		a.addUnit(unit10);
				
		a.printcatalog();
		
		

	}

	}


