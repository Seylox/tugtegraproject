package com.bernd.tierkreiszeichen;

import android.content.Context;

public final class Tierkreiszeichen {

	// Wann ein Sternzeichen beginnt == Eigenschaften des Objekts Tierkreiszeichen
	private final int tag, monat, tierkreiszeichen;
	
	//Constructor für Objekt Tierkreiszeichen
	public Tierkreiszeichen(int tag, int monat, int tierkreiszeichen) {
		super();
		this.tag = tag;
		this.monat = monat;
		this.tierkreiszeichen = tierkreiszeichen;
	}
	
	// getter und setter
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
	
	// Liefert einen Wert aus R.drawable
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
