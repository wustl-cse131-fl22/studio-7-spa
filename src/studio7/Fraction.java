package studio7;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction (int n, int d) {
		numerator = n;
		denominator = d;
	}
	
	private int gcd(int p, int q) {
		if (p%q == 0) {
			return q;
		} else {
			q = gcd(q, p%q);
		}
		return q;
	}
	
	public Fraction simplify() {
		int x = gcd(this.numerator, this.denominator);
		Fraction f1 = new Fraction(this.numerator/x, this.denominator/x);
		return f1;
	}
	
	public Fraction add(Fraction f) {
		int n = this.numerator * f.denominator + this.denominator*f.numerator;
		int d = this.denominator * f.denominator;
		Fraction f1 = new Fraction (n, d);
		return f1.simplify();
	}
	
	public Fraction multiply(Fraction f) {
		int n = this.numerator * f.numerator;
		int d = this.denominator * f.denominator;
		Fraction f1 = new Fraction(n, d);
		return f1.simplify();
	}
	
	public Fraction reciprocal() {
		Fraction f1 = new Fraction(this.denominator, this.numerator);
		return f1;
	}
	
	public String toString() {
		String n = String.valueOf(numerator);
		String d = String.valueOf(denominator);
		return n + "/" + d;
	}
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction (6, 18);
		Fraction f2 = new Fraction (12, 52);
		Fraction f3 = f1.multiply(f2);
		System.out.print(f3);
	}
	

}
