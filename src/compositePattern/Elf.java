package compositePattern;

public class Elf implements SantasWorkshop {
	
	
	private String elfName;
	private int numberOfToysMade;
	
	
	public Elf (String vname, int vtoysMade) {
		this.elfName = vname;
		this.numberOfToysMade = vtoysMade;	
	}
	public int numberOfToysMade() {
		return numberOfToysMade;
	}
	 public String getElfName() {
		 return elfName;
	 }
}
