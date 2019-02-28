package math;

public class RomanAdditioner extends RomanToNumeral {
	public String compute(String chaine) {
		int nombre1 = getNumeral(chaine);
		int nombre2 = getNumeral(chaine);
		
		int result = nombre1 + nombre2;
		chaine = getRoman(result);
 		return chaine;
	}
}
