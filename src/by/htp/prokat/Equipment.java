package by.htp.prokat;

public abstract class Equipment {
	
	private Category category;
	private String title;
	
	public Equipment(Category category, String title){
		this.category = category;
		this.title = title;
	}
	
	
	
	@Override
	public String toString() {
		return "Equipment [category=" + category + ", title=" + title + "]";
	}
	
	

}
