public class Airplain {
	
	String AirplainName;
	int velocity;
	int height;
	int temperature;
	int ETA;	//Estimated Time of Arrival(도착 예정 시간)

	public void speedUp() {			//메소드
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
			System.out.println("저희 비행기는 20분이내로 도착 예정입니다.");
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
		
		KoreanAir.AirplainName = "대한항공";
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
		System.out.println("저희 " + KoreanAir.AirplainName +"을 이용해주시는 고객님들께 안내드립니다. 현재 저희 비행기는 시속 " 
		+ KoreanAir.velocity + "km 이고, 고도는 " + KoreanAir.height +"m 이며, 바깥 기온은 섭씨" + KoreanAir.temperature +"도 입니다.");
	
	
		Airplain AsianaAir = new Airplain();
		
		AsianaAir.AirplainName = "아시아나항공";
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

		
		System.out.println("저희 " + AsianaAir.AirplainName +"을 이용해주시는 고객님들께 안내드립니다. 현재 저희 비행기는 시속 " 
		+ AsianaAir.velocity + "km 이고, 고도는 " + AsianaAir.height +"m 이며, 바깥 기온은 섭씨" +AsianaAir.temperature +"도 입니다.");
		AsianaAir.Notice();
	}
}