package ColorPoint;

public class Main {

	int x, y, Color;
	
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setPoint(10, 20);
		cp.setColor("GREEN");
		cp.show();

		ColorPoint adder = new ColorPoint();
		System.out.println("�������̽����� �� ���� �޾Ƽ� ��ģ ���� " + adder.add(5, 10));
	}
}