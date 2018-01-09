package animals_fihgt;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args)
	{
		//System.out.println("test");
		Cat chat = new Cat();
		Dog chien = new Dog();
		Ferret furet = new Ferret();
		//attack_rand(chien, furet);
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		animals.add(chat);
		animals.add(chien);
		animals.add(furet);
		
		for (Animal object: animals) {
			/*System.out.println(object.getLife());
			System.out.println(object.getAttack());*/
			System.out.println(object.attack());
		}
	}
	
	static public void attack_rand(Animal ani1,Animal ani2)
	{
		ani1.dammage(ani2.super_attack());
	}
}
