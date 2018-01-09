package animals_fihgt;

public class Cat extends Animal{
	
	String superAttackName = "CalinChatPotté";
	
	@Override
	protected int super_attack() {
		System.out.println("Super attack : "+this.superAttackName);
		return 30 + (int) ((Math.random() * (20)));
	}

	@Override
	public int attack() {
		int chance = (int)((Math.random() * (3)));
		if (chance == 2)
			return super_attack();
		else
			return this.attack;
	}
	
}
