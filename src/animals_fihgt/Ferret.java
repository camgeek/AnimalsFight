package animals_fihgt;

public class Ferret extends Animal{
	
	String superAttackName = "BoulePuante";

	@Override
	protected int super_attack() {
		System.out.println("Super attack : "+this.superAttackName);
		return 15 + (int)(15 + (Math.random() * (50 - 15)));
	}

	@Override
	public int attack() {
		int chance = (int)((Math.random() * (2)));
		if (chance == 1)
			return super_attack();
		else
			return this.attack;
	}

}
