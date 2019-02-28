package math;

public class RomanToNumeral {
	public int getNombreDeBase(char c) {
		Integer nombre = 0;
		if(c == 'I') {
			nombre = 1;
			return nombre;
		}
		if(c == 'V') {
			nombre = 5;
			return nombre;
		}
		if(c == 'X') {
			nombre = 10;
			return nombre;
		}
		if(c == 'L') {
			nombre = 50;
			return nombre;
		}
		if(c == 'C') {
			nombre = 100;
			return nombre;
		}
		if(c == 'D') {
			nombre = 500;
			return nombre;
		}
		if(c == 'M') {
			nombre = 1000;
			return nombre;
		}
		return nombre;
	}
	
	
	
	public int getNumeral(String nbRomain) {
		int nombre = 0;
		int n =1;
		for(int i=0; i<=nbRomain.length()-1; i++) {
			if(getNombreDeBase(nbRomain.charAt(i)) >= nombre ) {
				nombre += getNombreDeBase(nbRomain.charAt(i));
			}
			else if (n%1 == 0 && nbRomain.charAt(i) == 'I' || nbRomain.charAt(i) == 'X' || nbRomain.charAt(i) == 'C') {
				n = n +  1;
				nombre -= getNombreDeBase(nbRomain.charAt(i));
			}
			else {
				nombre += getNombreDeBase(nbRomain.charAt(i));
			}
				
		}
		return nombre;
	}
}
