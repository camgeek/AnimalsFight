package animals_fihgt;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args)
	{
		Game game = new Game();
		//game.start();
		
		Frame frame = new Frame();
		
		/*Player joueur = new Player();
		//System.out.println("test");
		Cat chat = new Cat();
		Dog chien = new Dog();
		Ferret furet = new Ferret();
		//attack_rand(chien, furet);
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		animals.add(chat);
		animals.add(chien);
		animals.add(furet);
		
		joueur.setAnimals(animals);
		
		for (Animal object: joueur.getAnimals()) {
			/*System.out.println(object.getLife());
			System.out.println(object.getAttack());
			System.out.println(object.attack());
		}*/
	}
	
	static public void attack_rand(Animal ani1,Animal ani2)
	{
		ani1.dammage(ani2.super_attack());
	}
}
