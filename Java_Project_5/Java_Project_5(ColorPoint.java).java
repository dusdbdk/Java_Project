//960109 ������

package ColorPoint;

public class ColorPoint extends Point implements AddInterface {
	String color;
	String makeStr, changePointStr, changeColorStr;
	
	ColorPoint() {
		super(0, 0);
		this.color = "WHITE";
	}
	
	ColorPoint(int x, int y, String Color){
		super(x, y);
		this.makeStr = "�����Ҷ� ���� " + Color + "������ " + "(" + x + "," + y + ")�� ���̰�\n";
	}
	
	public void setPoint(int x, int y) {
		super.move(x, y);
		this.changePointStr = "(" + x + "," + y + ")�̴�\n";
	}
	
	public void setColor(String color) {
		this.color = color;
		this.changeColorStr = "������ ���� " + color + " ������ ";
	}

	public void show() {
		if(changeColorStr != null && changePointStr != null) System.out.println(makeStr + changeColorStr + changePointStr);
		else System.out.println(makeStr);
	}
	
	public int add(int x, int y) {
		return x + y;
	}
}