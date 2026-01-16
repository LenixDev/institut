package espace;

public class Surface {
	private static int calcule(int a, int b) {
		return (a + b) * 2;
	}
	
	public static void main(String[] arg) {
		int surface = calcule(5, 6);
		int rectangle = new Rectangle(2, 4);
		System.out.println(rectangle);
		System.out.print(rectangle);
	}
}
