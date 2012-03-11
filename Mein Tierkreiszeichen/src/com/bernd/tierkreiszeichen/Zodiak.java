package com.bernd.tierkreiszeichen;

import java.util.Calendar;
import java.util.Hashtable;
//import java.util.Date;

public final class Zodiak extends Hashtable<Integer, Tierkreiszeichen> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2870926370666786466L;

	//private static final long serialVersionUID = 9;//TODO
	private static final Zodiak INSTANCE = new Zodiak(); //singleton
	
	private final Calendar cal;
	
	private Zodiak() {
		super(); //constructor von hashtable aufrufen
		cal = Calendar.getInstance();
		put(Calendar.JANUARY, new Tierkreiszeichen(21, Calendar.JANUARY,
				R.string.aquarius));
		put(Calendar.FEBRUARY, new Tierkreiszeichen(20, Calendar.FEBRUARY,
				R.string.pisces));
		put(Calendar.MARCH, new Tierkreiszeichen(21, Calendar.MARCH,
				R.string.aries));
		put(Calendar.APRIL, new Tierkreiszeichen(21, Calendar.APRIL,
				R.string.taurus));
		put(Calendar.MAY, new Tierkreiszeichen(22, Calendar.MAY,
				R.string.gemini));
		put(Calendar.JUNE, new Tierkreiszeichen(22, Calendar.JUNE,
				R.string.cancer));
		put(Calendar.JULY,
				new Tierkreiszeichen(24, Calendar.JULY, R.string.leo));
		put(Calendar.AUGUST, new Tierkreiszeichen(24, Calendar.AUGUST,
				R.string.virgo));
		put(Calendar.SEPTEMBER, new Tierkreiszeichen(24, Calendar.SEPTEMBER,
				R.string.libra));
		put(Calendar.OCTOBER, new Tierkreiszeichen(24, Calendar.OCTOBER,
				R.string.scorpius));
		put(Calendar.NOVEMBER, new Tierkreiszeichen(23, Calendar.NOVEMBER,
				R.string.sagittarius));
		put(Calendar.DECEMBER, new Tierkreiszeichen(22, Calendar.DECEMBER,
				R.string.capricornus));
	}
	
	public static Tierkreiszeichen getTierkreiszeichenFuerMonat(int monat) {
		return INSTANCE.get(monat);
	}
}
