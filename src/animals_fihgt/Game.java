package animals_fihgt;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	Player player = new Player();
	
	public void start()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenu dans le monde de olydri, Donne moi ton nom jeune bambin");
		String str = sc.nextLine();
		player.set_name(str);
		System.out.println(player.get_name()+" ho quelle beau nom");
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals = createWallet();
		player.setAnimals(animals);
		this.setNameAnimals(player);
		for (Animal object: player.getAnimals()) {
			System.out.println(object.get_name());
		}
	}
	
	public void setNameAnimals(Player player)
	{
		System.out.println("Tu viens de recevoir 5 pokém.. animaux il faut les nommées");
		Scanner sc = new Scanner(System.in);
		String str;
		for (Animal object: player.getAnimals())
		{
			System.out.println("Comment veut tu nommé ce manifique : "+object.getClass().getSimpleName());
			str = sc.nextLine();
			object.set_name(str);
		}
	}
	
	public ArrayList<Animal> createWallet()
	{
		ArrayList<Animal> animals = new ArrayList<Animal>();
		for (int i = 0; i < 5; i++)
		{
			animals.add(this.getRandomAnimal());
		}
		return animals;
	}
	
	public Animal getRandomAnimal()
	{
		int chance = (int)((Math.random() * (3)));
		switch (chance) {
		case 0:
			Dog dog = new Dog();
			return dog;
		case 1:
			Cat cat = new Cat();
			return cat;
		case 2:
			Ferret ferret = new Ferret();
			return ferret;
		default:
			Cat defaultAni = new Cat();
			return defaultAni;
		}
	}
}
