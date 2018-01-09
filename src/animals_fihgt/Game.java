package animals_fihgt;

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
	}
}
