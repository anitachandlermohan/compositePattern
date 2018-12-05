package compositePattern;

import java.util.ArrayList;
import java.util.List;
//Composite Class
public class Department implements SantasWorkshop {
	private String departmentName;
	// Each Department contains multiple elves
	private List<Elf> listOfElves = new ArrayList<Elf>();
	
	public  Department(String vname) {
		this.departmentName = vname; 
	}
	 
	// sums number of toys made by each elf in department 
	public int numberOfToysMade() {
		return listOfElves.stream().mapToInt(Elf::numberOfToysMade).sum(); 
		 
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	
	public void addElf(Elf elf) {
		listOfElves.add(elf);
		
	}
	
	public void removeElf(Elf elf) {
		listOfElves.remove(elf);
		
	}

	
}


