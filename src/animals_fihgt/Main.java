package animals_fihgt;

public class Main {
	public static void main(String[] args)
	{
		System.out.println("test");
		Cat chat = new Cat();
		Dog chien = new Dog();
		Ferret furet = new Ferret();
		System.out.println(chat.getLife());
		System.out.println(chien.getLife());
		System.out.println(furet.getLife());
		System.out.println(chat.getAttack());
		System.out.println(chien.getAttack());
		System.out.println(furet.getAttack());
	}
}
