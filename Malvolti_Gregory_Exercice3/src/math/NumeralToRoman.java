package math;

public class NumeralToRoman {
	public String getRomanBase(int nombre) {
		String romannb = "";
		if(nombre == 1)
			return romannb="I";
		if(nombre == 10)
			return romannb="X";
		if(nombre == 5)
			return romannb="V";
		if(nombre == 50)
			return romannb = "L";
		if(nombre == 100)
			return romannb = "C";
		if(nombre == 500)
			return romannb = "D";
		if(nombre == 1000)
			return romannb = "M";
		return romannb;
	}
	
	public String getRoman(int nombre) {
		String nombreRomain = "";
		return nombreRomain;
	}
}
