package studio7;

public class Die {
	private int sides;
	
	public Die(int s) {
		sides = s;
	}
	
	public int throwDie() {
		return (int) (Math.random()*sides + 1);
	}
	
	public String toString() {
		return String.valueOf(this.throwDie());
	}
	

	public static void main(String[] args) {
		Die d1 = new Die (20);
		System.out.print(d1);
	}

}
