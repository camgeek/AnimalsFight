package animals_fihgt;

public class Cat extends Animal{
	
	@Override
	public int super_attack() {
		return 30 + (int) ((Math.random() * (20)));
	}
	
}
