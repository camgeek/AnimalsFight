package animals_fihgt;

public class Ferret extends Animal{

	@Override
	public int super_attack() {
		return 15 + (int)(15 + (Math.random() * (50 - 15)));
	}

}
