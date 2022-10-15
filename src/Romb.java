import java.lang.Math;

public class Romb extends Czworokat{

	Romb(double bok1, double bok2, double bok3, double bok4, double kat) {
		super(bok1, bok2, bok3, bok4, kat);
		
	}

	@Override
	double Obwod() {
		
		return 4*bok1;
	}

	@Override
	double Pole() {
		
		return bok1*bok1*Math.sin(Math.toRadians(kat));
	}

	
	
}
