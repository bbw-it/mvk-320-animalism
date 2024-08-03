package ch.bbw.classes.animals;

public class Elephant extends Animal {

	public Elephant() {
		super(4);
	}

	@Override
	public boolean canLiveInWater() {
		return false;
	}
}
