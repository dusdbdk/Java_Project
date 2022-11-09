//960109 김준혁

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
		this.makeStr = "생성할때 색은 " + Color + "색으로 " + "(" + x + "," + y + ")의 점이고\n";
	}
	
	public void setPoint(int x, int y) {
		super.move(x, y);
		this.changePointStr = "(" + x + "," + y + ")이다\n";
	}
	
	public void setColor(String color) {
		this.color = color;
		this.changeColorStr = "움직인 점은 " + color + " 색으로 ";
	}

	public void show() {
		if(changeColorStr != null && changePointStr != null) System.out.println(makeStr + changeColorStr + changePointStr);
		else System.out.println(makeStr);
	}
	
	public int add(int x, int y) {
		return x + y;
	}
}