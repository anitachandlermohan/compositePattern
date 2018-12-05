package compositePattern;

public class Main {

	public static void main(String[] args) {
		Department stuffedToysDepartment = new Department("Stuffed Toys");
		Elf Buddy = new Elf("Buddy",30);
		Elf Dobby = new Elf("Dobby", 150);
		Elf Legolas = new Elf("Legolas", 2);
		Elf Darren = new Elf("Darren", 56);
		
		stuffedToysDepartment.addElf(Buddy);
		stuffedToysDepartment.addElf(Dobby);
		stuffedToysDepartment.addElf(Legolas);
		stuffedToysDepartment.addElf(Darren);
		
		
		Buddy.numberOfToysMade();
		stuffedToysDepartment.numberOfToysMade();
		
		

	}

}
