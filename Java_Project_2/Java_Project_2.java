public class air_conditioner {
	int fan_level;
	int temperature;
	boolean revolve;
	String air_conditionerName;
	String Name;
	
	public void turnup() {
		this.temperature = temperature -1 ;
			if (temperature < 18)
				temperature = 18;
	}

	public void turndown() {
		temperature = temperature +1 ;
			if (temperature >= 31)
				temperature = 30;
	}
	
	public void fan_levelUp() {
		fan_level = fan_level +1 ;
			if (fan_level > 3)
				fan_level = 3;
	}
	
	public void fan_levelDown() {
		fan_level = fan_level -1 ;
			if (fan_level <= 0)
				fan_level = 0;
	}
	
	public void stop () {
		fan_level = 0;
	}
		
	public void Mode () {
	if (revolve = true) {
		System.out.println("회전 모드입니다");
		}
	}
	
	public air_conditioner() {
	}
	
	public air_conditioner(String Name) {
		air_conditionerName = Name;
	}

	public air_conditioner(int temperature, int fan_level, String air_conditoinerName) {
		this.temperature = temperature;
		this.fan_level = fan_level;
		air_conditionerName = Name;
	}
	
	public static void main(String[] args) {
		air_conditioner MyAir_con = new air_conditioner();
		MyAir_con.air_conditionerName = "휘센";
		MyAir_con.temperature = 26;
		MyAir_con.turnup();
		MyAir_con.fan_levelUp();
		MyAir_con.fan_levelUp();
		System.out.println(MyAir_con.air_conditionerName + " 입니다. 현재 희망온도는 " + MyAir_con.temperature + "도, 바람세기는 " + MyAir_con.fan_level + "단 입니다.");
		MyAir_con.Mode ();
		
	
		air_conditioner MyAir_con1 = new air_conditioner("ThinkQ");
		MyAir_con1.temperature = 26;
		MyAir_con1.turndown();
		MyAir_con1.turndown();
		MyAir_con1.fan_levelUp();
		System.out.println(MyAir_con1.air_conditionerName + " 입니다. 현재 희망온도는 " + MyAir_con1.temperature + "도, 바람세기는 " + MyAir_con1.fan_level + "단 입니다.");
		
		air_conditioner MyAir_con2 = new air_conditioner("캐리어에어컨");
		
		MyAir_con2.temperature = 26;
		MyAir_con2.fan_levelUp();
		MyAir_con2.fan_levelUp();
		MyAir_con2.fan_levelUp();
		MyAir_con2.turnup();
		MyAir_con2.turnup();
		MyAir_con2.turnup();
		MyAir_con2.turnup();
		MyAir_con2.turnup();
		MyAir_con2.turnup();
		MyAir_con2.turnup();
		MyAir_con2.turnup();
		MyAir_con2.turnup();
		MyAir_con2.turnup();
		MyAir_con2.turnup();
		MyAir_con2.turnup();
		MyAir_con2.turnup();
		System.out.println(MyAir_con2.air_conditionerName + " 입니다. 현재 희망온도는 " +  MyAir_con2.temperature + "도, 바람 세기는 " + MyAir_con2.fan_level + "단 입니다.");
	}
}