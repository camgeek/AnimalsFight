package animals_fihgt;

public class Dog extends Animal{
	
	String superAttackName = "Scoobidou";

	@Override
	protected int super_attack() {
		System.out.println("Super attack : "+this.superAttackName);
		return 20 + (int) ((Math.random() * (40)));
	}

	@Override
	public int attack() {
		int chance = (int)((Math.random() * (4)));
		if (chance == 3)
			return super_attack();
		else
			return this.attack;
	}

}
