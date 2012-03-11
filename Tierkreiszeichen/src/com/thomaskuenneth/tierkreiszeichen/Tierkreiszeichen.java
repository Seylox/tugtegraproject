/**
 * Tierkreiszeichen.java
 * 
 * (c) Thomas Künneth 2010
 * Alle Rechte beim Autor.
 */
package com.thomaskuenneth.tierkreiszeichen;

import android.content.Context;

/**
 * Diese Klasse speichert Informationen über ein Tierkreiszeichen:
 * <ul>
 * <li>erster Tag des Datumsbereichs, den es abdeckt</li>
 * <li>Monat, in dem dieser Bereich beginnt</li>
 * <li>eine Zahl, die das Sternzeichnen kennzeichnet</li>
 * </ul>
 * <p>
 * Die Methode {@link #getIdForDrawable()} liefert einen Wert, der für das
 * Zeichnen des Tierkreiszeichens verwendet werden kann. Damit das funktioniert,
 * muss das Sternzeichen aus {@code R.string} belegt werden,
 * 
 * @author Thomas Künneth
 * @see Zodiak
 * 
 */
public final class Tierkreiszeichen {

	// Wann ein Sternzeichen beginnt
	private final int tag, monat, tierkreiszeichen;

	public Tierkreiszeichen(int tag, int monat, int tierkreiszeichen) {
		super();
		this.tag = tag;
		this.monat = monat;
		this.tierkreiszeichen = tierkreiszeichen;
	}

	// Java-typische Getter und Setter
	
	public int getTag() {
		return tag;
	}

	public int getMonat() {
		return monat;
	}

	public int getTierkreiszeichen() {
		return tierkreiszeichen;
	}

	public String getName(Context context) {
		return context.getString(getTierkreiszeichen());
	}

	/**
	 * Liefert einen Wert aus {@code R.drawable}, der für das Zeichnen des
	 * Sternzeichens verwendet werden kann.
	 * 
	 * @return Wert aus {@code R.drawable}
	 */
	public int getIdForDrawable() {
		switch (getTierkreiszeichen()) {
		case R.string.aquarius:
			return R.drawable.aquarius;
		case R.string.aries:
			return R.drawable.aries;
		case R.string.cancer:
			return R.drawable.cancer;
		case R.string.capricornus:
			return R.drawable.capricornus;
		case R.string.gemini:
			return R.drawable.gemini;
		case R.string.leo:
			return R.drawable.leo;
		case R.string.libra:
			return R.drawable.libra;
		case R.string.pisces:
			return R.drawable.pisces;
		case R.string.sagittarius:
			return R.drawable.sagittarius;
		case R.string.scorpius:
			return R.drawable.scorpius;
		case R.string.taurus:
			return R.drawable.taurus;
		case R.string.virgo:
			return R.drawable.virgo;
		}
		// ggf. ein Standardbild liefern
		return R.drawable.icon;
	}
}
