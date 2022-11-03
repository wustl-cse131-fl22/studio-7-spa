package studio7;

public class ComplexNum {
	private double real;
	private double imaginary;
	
	public ComplexNum(double r, double i) {
		real = r;
		imaginary = i;
	}
	
	public ComplexNum add(ComplexNum c) {
		double r = this.real + c.real;
		double i = this.imaginary + c.imaginary;
		ComplexNum c1 = new ComplexNum(r, i);
		return c1;
	}
	
	public ComplexNum multiply(ComplexNum c) {
		double r = this.real*c.real - this.imaginary*c.imaginary;
		double i = this.real*c.imaginary + this.imaginary*c.real;
		ComplexNum c1 = new ComplexNum(r, i);
		return c1;
	}
	
	public String toString() {
		return String.valueOf(real) + " + " + String.valueOf(imaginary) + "i";
	}
	

	public static void main(String[] args) {
		ComplexNum c1 = new ComplexNum(3, 4);
		System.out.println(c1);

	}

}
