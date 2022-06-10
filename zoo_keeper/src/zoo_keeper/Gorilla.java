package zoo_keeper;

public class Gorilla extends Mammal {
	
	public Gorilla(){}
	
	public void throwSomething() {
		super.setEnergyLevel(getEnergyLevel()-5);
		System.out.println("The gorilla launched that");
	}
	
	public void eatBananas() {
		super.setEnergyLevel(getEnergyLevel()+10);
		System.out.println("This banana is bussin");
	}
	
	public void climb() {
		super.setEnergyLevel(getEnergyLevel()-10);
		System.out.println("Just climbed the tree, want me to do it again?");
	}
}
