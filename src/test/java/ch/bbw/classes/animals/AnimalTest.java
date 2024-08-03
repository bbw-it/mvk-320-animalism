package ch.bbw.classes.animals;

import java.util.List;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

class AnimalTest implements WithAssertions {

	@Test
	void elephantSample() {
		var elephant = new Elephant();
		assertThat(elephant.getNumberOfLegs()).isEqualTo(4);
		assertThat(elephant.canLiveInWater()).isFalse();
		assertThat(elephant.canLiveOnLand()).isTrue();
		assertThat(elephant.canLayEggs()).isFalse();
	}

	/**
	 * Erstelle eine neue <i>Dog</i> Klasse (unter src/main/java/...).
	 * Die Klasse soll von {@link Animal} erben.
	 */
	@Test
	void dog() {
		// TODO: write a test here, similar to elephantSample() above
	}

	/**
	 * Lektüre: https://java-tutorial.org/vererbung.html
	 * <br>
	 * Erstelle eine neue <i>Fish</i> Klasse (unter src/main/java/...).
	 * Die Klasse soll von {@link Animal} erben.
	 */
	@Test
	void fish() {
		// TODO: Entferne die Kommentare vom Test
		//var fish = new Fish();
		//assertThat(fish.getNumberOfLegs()).isEqualTo(0);
		//assertThat(fish.canLiveInWater()).isTrue();
		//assertThat(fish.canLiveOnLand()).isFalse();
		//assertThat(fish.canLayEggs()).isTrue();
	}

	/**
	 * Erstelle eine neue <i>Bird</i> Klasse (unter src/main/java/...).
	 * Die Klasse soll von {@link Animal} erben.
	 * Und natürlich legt ein Vogel Eier ...!
	 */
	@Test
	void bird() {
		// TODO: write a test here, similar to fish() above
	}

	/**
	 * Erstelle eine neue <i>Labrador</i> Klasse (unter src/main/java/...).
	 * Entferne die Kommentare vom Test:
	 */
	@Test
	void labrador() {
		// TODO: Entferne die Kommentare vom Test
		//var labrador = new Labrador();
		//assertThat(labrador instanceof Dog).isTrue();
		//assertThat(labrador instanceof Animal).isTrue();
		//assertThat(labrador instanceof Object).isTrue();
	}

	/**
	 * Lektüre: https://java-tutorial.org/interfaces.html
	 * <br>
	 * Erweitere Dog, Bird und Fish so, dass sie das interface {@link SoundMaking} implementieren.
	 * Vervollständige die Methode, sodass der Test grün wird (dazu musst du erst den Test verstehen).
	 */
	List<SoundMaking> getMusicians() {
		// TODO: add musicians to this list
		return List.of();
	}

	@Test
	void animalConcert() {
		// DO NOT EDIT THIS METHOD, edit the method above instead
		String concert = "";
		for (SoundMaking musician : getMusicians()) {
			var animalSound = musician.makeSound();
			if (musician.isLoud()) {
				animalSound = animalSound.toUpperCase() + "!";
			}
			concert += animalSound + " ";
		}
		assertThat(concert).isEqualTo("WAU! WAU! pips blupp WAU! ");
	}

	/**
	 * Wir wollen die Liste sortieren, sodass zuerst die leisen und danach die lauten
	 * Musikanten spielen. Siehe {@link SoundMaking#isLoud()}.
	 * Vervollständige die Methode, sodass der Test grün wird
	 * (beachte, dass die übergebene Liste evtl. unmodifizierbar ist).
	 */
	List<SoundMaking> sortMusicians(List<SoundMaking> unsorted) {
		// TODO: implement sorting here
		return unsorted;
	}

	@Test
	void animalConcertGettingLouder() {
		// DO NOT EDIT THIS METHOD, edit the method above instead
		assertThat(getMusicians()).map(SoundMaking::isLoud).containsExactly(true, true, false, false, true);
		assertThat(sortMusicians(getMusicians())).map(SoundMaking::isLoud).containsExactly(false, false, true, true, true);
	}

	/**
	 * Wir wollen diese Funktionalität der beiden letzten Methoden in eine neue Klasse <i>Concert</i> packen.
	 * - Erstelle diese neue Klasse.
	 * - Lass sie {@link SoundMaking} implementieren.
	 * Das <i>Concert</i> ist laut, wenn mindestens 1 Musikant laut ist.
	 * - Implementiere eine weitere Methode makeSoundSorted()
	 */
	@Test
	void concertAsClass() {
		// TODO: Entferne die Kommentare vom Test:
		//var concert = new Concert(List.of(new Bird(), new Bird()));
		//assertThat(concert.makeSound()).isEqualTo("pips pips ");
		//assertThat(concert.isLoud()).isFalse();
		//
		//var concert2 = new Concert(getMusicians());
		//assertThat(concert2.makeSound()).isEqualTo("WAU! WAU! pips blupp WAU! ");
		//assertThat(concert2.isLoud()).isTrue();
		//assertThat(concert2.makeSoundSorted()).isEqualTo("pips blupp WAU! WAU! WAU! ");
	}

	/**
	 * Lektüre: https://java-tutorial.org/modifikatoren.html
	 * <br>
	 * Schreib je eine Methode mit folgenden Modifikatoren in der <i>Dog</i> Klasse:
	 * - abstract
	 * - final
	 * - private
	 * - protected
	 * - public
	 * - static
	 * <br>
	 * → Was ist nicht möglich? Welche Methoden kann ich in <i>Labrador</i> überschreiben?
	 */
	// TODO: try it out...

	/**
	 * Im <i>Concert</i> haben wir die Sortierbarkeit in der Methode gemacht.
	 * Mit ein bisschen Objekt-Orientiertem Denken können wir das auch in der Klasse machen.
	 * Wir wollen nun Tiere direkt nach Anzahl Beine sortieren können.
	 * <br>
	 * <a href="https://java-tutorial.org/nutzung-mehrerer-interfaces.html">Lektüre</a>
	 * <br>
	 * <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html">Komplizierte Lektüre</a>
	 * <br>
	 * Erstelle ein neues Interface <i>HasLegs</i>.
	 * - Dieses Interface definiert eine neue Methode <i>int getNumberOfLegs()</i>
	 * (Per Zufall genau derselbe Name wie in {@link Animal#getNumberOfLegs()} :D).
	 * - Dieses Interface extended Comparable<HasLegs>.
	 * - Lass alle Tiere welche Animal extenden auch <i>HasLegs</i> implementieren.
	 */
	@Test
	void comparableLegs() {
		// TODO: Entferne die Kommentare vom Test
		//List<HasLegs> someAnimals = new ArrayList<>(List.of(new Labrador(), new Bird(), new Labrador(), new Fish()));
		//someAnimals.sort(Comparator.naturalOrder());
		//assertThat(someAnimals).map(HasLegs::getNumberOfLegs).containsExactly(0, 2, 4, 4);
	}

	/**
	 * Vermutlich wurde nun eine Methode compareTo(HasLegs) für alle Animals implementiert.
	 * Versuch das mit einer default-Methode zu vereinfachen.
	 * <br>
	 * Lektüre: https://www.baeldung.com/java-static-default-methods
	 */
	// TODO: use a default method
}
