public class Airplain {
	
	String AirplainName;
	int velocity;
	int height;
	int temperature;
	int ETA;	//Estimated Time of Arrival(���� ���� �ð�)

	public void speedUp() {			//�޼ҵ�
		velocity = velocity + 10;
		height = height + 110 ;
	}
	public void speedDown() {
		velocity = velocity - 10;
		height = height - 110;
		if (velocity < 0)
			velocity = 0;
		if (height < 0)
			height = 0;
	}
	public void Notice() {
		if (ETA < 20) {
			System.out.println("���� ������ 20���̳��� ���� �����Դϴ�.");
		}
	}
	public void height( ) {
		this.height = height;
	}
	public void temperature() {
		temperature = -(height) / 200;
	}
	
	public static void main(String[] args) {
		Airplain KoreanAir = new Airplain();
		
		KoreanAir.AirplainName = "�����װ�";
		KoreanAir.velocity = 0;
		KoreanAir.height = 0;
		KoreanAir.ETA = 1200;
		
		KoreanAir.speedUp();		KoreanAir.speedUp();
		KoreanAir.speedUp();		KoreanAir.speedUp();
		KoreanAir.speedUp();		KoreanAir.speedUp();
		KoreanAir.speedUp();		KoreanAir.speedUp();
		KoreanAir.speedUp();		KoreanAir.speedUp();
		KoreanAir.speedUp();		KoreanAir.speedUp();
		KoreanAir.speedUp();		KoreanAir.speedUp();
		KoreanAir.speedUp();		KoreanAir.speedUp();
		KoreanAir.speedUp();		KoreanAir.speedUp();
		KoreanAir.speedUp();		KoreanAir.speedUp();
		KoreanAir.speedUp();		KoreanAir.speedUp();
		KoreanAir.speedUp();		KoreanAir.speedUp();
		KoreanAir.speedUp();		KoreanAir.speedUp();
		KoreanAir.speedUp();		KoreanAir.speedUp();
		KoreanAir.speedUp();		KoreanAir.speedUp();
		KoreanAir.speedUp();		KoreanAir.speedUp();
		KoreanAir.speedUp();		KoreanAir.speedUp();
		KoreanAir.speedUp();		KoreanAir.speedUp();
		KoreanAir.speedUp();		KoreanAir.speedUp();
		KoreanAir.speedUp();		KoreanAir.speedUp();
		KoreanAir.speedUp();		KoreanAir.speedUp();
		System.out.println("���� " + KoreanAir.AirplainName +"�� �̿����ֽô� ���Ե鲲 �ȳ��帳�ϴ�. ���� ���� ������ �ü� " 
		+ KoreanAir.velocity + "km �̰�, ���� " + KoreanAir.height +"m �̸�, �ٱ� ����� ����" + KoreanAir.temperature +"�� �Դϴ�.");
	
	
		Airplain AsianaAir = new Airplain();
		
		AsianaAir.AirplainName = "�ƽþƳ��װ�";
		AsianaAir.velocity = 300;
		AsianaAir.height = 3300;
		AsianaAir.ETA = 15;
		
		AsianaAir.speedDown();	AsianaAir.speedDown();
		AsianaAir.speedDown();	AsianaAir.speedDown();
		AsianaAir.speedDown();	AsianaAir.speedDown();
		AsianaAir.speedDown();	AsianaAir.speedDown();
		AsianaAir.speedDown();	AsianaAir.speedDown();
		AsianaAir.speedDown();	AsianaAir.speedDown();
		AsianaAir.speedDown();	AsianaAir.speedDown();
		AsianaAir.speedDown();	AsianaAir.speedDown();
		AsianaAir.speedDown();	AsianaAir.speedDown();
		AsianaAir.speedDown();	AsianaAir.speedDown();
		
		AsianaAir.temperature();

		
		System.out.println("���� " + AsianaAir.AirplainName +"�� �̿����ֽô� ���Ե鲲 �ȳ��帳�ϴ�. ���� ���� ������ �ü� " 
		+ AsianaAir.velocity + "km �̰�, ���� " + AsianaAir.height +"m �̸�, �ٱ� ����� ����" +AsianaAir.temperature +"�� �Դϴ�.");
		AsianaAir.Notice();
	}
}