//������ 960109

import java.util.Scanner; 

public class Test {
	
	public static void main (String[]args) {
		
		System.out.println("1���� 10������ ���� �Է��ϼ���.(�����Ϸ��� �ٸ� ������ �Է��ϼ���.)");
		
		while(true) {
			
			int input = 0;
			int i;
			int sum = 0;

			Scanner s = new Scanner(System.in);	

			input = s.nextInt();
			
			if (input > 10 || input < 1 ) {
		    	  System.out.println("���α׷��� �����մϴ�.");
		    	  break;
			}
			else {
				for(i=1 ; i<=10 ; i++) {
					sum += i;
					if (i==10) { 
						continue;
					}
				}
				System.out.println("1���� 10���� " + input + "��(��) ���� ���� ���� " + 
				(sum - input) + "�Դϴ�.");
			}
		}
	}
}