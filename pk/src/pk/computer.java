package pk;

public class computer {
	
	private processor proce;
	private ram ozy;
	private monitor monik;
	private winchester winn;
	
	public computer(processor proce, ram ozy, monitor monik, winchester winn) {
		this.proce = proce;
		this.ozy = ozy;
		this.monik = monik;
		this.winn = winn;
	}
	
	public void oncomp() {
		System.out.println("Computer is working!");
	}
	
	public void offcomp() {
		System.out.println("Computer is sleeping!");
	}
	
	public void viryscomp() {
		System.out.println("Computer is seeking viryses!");
	}
	
	public void printwin() {
		System.out.println("Wintchester, Gb: " + winn);
	}

	
}
