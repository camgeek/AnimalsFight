package animals_fihgt;

public class Main {
	public static void main(String[] args)
	{
		System.out.println("test");
		Cat chat = new Cat();
		Dog chien = new Dog();
		Ferret furet = new Ferret();
		//chat.setLife(50);
		System.out.println(chat.getLife());
		System.out.println(chien.getLife());
		System.out.println(furet.getLife());
	}
}
