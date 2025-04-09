package curso_programacao;

public class Rectangle {
	double Whidth;
	double Height;
	
	
	public double Area() {
		double A =  Whidth * Height;
		return A;
	}
	public double Perimeter() {
		double P = 2*(Whidth * Height);
		return P;
	}
	public double Diagonal() {
		Whidth *= 2;
		Height *= 2;
		double D = Math.sqrt(Whidth + Height );
		return D;
	}
	

	public String toString() {
		return "Area = "
				+ Area()
				+ Perimeter()
				+ Diagonal();
	}
	
	
}
