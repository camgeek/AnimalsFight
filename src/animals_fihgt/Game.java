package animals_fihgt;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	Player player = new Player();
	
	public void start()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenu dans le monde d'olydri, Donne moi ton nom jeune bambin");
		String str = sc.nextLine();
		player.set_name(str);
		System.out.println(player.get_name()+" ho quelle beau nom");
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals = createWallet();
		player.setAnimals(animals);
		this.setNameAnimals(player);
		this.gameLoop(player);
		this.ending(player);
	}
	
	public void ending(Player player)
	{
		System.out.println("Vous n'avez plus d'animaux il sont tous mort au combat");
		System.out.println("Merci : "+ player.get_name()+" d'avoir participer cette partie");
	}
	
	public void gameLoop(Player player)
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		while (player.getAnimals().size() != 0)
		{
			this.checkDead(player);
			System.out.println("Choissiez votre animal");
			for (int i = 0;i < player.getAnimals().size(); i++)
			{
				System.out.println(player.getAnimals().get(i).get_name() + "taper : " + i);
			}
			choice = sc.nextInt();
			this.combat(player, choice);
			this.checkDead(player);
		}
	}
	
	public void combat(Player player, int choice)
	{
		Animal enemy = this.getRandomAnimal();
		while (enemy.getLife() > 0 && player.getAnimals().get(choice).getLife() > 0)
		{
			System.out.println("Le terrible combat commence !");
			System.out.println("Vous attaquer l'ennemie");
			enemy.dammage(player.getAnimals().get(choice).attack());
			System.out.println("L'ennemie vous attaque");
			player.getAnimals().get(choice).dammage(enemy.attack());
			System.out.println("Ennemie a encore : "+ enemy.getLife()+" PV");
			System.out.println(player.getAnimals().get(choice).get_name() +
					" A  encore : "+ player.getAnimals().get(choice).getLife()+" PV");
		}
	}
	
	public void checkDead(Player player)
	{
		for (int i = 0;i < player.getAnimals().size();i++)
		{
			if (player.getAnimals().get(i).getLife() <= 0)
			{
				player.getAnimals().remove(i);
			}
		}
	}
	
	public void setNameAnimals(Player player)
	{
		System.out.println("Tu viens de recevoir 5 poké.. animaux, il faut les nommées");
		Scanner sc = new Scanner(System.in);
		String str;
		for (Animal object: player.getAnimals())
		{
			System.out.println("Comment veux-tu nommer ce manifique : "+object.getClass().getSimpleName());
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
