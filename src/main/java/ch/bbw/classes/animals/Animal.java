package ch.bbw.classes.animals;

public abstract class Animal {
	// NEVER CHANGE THIS CLASS, even if it would be convenient :)

	private final int numberOfLegs;

	protected Animal(int numberOfLegs) {
		if (numberOfLegs < 0) {
			throw new IllegalArgumentException("legs must be positive, got " + numberOfLegs);
		}
		this.numberOfLegs = numberOfLegs;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public boolean canLayEggs() {
		return false;
	}

	public boolean canLiveOnLand() {
		return !canLiveInWater();
	}

	public abstract boolean canLiveInWater();
}
