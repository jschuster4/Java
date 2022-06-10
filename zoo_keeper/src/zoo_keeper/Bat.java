package zoo_keeper;

public class Bat extends Mammal {

	public Bat(){
		super.setEnergyLevel(300);
	}
	
	public void fly() {
		super.setEnergyLevel(getEnergyLevel()-50);
		System.out.println("Whhhooooosshh the bat took off");
	}
	
	public void eatHumans() {
		super.setEnergyLevel(getEnergyLevel()+25);
		System.out.println("This tastes like chicken");
	}
	
	public void attackTown() {
		super.setEnergyLevel(getEnergyLevel()-100);
		System.out.println("Time to smite this town");
	}
}
