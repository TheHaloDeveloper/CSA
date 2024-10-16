import java.util.Scanner; 

public class TriangleRunner {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter side A ::  ");
		int a = keyboard.nextInt();

		System.out.print("Enter side B ::  ");
		int b = keyboard.nextInt();

		System.out.print("Enter side C ::  ");
		int c = keyboard.nextInt();

		Triangle test = new Triangle(a, b, c);
		test.calcPerimeter();
		System.out.println(test.getArea());
	}
}