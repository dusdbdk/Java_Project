public class Television {

	String TVName;
	boolean OnOff = true;
	int channel;
	int volume;
	int brightness;
	int resent_channel;
	
	public Television() {
	}	
	public void channelminus () {
		channel = channel -1;
		if (channel <= 0)
			channel = 199;
	}
	public void channelplus () {
		channel = channel +1;
		if (channel >= 200)
			channel = 1;
	}
	public void volumeup () {
		volume = volume +1;
		if (volume >= 100)
			volume = 100;
	}
	public void volumedown () {
		volume = volume -1;
		if (volume <= 0 )
			volume = 0;
	}
	public void brightup () {
		brightness = brightness +1;
		if (brightness >= 100 )
			brightness = 100;
	}
	public void brightdown () {
		brightness = brightness -1;
		if (brightness <= 0 )
			brightness = 0;
	}
	public static void main(String[] args) {
	Television Samsung = new Television();
	if (Samsung.OnOff = true) {
	Samsung.TVName = "�Ｚ";
	Samsung.channel = 198;
	Samsung.volume = 10;
	Samsung.brightness = 72;
	Samsung.resent_channel = 16;
	
	Samsung.channelplus();
	Samsung.channelplus();
	Samsung.channelplus();
	Samsung.volumeup();
	Samsung.volumeup();
	Samsung.volumeup();
	Samsung.volumeup();
	
	System.out.println(Samsung.TVName + "Ƽ���Դϴ�. ���� ü���� " + Samsung.channel +"���̰�, ������ "+ Samsung.volume
	+"�̸�, ����" + Samsung.brightness+", �ֱ� ü���� " + Samsung.resent_channel +"���Դϴ�.");
		}
	else {
		System.out.println("TV�� Ʋ���ּ���");
		}
	
	Television LG = new Television();
	LG.TVName = "LG";
	LG.channel = 2;
	LG.volume = 0;
	LG.brightness = 100;
	LG.resent_channel = 61;
	
	LG.channelminus();
	LG.channelminus();
	LG.channelminus();
	LG.channelminus();
	LG.volumedown();
	LG.volumeup();
	LG.volumeup();
	LG.volumeup();
	LG.volumeup();
	LG.volumeup();
	
	System.out.println(LG.TVName + "Ƽ���Դϴ�. ���� ü���� " + LG.channel +"���̰�, ������ "+ LG.volume
	+"�̸�, ����" + LG.brightness+", �ֱ� ü���� " + LG.resent_channel +"���Դϴ�.");

	}
}