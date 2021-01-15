
public class BooleanExpression {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 2;
		
		boolean firstBoolean = !((a!=b) && (b>c));
		boolean secondBoolean = ((a==b) || (b<=c));
		
		System.out.println("First: " + firstBoolean + '\n' + "Second: " + secondBoolean);

	}

}
