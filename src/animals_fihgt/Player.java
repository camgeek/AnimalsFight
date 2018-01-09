package animals_fihgt;

import java.util.ArrayList;

public class Player {
	
	String _name;
	ArrayList<Animal> animals;
	
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public ArrayList<Animal> getAnimals() {
		return animals;
	}
	public void setAnimals(ArrayList<Animal> animals) {
		this.animals = animals;
	}

}
