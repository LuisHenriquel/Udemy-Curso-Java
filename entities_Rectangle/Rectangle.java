package entities_Rectangle;

public class Rectangle {
		public double Whidth;
		public double Height;
		
		
		public double Area() {
			return Whidth * Height;
			
		}
		public double Perimeter() {
			return  2*(Whidth + Height);
			
		}
		public double Diagonal() {
			return Math.sqrt(Math.pow(Whidth, 2) + Math.pow(Height, 2));
			
		}
		

		public String toString() {
			return "Area = "
					+ String.format("%.2f%n", Area())
					+"PERIMETER = " 
					+ String.format("%.2f%n", Perimeter())
					+"DIAGONAL = "   
					+ String.format("%.2f", Diagonal())
					;
		}
		
		
}


