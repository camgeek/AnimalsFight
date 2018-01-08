package animals_fihgt;

public class Dog extends Animal{

	@Override
	public int super_attack() {
		return 20 + (int) ((Math.random() * (40)));
	}

}
