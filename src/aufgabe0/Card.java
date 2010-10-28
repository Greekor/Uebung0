package aufgabe0;

public class Card {

	public static final int HERZ = 0;
	public static final int BLATT = 1;
	
	public static final int NEUN = 8;
	public static final int BUBE = 9;
	public static final int DAME = 10;
	public static final int KOENIG = 11;
	public static final int AS = 12;
	
	private int farbe;
	private int wert;
	
	public Card(int farbe, int wert) throws CardException {
	}
	
	public static boolean isValidCard(int farbe, int wert){
		return false;
	}
	
	public static Card cardFromInts(int farbe, int wert) throws CardException {
		return null;
	}
	
	@Override
	public boolean equals(Object o){
		return false;
	}
}
