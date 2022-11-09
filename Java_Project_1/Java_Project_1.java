//김준혁 960109

import java.util.Scanner; 

public class Test {
	
	public static void main (String[]args) {
		
		System.out.println("1에서 10사이의 수를 입력하세요.(종료하려면 다른 정수를 입력하세요.)");
		
		while(true) {
			
			int input = 0;
			int i;
			int sum = 0;

			Scanner s = new Scanner(System.in);	

			input = s.nextInt();
			
			if (input > 10 || input < 1 ) {
		    	  System.out.println("프로그램을 종료합니다.");
		    	  break;
			}
			else {
				for(i=1 ; i<=10 ; i++) {
					sum += i;
					if (i==10) { 
						continue;
					}
				}
				System.out.println("1에서 10까지 " + input + "을(를) 빼고 합한 수는 " + 
				(sum - input) + "입니다.");
			}
		}
	}
}