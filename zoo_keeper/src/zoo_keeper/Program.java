package zoo_keeper;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Gorilla gorilla1 = new Gorilla();
//		System.out.println(gorilla1.getEnergyLevel());
//		
//		gorilla1.throwSomething();
//		gorilla1.throwSomething();
//		gorilla1.throwSomething();
//		System.out.println(gorilla1.getEnergyLevel());
//		
//		gorilla1.eatBananas();
//		gorilla1.eatBananas();
//		System.out.println(gorilla1.getEnergyLevel());
//
//		gorilla1.climb();
//		System.out.println(gorilla1.getEnergyLevel());
		Bat bat1 = new Bat(); 
		System.out.println(bat1.getEnergyLevel());
		
		bat1.eatHumans();
		bat1.eatHumans();
		System.out.println(bat1.getEnergyLevel());
		
		bat1.attackTown();
		bat1.attackTown();
		bat1.attackTown();
		System.out.println(bat1.getEnergyLevel());

		bat1.fly();
		bat1.fly();
		System.out.println(bat1.getEnergyLevel());



	}
	
	

}
