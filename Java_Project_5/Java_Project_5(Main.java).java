package ColorPoint;

public class Main {

	int x, y, Color;
	
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setPoint(10, 20);
		cp.setColor("GREEN");
		cp.show();

		ColorPoint adder = new ColorPoint();
		System.out.println("인터페이스에서 두 점을 받아서 합친 합은 " + adder.add(5, 10));
	}
}