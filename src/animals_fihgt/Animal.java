package animals_fihgt;

public abstract class Animal {

	 String _name;
	 int life = (int) (20 + (Math.random() * (800 - 400)));
	 int attack = (int) ((Math.random() * (30)));
	 String superAttackName;
	 
	 
    protected abstract int super_attack();
    
    public abstract int attack();
    
    public void dammage(int attack)
    {
    	this.life -= attack;
    }
	 
	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}
}
