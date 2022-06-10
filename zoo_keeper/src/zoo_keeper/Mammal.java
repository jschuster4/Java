package zoo_keeper;

public class Mammal {
	
	private int energyLevel; 
	
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	public Mammal(){ 
		this.energyLevel = 100;
	}
	public Mammal(int startingEnergy) {
		this.energyLevel = startingEnergy;
	}
	
	public int displayEnergy() {
		System.out.println(energyLevel);
		return energyLevel;
	}
}
