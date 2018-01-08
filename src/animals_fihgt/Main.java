package animals_fihgt;

public class Main {
	public static void main(String[] args)
	{
		System.out.println("test");
		Cat chat = new Cat();
		Dog chien = new Dog();
		Ferret furet = new Ferret();
		attack_rand(chien, furet);
		System.out.println(chat.getLife());
		System.out.println(chien.getLife());
		System.out.println(furet.getLife());
		System.out.println(chat.getAttack());
		System.out.println(chien.getAttack());
		System.out.println(furet.getAttack());
	}
	
	static public void attack_rand(Animal ani1,Animal ani2)
	{
		ani1.dammage(ani2.super_attack());
	}
}
